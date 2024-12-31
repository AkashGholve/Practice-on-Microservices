package com.practiceMicro.PUserService.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//@EqualsAndHashCode
public class RatingEntity {

    @Id
    private String ratingId;
    private String userId;
    private String hotelId;
    private String rating;
    private String feedBack;

    

    public RatingEntity() {
    }

    public RatingEntity(String ratingId, String userId, String hotelId, String rating, String feedBack) {
        this.ratingId = ratingId;
        this.userId = userId;
        this.hotelId = hotelId;
        this.rating = rating;
        this.feedBack = feedBack;
    }

    public String getRatingId() {
        return ratingId;
    }

    public void setRatingId(String ratingId) {
        this.ratingId = ratingId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(String feedBack) {
        this.feedBack = feedBack;
    }
}
