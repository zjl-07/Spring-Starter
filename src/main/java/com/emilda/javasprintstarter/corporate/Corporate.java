package com.emilda.javasprintstarter.corporate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Corporate {
    @Id
    private Integer id;
    private String name;
    private String address;
    private String description;

    public Corporate(){

    }

    public Corporate(Integer id, String name, String address, String description) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
