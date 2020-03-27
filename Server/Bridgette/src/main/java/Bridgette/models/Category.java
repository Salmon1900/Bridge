package Bridgette.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="t_categories")
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="category_id")
    @JsonProperty
    private Integer id;

    @Column(name="category_name")
    @JsonProperty
    private String name;

    @OneToMany(mappedBy="category")
    @JsonIgnore
    private List<Video> videos;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Video> getVideos() {
        return videos;
    }
}
