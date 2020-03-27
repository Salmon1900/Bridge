package Bridgette.services;

import Bridgette.models.Category;
import Bridgette.models.Video;
import Bridgette.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll() {
        return this.categoryRepository.findAll();
    }

    public List<Video> getVideosByCategory(int id) {
        Optional<Category> category = this.categoryRepository.findById(id);

        if (category.isPresent()) {
            return category.get().getVideos();
        } else {
            return new ArrayList<>();
        }
    }
}
