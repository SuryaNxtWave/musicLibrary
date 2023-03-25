package com.example.song.repository;
import com.example.song.model.Song;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SongJpaRepository extends JpaRepository<Song,Integer>{

}

