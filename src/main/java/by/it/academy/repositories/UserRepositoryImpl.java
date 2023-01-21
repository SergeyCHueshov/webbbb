package by.it.academy.repositories;

import by.it.academy.enteties.User;

import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private final List<User> users;

    public UserRepositoryImpl(List<User> users) {
        this.users = users;
    }

    @Override
    public User createUser(String firstname, String secondname, int age) {
        User user = new User(firstname,secondname,age);
        users.add(user);
        return user;
    }

    @Override
    public List<User> readUsers() {
        return users;
    }
}
