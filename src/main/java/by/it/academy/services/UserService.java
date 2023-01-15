package by.it.academy.services;

import by.it.academy.enteties.User;

import java.util.List;

public interface UserService {
    User createUser(String firstname, String secondname, int age);

    List<User> readUsers();
}
