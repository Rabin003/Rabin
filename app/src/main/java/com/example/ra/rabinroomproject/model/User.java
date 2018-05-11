package com.example.ra.rabinroomproject.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by RA on 5/11/2018.
 */
@Entity(tableName = "users")
public class User {

    @PrimaryKey
    private int id;

    @ColumnInfo
    private String name;

    @ColumnInfo
    private  String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
