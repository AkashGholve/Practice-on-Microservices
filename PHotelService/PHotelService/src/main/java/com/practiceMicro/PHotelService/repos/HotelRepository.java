package com.practiceMicro.PHotelService.repos;

import com.practiceMicro.PHotelService.entities.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<HotelEntity, String> {
}
