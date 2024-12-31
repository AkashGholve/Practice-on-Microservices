package com.practiceMicro.PHotelService.services;

import com.practiceMicro.PHotelService.entities.HotelEntity;
import com.practiceMicro.PHotelService.exceptions.ResourceNotFoundException;
import com.practiceMicro.PHotelService.repos.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public HotelEntity createHotel(HotelEntity hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<HotelEntity> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public HotelEntity getSingleHotel(String hotelId) {
        return hotelRepository.findById(hotelId).orElseThrow(
                () -> new ResourceNotFoundException("Hotel not found with id: " + hotelId));
    }



}//
