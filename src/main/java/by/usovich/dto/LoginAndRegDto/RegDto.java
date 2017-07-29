package by.usovich.dto;

/**
 * Created by yanus on 7/13/2017.
 */
import java.util.*;
public class RegDto {

    private String login;
    private String email;
    private String password;
    private String repassword;
    private LinkedList<String> games;
    private String country;



    public RegDto() {
    }

    public RegDto(String nick, String email, String password, String repassword, String game, String country) {
        this.login = nick;
        this.email = email;
        this.password = password;
        this.repassword = repassword;
        this.games.add(game);
        this.country = country;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public String getGame(int index) {
        return games.get(index);
    }

    public LinkedList<String> getGames() {return games;}

    public void setGame(String game) {
        this.games.add(game);
    }

    public String getCountry() {return country;}

    public void setCountry(String country) {
        this.country = country;
    }
}
