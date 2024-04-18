package web.users.service;

import web.users.model.User;

import java.util.List;

public interface UserService {
    List<User> allFilms();
    void add(User user);
    void delete(User user);
    void edit(User user);
    User getById(int id);
}