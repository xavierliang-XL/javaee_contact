package ca.xavier.service;

import ca.xavier.domain.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();

    public void addUser(User user);

    public void delUser(String id);

    public User findUserById(String id);

    public void updateUserInfo(User user);

    public void delUsers(String[] ids);
}
