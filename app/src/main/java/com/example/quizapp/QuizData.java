package com.example.quizapp;

public class QuizData {
    private int id;
    private String CorrectAns;
    private String WrongAns;

    public QuizData(int id, String correctAns, String wrongAns) {
        this.id = id;
        CorrectAns = correctAns;
        WrongAns = wrongAns;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorrectAns() {
        return CorrectAns;
    }

    public void setCorrectAns(String correctAns) {
        CorrectAns = correctAns;
    }

    public String getWrongAns() {
        return WrongAns;
    }

    public void setWrongAns(String wrongAns) {
        WrongAns = wrongAns;
    }
}
