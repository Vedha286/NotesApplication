package com.example.notesapplication;

public class NoteInfo {
    Course course;
    String title = "";
    NoteInfo() {
    }

    public void setCourse(Course c) {
        course = c;
    }

    public void setNoteTitle(String t) {
        title = t;
    }
    public Course getCourse() {
        return course;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        title = String.valueOf(newTitle);
    }
}
