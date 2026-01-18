package com.university.usermanagement;

import java.util.ArrayList;
import java.util.List;

public class userManager {
    private List<user> users;

    public userManager() {
        users = new ArrayList<>();
    }

    public void addUser(user newUser) {
        users.add(newUser);
        System.out.println(newUser.getRole() + " added successfully.");
    }

    public void listUsers() {
        if(users.isEmpty()) {
            System.out.println("No users found.");
            return;
        }
        for(user u : users) {
            System.out.println("Role: " + u.getRole());
            u.displayInfo();
            System.out.println("-------------------------");
        }
    }
}
