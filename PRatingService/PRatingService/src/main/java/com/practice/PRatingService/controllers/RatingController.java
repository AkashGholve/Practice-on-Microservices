package com.practice.PRatingService.controllers;

import com.practice.PRatingService.entities.RatingEntity;
import com.practice.PRatingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping
    public ResponseEntity<RatingEntity>  create(@RequestBody RatingEntity rating){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ratingService.createRating(rating));
    }

    @GetMapping
    public ResponseEntity<List<RatingEntity>> getRatings() {
        return ResponseEntity.ok(ratingService.getRatings());
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<RatingEntity>> getRatingByUser(@PathVariable String userId){
        return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<RatingEntity>> getRatingByHotelId(@PathVariable String hotelId){
        return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
    }

}
