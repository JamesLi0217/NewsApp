package com.laioffer.newsapp;

import android.app.Application;

import androidx.room.Room;

import com.ashokvarma.gander.Gander;
import com.ashokvarma.gander.imdb.GanderIMDB;
import com.laioffer.newsapp.database.NewsDatabase;

public class NewsApplication extends Application {
    private NewsDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        Gander.setGanderStorage(GanderIMDB.getInstance());
        database = Room.databaseBuilder(this, NewsDatabase.class, "tinnews_db").build();
    }

    public NewsDatabase getDatabase() {
        return database;
    }
}
