package ca.xavier.dao;

import ca.xavier.domain.User;

import java.util.List;

public interface UserDao {
    public List<User> findAll();

    public void addUser(User user);

    public void delUser(int id);

    public User findUserById(int id);

    public void updateUserInfo(User user);

    public void delUsers(String[] ids);
}
