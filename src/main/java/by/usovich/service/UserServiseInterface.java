package by.usovich.service;

import by.usovich.entity.UserEntity;

/**
 * Created by yanus on 7/11/2017.
 */
public interface UserServiseInterface {

    public boolean isLoginExists(String login);

    public boolean isEmailExists(String email);

    public boolean isPasswordExists(String password);

    void createUser(UserEntity profile);

    void deleteUser(UserEntity profile);
}
