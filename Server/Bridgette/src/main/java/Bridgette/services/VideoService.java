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

    public Video getByTitle(String title) {
        List<Video> videos = this.videoRepository.findByTitle(title);
        if (!videos.isEmpty()) {
            return videos.get(0);
        } else {
            return null;
        }
    }

    public void add(Video video) {
        this.videoRepository.save(video);
    }

    public void delete(int id) {
        this.videoRepository.deleteById(id);
    }
}
