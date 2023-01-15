package by.it.academy.repositories;

import by.it.academy.enteties.User;

import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private final List<User> users;

    {
        users = List.of(new User("Vladimir", "Ulianov", 52),
                new User("Iosif", "Dzugashvili", 76),
                new User("Nikita", "Chruschev", 80),
                new User("Leonid", "Breznev", 82));
    }//иммитация базы данных;

    @Override
    public User createUser(String firstname, String secondname, int age) {
        return null;
    }

    @Override
    public List<User> readUsers() {
        return users;
    }
}
