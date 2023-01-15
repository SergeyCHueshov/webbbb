package by.it.academy.repositories;

import by.it.academy.enteties.User;

import java.util.List;

public interface UserRepository {
    User createUser(String firstname, String secondname, int age);

    List<User> readUsers();
}

