package com.example.snake.Model;

public class Model {

    private long id;
    private String date;
    private int scores;

    public Model (long id, String date, int scores) {
        this.id = id;
        this.date = date;
        this.scores = scores;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return this.date + " : " + this.scores;
    }
}
