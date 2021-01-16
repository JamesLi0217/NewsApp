package com.laioffer.newsapp.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.laioffer.newsapp.model.Article;

@Database(entities = {Article.class}, version = 1, exportSchema = false)
public abstract class NewsDatabase extends RoomDatabase {

    public abstract ArticleDao articleDao();
}

