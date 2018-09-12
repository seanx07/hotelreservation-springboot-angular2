package com.seanxie.hotelreservation.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.seanxie.hotelreservation.entity.RoomEntity;

public interface RoomRepository extends CrudRepository<RoomEntity, Long> {
	
	RoomEntity findById(Long id);
}
