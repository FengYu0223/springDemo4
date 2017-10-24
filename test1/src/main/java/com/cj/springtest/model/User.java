package com.cj.springtest.model;

public class User {

    private int userId;
    private String userPassword;
    private String userName;

    public User() {
        super();
    }

    public User(String userName, String password) {
        this.userPassword = password;
        this.userName = userName;
    }

    public User(int id, String password, String userName) {
        super();
        this.userId = id;
        this.userPassword = password;
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int id) {
        this.userId = id;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String password) {
        this.userPassword = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
