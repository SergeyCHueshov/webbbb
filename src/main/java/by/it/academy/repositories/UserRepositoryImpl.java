package by.it.academy.repositories;

import by.it.academy.enteties.User;

import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private final List<User> users;

    public UserRepositoryImpl(List<User> users) {
        this.users = users;
    }

    @Override
    public void createUser(String firstname, String secondname, String login, int age, int password) {
        User user = new User(firstname, secondname, login, age, password);
        users.add(user);
    }

    @Override
    public List<User> readUsers() {
        return users;
    }
}
