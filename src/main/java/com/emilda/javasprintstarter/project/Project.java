package com.emilda.javasprintstarter.project;

import com.emilda.javasprintstarter.corporate.Corporate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Project {
    @Id
    private Integer id;
    private String name;
    private String description;

    @ManyToOne
    private Corporate corporate;

    public Project(){

    }

    public Project(Integer id, String name, String address, String description, Integer corporateId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.corporate = new Corporate(corporateId,"","","");
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Corporate getCorporate() {
        return corporate;
    }

    public void setCorporate(Corporate corporate) {
        this.corporate = corporate;
    }
}
