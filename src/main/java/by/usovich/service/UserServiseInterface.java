package by.usovich.service;

import by.usovich.dto.LoginAndRegDto.LoginDto;
import by.usovich.dto.LoginAndRegDto.RegDto;
import by.usovich.dto.UserDto;
import by.usovich.entity.UserEntity;

/**
 * Created by yanus on 7/11/2017.
 */
public interface UserServiseInterface {

    public boolean isLoginExists(String login);

    public boolean isEmailExists(String email);

    public boolean isPasswordExists(String password);

    void createUser(RegDto profile);

    void deleteUser(UserDto profile);
}
