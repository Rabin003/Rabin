package com.example.ra.rabinroomproject.Dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.ra.rabinroomproject.model.User;

import java.util.List;

/**
 * Created by RA on 5/11/2018.
 */
@Dao
public interface MyDao {

    @Insert
    public void addUser(User user);

    @Query("select* from users")
    public List<User>getUsers();

    @Delete
    public void deleteUser(User user);

    @Update
    public void updateUser(User user);
}
