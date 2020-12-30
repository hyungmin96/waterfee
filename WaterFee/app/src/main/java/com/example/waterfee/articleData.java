package com.example.waterfee;

import android.graphics.drawable.Drawable;

public class articleData {

    private String _title;
    private String _content;
    private String date;


    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public String get_content() {
        return _content;
    }

    public void set_content(String _content) {
        this._content = _content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
