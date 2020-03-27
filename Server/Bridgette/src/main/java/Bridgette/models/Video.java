package Bridgette.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name="t_videos")
public class Video {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="video_id")
    @JsonProperty
    private Integer id;

    @ManyToOne
    @JoinColumn(name="category_id")
    @JsonIgnoreProperties({"name", "videos"})
    private Category category;

    @Column(name="title")
    @JsonProperty
    private String title;

    @Column(name="description")
    @JsonProperty
    private String desc;

    @Column(name="yt_link")
    @JsonProperty
    private String link;

    public Integer id() {
        return id;
    }

    public Category category() {
        return category;
    }

    public String title() {
        return title;
    }

    public String desc() {
        return desc;
    }

    public String link() {
        return link;
    }
}
