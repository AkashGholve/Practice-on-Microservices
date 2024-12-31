package com.practice.PRatingService.services;


import com.practice.PRatingService.entities.RatingEntity;

import java.util.List;

public interface RatingService {

    RatingEntity createRating(RatingEntity ratingEntity);

    List<RatingEntity> getRatings();

    List<RatingEntity> getRatingByUserId(String userId);

    List<RatingEntity> getRatingByHotelId(String userId);

}
