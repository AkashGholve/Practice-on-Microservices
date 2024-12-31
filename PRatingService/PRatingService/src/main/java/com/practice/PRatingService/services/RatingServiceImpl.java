package com.practice.PRatingService.services;

import com.practice.PRatingService.entities.RatingEntity;
import com.practice.PRatingService.exceptions.ResourceNotFoundException;
import com.practice.PRatingService.repos.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public RatingEntity createRating(RatingEntity ratingEntity) {
        String ratingId = UUID.randomUUID().toString();
        ratingEntity.setRatingId(ratingId);
        return ratingRepository.save(ratingEntity);
    }

    @Override
    public List<RatingEntity> getRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<RatingEntity> getRatingByUserId(String userId) {
        return Optional.ofNullable(ratingRepository.findByUserId(userId))
                .filter(ratings -> !ratings.isEmpty())
                .orElseThrow(() -> new ResourceNotFoundException("Ratings not found for userId: " + userId));
    }

    @Override
    public List<RatingEntity> getRatingByHotelId(String hotelId) {
        return Optional.ofNullable(ratingRepository.findByHotelId(hotelId))
                .filter(ratings -> !ratings.isEmpty())
                .orElseThrow(()-> new ResourceNotFoundException("Ratings not found for hotelId: " + hotelId));
    }
}
