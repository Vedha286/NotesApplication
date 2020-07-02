package com.example.notesapplication;

public class CourseInfo {
    private final Course course;

    CourseInfo() {
        course = new Course();
    }
    public String getTitle() {
        return course.getTitle();
    }

    public void setCourseTitle(String title) {
        course.setTitle(title);
    }

    public Course getCourse() {
        return course;
    }
}
