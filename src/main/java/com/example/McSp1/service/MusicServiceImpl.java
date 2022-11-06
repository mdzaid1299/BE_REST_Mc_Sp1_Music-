package com.example.McSp1.service;

import com.example.McSp1.domain.Music;
import com.example.McSp1.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusicServiceImpl implements MusicService{

   MusicRepository musicRepository;

    @Autowired
     MusicServiceImpl(MusicRepository musicRepository){
         this.musicRepository = musicRepository;
     }

    @Override
    public Music addMusic(Music music) {
        return musicRepository.save(music);
    }

    @Override
    public List<Music> getAllMusic() {
        return musicRepository.findAll();
    }

    @Override
    public boolean deleteMusicById(int trackId) {
        musicRepository.deleteById(trackId);
        return true;
    }

    @Override
    public List<Music> getMusicByTrackId(int trackId) {
        return musicRepository.findByTrackId(trackId);
    }

    @Override
    public List<Music> getMusicByArtist(String artistName) {
        return musicRepository.findByTrackArtist(artistName);
    }

    @Override
    public Music updateMusicByTrackId(Music music ,int trackId) {
        Optional<Music> optionalMusic = musicRepository.findById(trackId);
        if(optionalMusic.isEmpty()){
            return null;
        }
        Music musicObj = optionalMusic.get();
        if(musicObj.getTrackName()!=null){
            musicObj.setTrackName(music.getTrackName());
        }
        if(musicObj.getTrackComments()!=null){
            musicObj.setTrackComments(music.getTrackComments());
        }
        if(musicObj.getTrackArtist()!=null){
            musicObj.setTrackArtist(music.getTrackArtist());
        }
        if(musicObj.getTrackRating()!=0){
            musicObj.setTrackRating(music.getTrackRating());
        }
        return musicRepository.save(musicObj);
    }
}
