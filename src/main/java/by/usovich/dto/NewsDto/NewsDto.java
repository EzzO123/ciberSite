package by.usovich.dto;

//import org.json.simple.JSONObject;


import java.util.Date;

/**
 * Created by yanus on 15.05.2017.
 */
public class NewsDto {

    private String _titel;

    private String _content;

    private String _date;

    private String _image;


    public NewsDto(String titel, String content, String date, String image) {
        this._titel = titel;
        this._content = content;
        this._date = date;
        this._image = image;
    }

    public String get_titel() {
        return _titel;
    }

    public void set_titel(String titel) {
        this._titel = titel;
    }

    public String get_content() {
        return _content;
    }

    public void set_content(String content) {
        this._content = content;
    }

    public String get_date() {
        return _date;
    }

    public void set_date(String date) {
        this._date = date;
    }

    public String get_image() {
        return _image;
    }

    public void set_image(String _image) {
        this._image = _image;
    }
}
