package com.seanxie.hotelreservation.repository;

import com.seanxie.hotelreservation.entity.ReservationEntity;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<ReservationEntity, Long> {
}