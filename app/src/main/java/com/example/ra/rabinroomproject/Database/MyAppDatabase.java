package com.example.ra.rabinroomproject.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.ra.rabinroomproject.Dao.MyDao;
import com.example.ra.rabinroomproject.model.User;

/**
 * Created by RA on 5/11/2018.
 */

@Database(entities = {User.class},version = 1)
public abstract class MyAppDatabase extends RoomDatabase{

    public abstract MyDao myDao();
}
