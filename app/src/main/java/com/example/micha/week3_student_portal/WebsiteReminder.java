package com.example.micha.week3_student_portal;


import java.io.Serializable;

public class WebsiteReminder implements Serializable {

    private String name;
    private String url;

    public WebsiteReminder(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
