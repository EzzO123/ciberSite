package by.usovich.dto.LoginAndRegDto;

/**
 * Created by yanus on 7/13/2017.
 */
import java.util.Map;
import java.util.HashMap;
public class RegDto {

    private String login;
    private String email;
    private String password;
    private String repassword;
    private String name;
    private boolean role;


    public RegDto(){

    }

    public RegDto(String nick, String email, String password, String repassword, String name) {
        this.login = nick;
        this.email = email;
        this.password = password;
        this.repassword = repassword;
        this.name = name;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }
}
