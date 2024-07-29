package com.pclup.Pclub.model;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;

import java.math.BigDecimal;
//import javax.persistence.*;

@Entity
@Table(name = "computer")

public class Computer {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
//    private String type;
//    private BigDecimal price;
//    private boolean isAvailable;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }
//@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
//private Long id;
//
//    private String name;
//    private String type;
//    private BigDecimal price;
//    private boolean isAvailable;
//
//    // Getters and setters
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }
//
//    public boolean isAvailable() {
//        return isAvailable;
//    }
//
//    public void setAvailable(boolean isAvailable) {
//        this.isAvailable = isAvailable;
//    }

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String room;
    private String number;
    private boolean available;
    private String status;
    private String bookingTime;
    private String booking_time_end;


    // Геттеры и сеттеры

    public String getBooking_time_end() {
        return booking_time_end;
    }

    public void setBooking_time_end(String booking_time_end) {
        this.booking_time_end = booking_time_end;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

