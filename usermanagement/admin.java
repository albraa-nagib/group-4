package com.university.usermanagement;

public class admin extends user {
    private String adminId;
    private String department;
    private String permissions;

    public admin(String name, String email, String password, String adminId, String department, String permissions) {
        super(name, email, password);
        this.adminId = adminId;
        this.department = department;
        this.permissions = permissions;
    }

    // Overloaded constructor without password
    public admin(String name, String email, String adminId, String department, String permissions) {
        this(name, email, "", adminId, department, permissions);
    }

    // Getters and setters
    public String getAdminId() { return adminId; }
    public void setAdminId(String adminId) { this.adminId = adminId; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getPermissions() { return permissions; }
    public void setPermissions(String permissions) { this.permissions = permissions; }

    @Override
    public void displayInfo() {
        System.out.println("Admin Id: " + adminId);
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Department: " + department);
        System.out.println("Permissions: " + permissions);
    }

    @Override
    public String getRole() {
        return "admin";
    }
}
