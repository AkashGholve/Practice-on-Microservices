package com.practiceMicro.PHotelService.controllers;

import com.practiceMicro.PHotelService.entities.HotelEntity;
import com.practiceMicro.PHotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping
    public ResponseEntity<HotelEntity> createNewHotel(@RequestBody HotelEntity hotel) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(hotelService.createHotel(hotel));
    }

    @GetMapping
    public ResponseEntity<List<HotelEntity>> getAllHotels() {
        return ResponseEntity.ok(hotelService.getAllHotels());
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<HotelEntity> getSingleHotel(@PathVariable String hotelId) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(hotelService.getSingleHotel(hotelId));
    }

//    @PutMapping("/{hotelId}")
//    public ResponseEntity<HotelEntity> updateHotel(
//            @PathVariable String hotelId,
//            @RequestBody HotelEntity hotelDetails) {
//
//        HotelEntity updatedHotel = hotelService.updateHotel(hotelId, hotelDetails);
//
//        return ResponseEntity.status(HttpStatus.OK).body(updatedHotel);
//    }


}
