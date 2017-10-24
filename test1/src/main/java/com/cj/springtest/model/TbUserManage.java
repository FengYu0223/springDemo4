package com.cj.springtest.model;

public class TbUserManage {
    private Long id;

    private String userName;

    private Integer userId;

    private String phone;

    private Long balance;

    private String address;
    public TbUserManage(){}
    public TbUserManage(String userName, String phone,String address) {
        this.userName = userName;
        this.phone = phone;
        this.address = address;
    }
    public TbUserManage( String userName, String phone,String address,Long balance) {
        this.userName = userName;
        this.phone = phone;
        this.balance = balance;
        this.address = address;
    }
    public TbUserManage( String userName,Long balance) {
        this.balance = balance;
        this.userName = userName;
    }
    public TbUserManage(Long id, String userName, Integer userId,
                        String phone,Long balance,String address) {
        this.id = id;
        this.userName = userName;
        this.userId = userId;
        this.phone = phone;
        this.balance = balance;
        this.address = address;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}