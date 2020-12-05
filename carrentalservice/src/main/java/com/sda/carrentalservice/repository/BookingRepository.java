package com.sda.carrentalservice.repository;

import com.sda.carrentalservice.entity.Booking;
import com.sda.carrentalservice.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    @Query("From Booking booking where lower(booking.dateOfBooking) like '%:bookingName%'")
    Car findCarByName(@Param("bookingName") String bookingName);
}
