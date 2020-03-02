package com.devau.hotel.service;

import com.devau.hotel.entity.RoomBooking;
import com.devau.hotel.repository.RoomBookingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@Service
public class RoomBookingServiceImpl implements RoomBookingService {
    private final RoomBookingRepository roomBookingRepository;

    public RoomBookingServiceImpl(RoomBookingRepository roomBookingRepository) {
        this.roomBookingRepository = roomBookingRepository;
    }

    @Override
    public List<RoomBooking> findAll() {
        return this.roomBookingRepository.findAll();
    }

    @Override
    public RoomBooking findById(int id) {
        return this.roomBookingRepository.getOne(id);
    }

    @Transactional
    @Override
    public RoomBooking save(RoomBooking roomBooking) {
        return this.roomBookingRepository.save(roomBooking);
    }

    @Override
    public void deleteById(int id) {
        this.roomBookingRepository.deleteById(id);

    }

    @Transactional
    @Override
    public void update(RoomBooking roomBooking, int id) {
        if (roomBooking.getRoomId()!=id){
            throw new RuntimeException("id ler eşleşmedi");
        }
        this.roomBookingRepository.save(roomBooking);

    }
}
