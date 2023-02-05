package com.example.quizapp;

public class QuizData {
    private int id;
    private String Question;
    private String ChoosedAns;
    private String CorrectAns;

    public QuizData(String question, String choosedAns, String correctAns) {
        Question = question;
        ChoosedAns = choosedAns;
        CorrectAns = correctAns;
    }

    public QuizData(int id, String question, String choosedAns, String correctAns) {
        this.id = id;
        Question = question;
        ChoosedAns = choosedAns;
        CorrectAns = correctAns;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
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
