package Bridgette.Controlles;

import Bridgette.models.Video;
import Bridgette.services.CategoryService;
import Bridgette.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/videos")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all")
    public List<Video> getAll() {
        return this.videoService.getAll();
    }

    @GetMapping("/category/{catId}")
    public List<Video> getByCategory(@PathVariable String catId) {
        try {
            int id = Integer.parseInt(catId);
            return this.categoryService.getVideosByCategory(id);
        } catch(Exception e) {
            return new ArrayList();
        }
    }
}
