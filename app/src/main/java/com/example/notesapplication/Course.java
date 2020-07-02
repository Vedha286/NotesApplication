package com.example.notesapplication;

public class Course {
    private String title = "";
    private String text = "";

    public void setTitle(String t) {
        title = t;
    }
    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public void setText(String newTitle) {
        text = String.valueOf(newTitle);
    }
}
