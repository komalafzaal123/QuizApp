package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class showResult extends AppCompatActivity {

    DbHelper db;
    TextView question, ansCorrect, UserAns;
    Button btnNext;
    ListView listViewQuiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);

//        question = findViewById(R.id.ques);
//        ansCorrect = findViewById(R.id.ansCorr);
//        UserAns = findViewById(R.id.ansUser);
        listViewQuiz = findViewById(R.id.listViewStudent);

        db = new DbHelper(showResult.this);

        List<QuizData> list = db.getAllData();
        ArrayAdapter arrayAdapter = new ArrayAdapter<QuizData>(showResult.this, android.R.layout.simple_list_item_1,list);
        listViewQuiz.setAdapter(arrayAdapter);


    }
}