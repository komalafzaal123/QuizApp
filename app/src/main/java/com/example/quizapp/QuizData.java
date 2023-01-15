package com.example.quizapp;

public class QuizData {
    private int id;
    private String ChoosedAns;
    private String CorrectAns;

    public QuizData(int id, String correctAns, String choosedAns) {
        this.id = id;
        CorrectAns = correctAns;
        ChoosedAns = choosedAns;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChoosedAns() {
        return ChoosedAns;
    }

    public void setChoosedAns(String choosedAns) {
        ChoosedAns = choosedAns;
    }

    public String getCorrectAns() {
        return CorrectAns;
    }

    public void setCorrectAns(String correctAns) {
        CorrectAns = correctAns;
    }


}
