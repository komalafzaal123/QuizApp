package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class showResult extends AppCompatActivity {

    DbHelper db;
    ListView listViewQuiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);

        listViewQuiz = findViewById(R.id.listViewStudent);

        db = new DbHelper(showResult.this);


        List<QuizData> list = db.getAllData();

        List<String> myStringList = new ArrayList<>();
        int count = 0;
        while (count < list.size()) {
            myStringList.add(list.get(count).getQuestion());
            myStringList.add(list.get(count).getChoosedAns());
            myStringList.add(list.get(count).getCorrectAns());
            count++;
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(showResult.this, android.R.layout.simple_list_item_1, myStringList);
        listViewQuiz.setAdapter(arrayAdapter);


    }
}