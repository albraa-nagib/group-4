package com.university.usermanagement;

import java.util.Arrays;

public class student extends user {
    private String studentId;
    private String program;
    private int year;
    private double gpa;
    private String[] completedCourses;

    public student(String name, String email, String password, String studentId, String program, int year, double gpa, String[] completedCourses) {
        super(name, email, password);
        this.studentId = studentId;
        this.program = program;
        this.year = year;
        this.gpa = gpa;
        this.completedCourses = completedCourses;
    }

    // Overloaded constructor to allow simpler object creation without password and completedCourses
    public student(String name, String email, String studentId, String program, int year, double gpa) {
        this(name, email, "", studentId, program, year, gpa, new String[0]);
    }

    // getters and setters
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getProgram() { return program; }
    public void setProgram(String program) { this.program = program; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    public String[] getCompletedCourses() { return completedCourses; }
    public void setCompletedCourses(String[] completedCourses) { this.completedCourses = completedCourses; }

    @Override
    public void displayInfo() {
        System.out.println("Student Id: " + studentId);
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Program: " + program);
        System.out.println("Year: " + year);
        System.out.println("GPA: " + gpa);
        System.out.println("Completed Courses: " + Arrays.toString(completedCourses));
    }

    @Override
    public String getRole() {
        return "student";
    }
}
