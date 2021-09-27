package ca.xavier.service.impl;

import ca.xavier.dao.UserDao;
import ca.xavier.dao.impl.UserDaoImpl;
import ca.xavier.domain.User;
import ca.xavier.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao=new UserDaoImpl();

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    public void delUser(String id){
        userDao.delUser(Integer.parseInt(id));
    }

    @Override
    public User findUserById(String id) {
        return userDao.findUserById(Integer.parseInt(id));
    }

    @Override
    public void updateUserInfo(User user) {
        userDao.updateUserInfo(user);
    }

    @Override
    public void delUsers(String[] ids) {
        userDao.delUsers(ids);
    }
}
