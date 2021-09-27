package ca.xavier.test;

import ca.xavier.dao.UserDao;
import ca.xavier.dao.impl.UserDaoImpl;
import ca.xavier.domain.User;

import org.junit.Test;

import java.util.List;

public class TestUserDao {
    UserDao dao=new UserDaoImpl();

    @Test
    public void testFindAll(){
        dao.delUsers(new String[]{"7","8"});
        List<User> users=dao.findAll();
        System.out.println(users);
    }
}
