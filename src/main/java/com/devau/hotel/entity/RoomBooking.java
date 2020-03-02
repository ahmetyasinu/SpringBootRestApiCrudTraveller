package com.devau.hotel.entity;

import javax.persistence.*;

@Entity
@Table(name = "roomBooking")
public class RoomBooking {
    @Column(name = "nameSurname")
    private String nameSurname;
    @Column(name = "tc")
    private int tc;
    @Column(name = "email")
    private String email;
    @Column(name = "telNumber")
    private int telNumber;
    @Column(name = "startDate")
    private String startDate;
    @Column(name = "endDate")
    private String endDate;
    @Column(name = "roomTypeId")
    private int roomTypeId;
    @Column(name = "roomId")
    private int roomId;
    @Column(name = "price")
    private int price;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    public RoomBooking() {

    }


    public RoomBooking(String nameSurname, int tc, int telNumber, String startDate, String endDate, int roomTypeId, int roomId, int price) {
        this.nameSurname = nameSurname;
        this.tc = tc;
        this.telNumber = telNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.roomTypeId = roomTypeId;
        this.roomId = roomId;
        this.price = price;
        this.id = id;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(int telNumber) {
        this.telNumber = telNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(int RoomTypeId) {
        this.roomTypeId = RoomTypeId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RoomBooking{" +
                "nameSurname='" + nameSurname + '\'' +
                ", tc=" + tc +
                ", email='" + email + '\'' +
                ", telNumber=" + telNumber +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", odaTypeId=" + roomTypeId +
                ", odaId=" + roomId +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
