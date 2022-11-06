package com.example.McSp1.controller;

import com.example.McSp1.domain.Music;
import com.example.McSp1.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/musicdata/app")
public class MusicController {

    MusicService musicService;
    @Autowired
    MusicController(MusicService musicService){
        this.musicService = musicService;

    }
    @PostMapping("/postmusic")
    public ResponseEntity<?> addMusic(@RequestBody  Music music){
        return new ResponseEntity<>(musicService.addMusic(music), HttpStatus.CREATED);
    }

    @GetMapping("/getallmusic")
    public ResponseEntity<?> getAllMusic(){
        return new ResponseEntity<>(musicService.getAllMusic(),HttpStatus.FOUND);
    }


    @GetMapping("/getmusicbyid/{trackId}")
    public ResponseEntity<?> getMusicByTrackId(@PathVariable int trackId){
        return new ResponseEntity<>(musicService.getMusicByTrackId(trackId),HttpStatus.FOUND);
    }

    @GetMapping("/getmusicbyartist/{trackArtist}")
    public ResponseEntity<?> getMusicByArtist(@PathVariable String trackArtist){
        return new ResponseEntity<>(musicService.getMusicByArtist(trackArtist),HttpStatus.FOUND);
    }

    @DeleteMapping("deletemusicbyid/{trackId}")
    public ResponseEntity<?> deleteMusicById(@PathVariable int trackId){
        return new ResponseEntity<>(musicService.deleteMusicById(trackId),HttpStatus.OK);
    }

    @PutMapping("/updatemusicbyid/{trackId}")
    public ResponseEntity<?> updateMusic(@RequestBody Music music,@PathVariable int trackId){
        return  new ResponseEntity<>(musicService.updateMusicByTrackId(music,trackId),HttpStatus.OK);
    }

}
