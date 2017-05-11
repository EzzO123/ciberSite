package by.usovich.dto;

/**
 * Created by yanus on 10.05.2017.
 */
public class UserDTO {

    private String _email;
    private String _nickname;
    private String _passworld;

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public String get_nickname() {
        return _nickname;
    }

    public void set_nickname(String _nickname) {
        this._nickname = _nickname;
    }

    public String get_passworld() {
        return _passworld;
    }

    public void set_passworld(String _passworld) {
        this._passworld = _passworld;
    }
}
