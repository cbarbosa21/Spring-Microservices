package com.training.rest.webservices.springmicroservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Probably should use the @Repository annotation for things accessing database.
@Component
public class UserDAOService {

    private static List<User> users = new ArrayList<>();
    private int userCount = 3;

    static {
        users.add(new User(1, "Ceasar", new Date()));
        users.add(new User(2, "Tom", new Date()));
        users.add(new User(3, "John", new Date()));
    }

    public List<User> findAll() {
        return  users;
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user : users) {
            if(user.getId() == id) {
                return user;
            }
        }

        return null;
    }

}
