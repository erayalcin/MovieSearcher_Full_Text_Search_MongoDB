package com.mongodbFts.MongoDbFTS;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "media")
public class Media {

    @Id
    private String id;

    private String showId;
    private String type;
    private String title;
    private String director;
    private String casts;
    private String country;
    private Date dateAdded;
    private int release_year;
    private String rating;
    private String duration;
    private String genres;
    private String description;

    // Constructors, getters, and setters

    public Media() {
    }

    public Media(String showId, String type, String title, String director, String casts, String country, Date dateAdded, int release_year, String rating, String duration, String genres, String description) {
        this.showId = showId;
        this.type = type;
        this.title = title;
        this.director = director;
        this.casts = casts;
        this.country = country;
        this.dateAdded = dateAdded;
        this.release_year = release_year;
        this.rating = rating;
        this.duration = duration;
        this.genres = genres;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCasts() {
        return casts;
    }

    public void setCasts(String casts) {
        this.casts = casts;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public int getReleaseYear() {
        return release_year;
    }

    public void setReleaseYear(int releaseYear) {
        this.release_year = releaseYear;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Media{" +
                "id='" + id + '\'' +
                ", showId='" + showId + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", casts='" + casts + '\'' +
                ", country='" + country + '\'' +
                ", dateAdded=" + dateAdded +
                ", releaseYear=" + release_year +
                ", rating='" + rating + '\'' +
                ", duration='" + duration + '\'' +
                ", genres=" + genres+
                ", description='" + description + '\'' +
                '}';
    }
}
