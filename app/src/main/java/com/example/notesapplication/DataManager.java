package com.example.notesapplication;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private static DataManager instance;
    private static List<NoteInfo> notes;
    private static List<CourseInfo> courses;
    public static DataManager getInstance() {
        if(instance == null)
        {
            instance = new DataManager();
            notes = new ArrayList<NoteInfo>();
            populateNotes();
        }
        return instance;
    }

    private static void populateNotes() {
        NoteInfo newNote = new NoteInfo();
        CourseInfo courseInfo = new CourseInfo();
        courseInfo.setCourseTitle("COS301");
        newNote.setCourse(courseInfo.getCourse());
        newNote.setNoteTitle("Capstone Create server");
        notes.add(newNote);
        courses.add(courseInfo);

        newNote = new NoteInfo();
        courseInfo = new CourseInfo();
        courseInfo.setCourseTitle("COS334");
        newNote.setCourse(courseInfo.getCourse());
        newNote.setNoteTitle("Send Email");
        notes.add(newNote);
        courses.add(courseInfo);

        newNote = new NoteInfo();
        courseInfo = new CourseInfo();
        courseInfo.setCourseTitle("COS332");
        newNote.setCourse(courseInfo.getCourse());
        newNote.setNoteTitle("Assignment 2");
        notes.add(newNote);
        courses.add(courseInfo);

        newNote = new NoteInfo();
        courseInfo = new CourseInfo();
        courseInfo.setCourseTitle("COS216");
        newNote.setCourse(courseInfo.getCourse());
        newNote.setNoteTitle("Mark Students Practical 2");
        notes.add(newNote);
        courses.add(courseInfo);

        newNote = new NoteInfo();
        courseInfo = new CourseInfo();
        courseInfo.setCourseTitle("COS341");
        newNote.setCourse(courseInfo.getCourse());
        newNote.setNoteTitle("Sumarize chapter 7");
        notes.add(newNote);
        courses.add(courseInfo);

        newNote = new NoteInfo();
        courseInfo = new CourseInfo();
        courseInfo.setCourseTitle("COS341");
        newNote.setCourse(courseInfo.getCourse());
        newNote.setNoteTitle("Task 04");
        notes.add(newNote);
        courses.add(courseInfo);

        newNote = new NoteInfo();
        courseInfo = new CourseInfo();
        courseInfo.setCourseTitle("COS314");
        newNote.setCourse(courseInfo.getCourse());
        newNote.setNoteTitle("Email tutor to remark");
        notes.add(newNote);
        courses.add(courseInfo);
    }

    public List<NoteInfo> getNotes() {
        return instance.notes;
    }

    public List<CourseInfo> getCourses() {
        return courses;
    }
}
