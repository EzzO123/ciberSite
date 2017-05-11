package by.usovich.service;

import by.usovich.entity.User;

/**
 * Created by yanus on 11.05.2017.
 */
public interface UserServiceInterface {

    User getUserByLogin(String nickname);

   // void createUser(User );


}
