package Bridgette.Controlles;

import Bridgette.models.Video;
import Bridgette.services.CategoryService;
import Bridgette.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/videos")
@CrossOrigin
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
        } catch (Exception e) {
            return new ArrayList();
        }
    }

    @GetMapping("/title/{title}")
    public Video getByTitle(@PathVariable String title) {
        return this.videoService.getByTitle(title);
    }

    @PostMapping("/new")
    public void addVideo(@RequestBody Video video) {
        this.videoService.add(video);
    }

    @DeleteMapping("/remove")
    public void removeVideo ( @RequestBody Video video) {
        this.videoService.delete(video.id());
    }

}
