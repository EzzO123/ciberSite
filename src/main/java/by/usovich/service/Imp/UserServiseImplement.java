package by.usovich.service.Imp;

import by.usovich.dao.UserDaoInterface;
import by.usovich.dto.LoginAndRegDto.LoginDto;
import by.usovich.dto.LoginAndRegDto.RegDto;
import by.usovich.entity.UserEntity;
import by.usovich.service.UserServiseInterface;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yanus on 7/11/2017.
 */
@Service
public class UserServiseImplement implements UserServiseInterface {

    public  Logger log = Logger.getLogger(UserServiseImplement.class);

    @Autowired
    public UserDaoInterface userDaoImp;


    public boolean isLoginExists(String login){

        if(userDaoImp.isLoginExists(login)){
            log.info("Login :" + login + " is in the BD");
            return true;
        }else {
            log.info("Login :" + login + " is NOT in the BD");
            return false;
        }

    }


    public boolean isEmailExists(String email) {

        if(userDaoImp.isEmailExists(email)){
            log.info("Email :" + email + " is in the BD");
            return true;
        }else {
            log.info("Email :" + email + " is NOT in the BD");
            return false;
        }
    }


    public boolean isPasswordExists(String password) {

        if(userDaoImp.isPassword(password)){
            log.info("Password :" + password + " is in the BD");
            return true;
        }else {
            log.info("Password :" + password + " is NOT in the BD");
            return false;
        }
    }

    @Override
    public void createUser(UserEntity profile) {

    }

    @Override
    public void deleteUser(UserEntity profile) {

    }


    public void createUser(RegDto regDto) {

        UserEntity userEntity  = new UserEntity();

        userEntity.set_login(regDto.getLogin());
        userEntity.set_password(regDto.getPassword());
        userEntity.set_email(regDto.getEmail());
        userEntity.set_country(regDto.getCountry());
       // userEntity.set_games();
    }


    public void deleteUser(LoginDto profile) {

    }
}
