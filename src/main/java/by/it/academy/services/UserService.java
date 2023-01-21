package by.it.academy.services;

import by.it.academy.enteties.User;

import java.util.List;

public interface UserService {
    void createUser(String firstname, String secondname, int age);//User

    List<User> readUsers();
}
