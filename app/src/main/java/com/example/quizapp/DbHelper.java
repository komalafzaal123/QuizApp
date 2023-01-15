package com.example.quizapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    public static final String Database_Name = "MyQuizApp.db";
    public static final String Table_Name = "QUIZData";
    public static final String QuizData_Id = "QUIZid";
    public static final String Quiz_ChoosedAns = "QUIZchoosedans";
    public static final String QuizData_CorrectAns = "QUIZcorrectans";

    public DbHelper(@Nullable Context context) {
        super(context, Database_Name, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = "CREATE TABLE IF NOT EXISTS " + Table_Name + " (" + QuizData_Id + " INTEGER PRIMARY KEY AUTOINCREMENT, " + Quiz_ChoosedAns + " TEXT, " +
                QuizData_CorrectAns + " TEXT )";
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String query = "DROP TABLE IF EXISTS " + Table_Name;
        sqLiteDatabase.execSQL(query);
        onCreate(sqLiteDatabase);
    }

   // @Override
//    public void onCreate(SQLiteDatabase db) {
//
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//
//    }
}
