package Bridgette.services;

import Bridgette.models.Video;
import Bridgette.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {
    @Autowired
    private VideoRepository videoRepository;

    public List<Video> getAll() {
        return this.videoRepository.findAll();
    }
}
