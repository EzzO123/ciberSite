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

    public List getUserEntityByLogin(String login);

    void createUser(UserEntity userEntity);

    void deleteUser(UserEntity userEntity);

    void updateUser(UserEntity userEntity);

}
