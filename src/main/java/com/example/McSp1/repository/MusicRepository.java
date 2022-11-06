package com.example.McSp1.repository;

import com.example.McSp1.domain.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicRepository extends JpaRepository<Music, Integer> {
    public List<Music> findByTrackId(int trackId);
    public List<Music> findByTrackArtist(String trackArtist);

}
