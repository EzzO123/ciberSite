package by.usovich.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by yanus on 6/11/2017.
 */
public class PostEntityForTest {

    private int _id;

    private String _titel;

    private String _content;

    private Date _date;

    private String _image;

    public PostEntityForTest(int _id, String _titel, String _content, String _image) {
        this._id = _id;
        this._titel = _titel;
        this._content = _content;
        this._date = _date;
        this._image = _image;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_titel() {
        return _titel;
    }

    public void set_titel(String _titel) {
        this._titel = _titel;
    }

    public String get_content() {
        return _content;
    }

    public void set_content(String _content) {
        this._content = _content;
    }

    public Date get_date() {
        return _date;
    }

    public void set_date(Date _date) {
        this._date = _date;
    }

    public String get_image() {
        return _image;
    }

    public void set_image(String _image) {
        this._image = _image;
    }
}
