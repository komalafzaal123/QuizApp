package com.example.quizapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "dbb";
    private static final int DB_VERSION = 1;
    private static final String TABLE_NAME = "mytable";
    private static final String ID_COL = "id";
    private static final String QUESTION = "ques";
    private static final String CORRECT_ANSWER = "ans";
    private static final String USER_ANSWER = "user_answer";

    public DbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME + " ("
                + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + QUESTION + " TEXT, "
                + USER_ANSWER + " TEXT, "
                + CORRECT_ANSWER + " TEXT)";

        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // this method is called to check if the table exists already.
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
    // this method is use to add new course to our sqlite database.
    public void addNewCourse(String question, String correctAnswer) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(QUESTION, question);
        values.put(CORRECT_ANSWER, correctAnswer);

        db.insert(TABLE_NAME, null, values);

//        db.close();
    }

    public boolean isAnswerCorrect(String question, String answerByUser)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " +
                        TABLE_NAME + " WHERE " +
                        QUESTION + "=? AND " +
                        CORRECT_ANSWER + "=?",
                new String[]{question, answerByUser});

        // now you have the results, DON'T return them, just check if contains
        // > Java 7: if (!Objects.equals(cursor, null) && cursor.getCount() > 0) {
        if (cursor != null && cursor.getCount() > 0) {
            return true;
        }

        return false;
    }

    public void updateUserAnswer(String question, String answer) {
        SQLiteDatabase db = this.getWritableDatabase();
//        String strSQL = "UPDATE " + TABLE_NAME + " SET " + USER_ANSWER + " = " + answer + " WHERE " + QUESTION + " LIKE " + question;
//        db.execSQL(strSQL);
//        db.close();

        ContentValues values= new ContentValues();
        values.put(USER_ANSWER, answer);
        db.update(TABLE_NAME, values,QUESTION+" = ?", new String[]{question});
    }
}

