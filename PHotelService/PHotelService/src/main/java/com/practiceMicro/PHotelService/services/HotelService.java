package com.practiceMicro.PHotelService.services;


import com.practiceMicro.PHotelService.entities.HotelEntity;

import java.util.List;

public interface HotelService {

    HotelEntity createHotel(HotelEntity hotel);

    List<HotelEntity> getAllHotels();

    HotelEntity getSingleHotel(String hotelId);

//    HotelEntity updateHotel(String hotelId, HotelEntity hotelDetails);

}
