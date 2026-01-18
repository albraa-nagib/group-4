package com.university;
import java.util.List;

public class Authentication {
private List<User> users;
public Authentication(List<User> users) {
 this.users = users;
    }

 public User login(String email, String password) {
 for (User user : users) {
 if (user.authenticate(email, password)) {
 return user;
  }
  }
  return null;
 }
}
