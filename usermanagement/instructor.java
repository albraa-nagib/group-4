package com.university.usermanagement;

import java.util.Arrays;

public class instructor extends user {
    private String instructorId;
    private String department;
    private String officeHours;
    private String[] coursesTaught;

    public instructor(String name, String email, String password, String instructorId, String department, String officeHours, String[] coursesTaught) {
        super(name, email, password);
        this.instructorId = instructorId;
        this.department = department;
        this.officeHours = officeHours;
        this.coursesTaught = coursesTaught;
    }

    // Overloaded constructor without password and coursesTaught
    public instructor(String name, String email, String instructorId, String department, String officeHours) {
        this(name, email, "", instructorId, department, officeHours, new String[0]);
    }

    // getters and setters
    public String getInstructorId() { return instructorId; }
    public void setInstructorId(String instructorId) { this.instructorId = instructorId; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getOfficeHours() { return officeHours; }
    public void setOfficeHours(String officeHours) { this.officeHours = officeHours; }

    public String[] getCoursesTaught() { return coursesTaught; }
    public void setCoursesTaught(String[] coursesTaught) { this.coursesTaught = coursesTaught; }

    @Override
    public void displayInfo() {
        System.out.println("Instructor Id: " + instructorId);
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Department: " + department);
        System.out.println("Office Hours: " + officeHours);
        System.out.println("Courses Taught: " + Arrays.toString(coursesTaught));
    }

    @Override
    public String getRole() {
        return "instructor";
    }
}
