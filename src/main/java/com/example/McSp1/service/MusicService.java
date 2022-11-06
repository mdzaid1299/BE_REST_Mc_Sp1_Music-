package com.example.McSp1.service;

import com.example.McSp1.domain.Music;

import java.util.List;

public interface MusicService {
    public Music addMusic(Music music);
    public List<Music> getAllMusic();
    public boolean deleteMusicById(int trackId);
    public List<Music> getMusicByTrackId(int trackId);
    public List<Music> getMusicByArtist(String artistName);
    public Music updateMusicByTrackId(Music music ,int trackId);
}
