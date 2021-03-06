package com.venkat.booking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Srijan on 10-12-2016.
 */

@Repository
public interface BookingRepository extends JpaRepository<HotelBooking, Long>{
    List<HotelBooking> findByPricePerNightLessThan(double price);
}
