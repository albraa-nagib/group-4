package com.university.usermanagement;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing User Management...");

        userManager manager = new userManager();

        // Create test users (adjust constructor parameters as needed)
        student s1 = new student("Alice", "alice@example.com", "S001", "Computer Science", 2, 3.8);
        instructor i1 = new instructor("Bob", "bob@example.com", "I001", "Mathematics", "MWF 10-12");
        admin a1 = new admin("Charlie", "charlie@example.com", "A001", "Administration", "full");

        // Add users
        manager.addUser(s1);
        manager.addUser(i1);
        manager.addUser(a1);

        // List all users
        manager.listUsers();
    }
}
