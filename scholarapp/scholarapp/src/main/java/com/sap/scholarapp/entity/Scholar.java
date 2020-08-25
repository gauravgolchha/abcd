package com.sap.scholarapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Scholar {
    @Id
    private String id;
    @Column
    private String name;
    @Column
    private String batch;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
