package by.usovich.service;

import by.usovich.dao.IMP.UserDAO;
import by.usovich.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yanus on 11.05.2017.
 */
@Service("userService")
public class UserService implements  UserServiceInterface {

    @Autowired
    UserDAO userDAO;

    public User getUserByLogin(String nick) {
        return userDAO.getUserByNickname(nick);
    }
}
