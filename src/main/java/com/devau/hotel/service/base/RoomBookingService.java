package com.devau.hotel.service;


import com.devau.hotel.entity.RoomBooking;

import java.util.List;

public interface RoomBookingService {
    public List<RoomBooking> findAll();
    public RoomBooking findById(int id);
    public RoomBooking save(RoomBooking roomBooking);
    public void deleteById(int id);
    public void update(RoomBooking roomBooking, int id);
}
