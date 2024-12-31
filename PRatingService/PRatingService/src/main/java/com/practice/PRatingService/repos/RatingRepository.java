package com.practice.PRatingService.repos;

import com.practice.PRatingService.entities.RatingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<RatingEntity, String> {

    //add custom methods if needed
    List<RatingEntity> findByHotelId(String userId);

    List<RatingEntity> findByUserId(String userId);

}
