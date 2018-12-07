package com.example.marcin.myfileapplication;

public class User {

    private String id;
    private String password;
    private String mail;

    public User(String id, String password, String mail) {
        this.id = id;
        this.password = password;
        this.mail = mail;
    }

    public User(String password, String mail) {
        this.password = password;
        this.mail = mail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
