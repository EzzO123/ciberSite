package by.usovich.dao;

/**
 * Created by yanus on 7/14/2017.
 */
import by.usovich.entity.UserEntity;

import java.util.*;
public interface UserDaoInterface {

    public boolean isLoginExists(String login);

    public boolean isEmailExists(String email);

    public boolean isPassword(String password);

    public List getUserEntityByLogin();

    void createUser(UserEntity profile);

    void deleteUser(UserEntity profile);
}
