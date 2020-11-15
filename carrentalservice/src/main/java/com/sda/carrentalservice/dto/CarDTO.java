package com.sda.carrentalservice.dto;

import com.sda.carrentalservice.entity.Booking;
import com.sda.carrentalservice.entity.Branch;
import com.sda.carrentalservice.entity.Status;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class CarDTO {

    private Long id;
    private String make;
    private String model;
    private String bodyType;
    private int yearOfProduction;
    private String color;
    private int mileage;
    private Status status;
    private Double amount;
    private List<BookingDTO> bookingDTOList;
    private Branch branch;

    public CarDTO() {
    }

    public CarDTO(Long id, String make, String model, String bodyType, int yearOfProduction, String color, int mileage, Status status, Double amount, List<BookingDTO> bookingDTOList, Branch branch) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.bodyType = bodyType;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.mileage = mileage;
        this.status = status;
        this.amount = amount;
        this.bookingDTOList = bookingDTOList;
        this.branch = branch;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public List<BookingDTO> getBookingDTOList() {
        return bookingDTOList;
    }

    public void setBookingDTOList(List<BookingDTO> bookingDTOList) {
        this.bookingDTOList = bookingDTOList;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
