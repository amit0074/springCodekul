package com.springCodekul.springCodekul.onetomany.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Parts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String partName;

    private Integer partNumber;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vehicle_id")
    @JsonBackReference
    private Vehicle vehicle;

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public Integer getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
