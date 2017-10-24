package com.cj.springtest.model;

public class TbOrder {
    private Integer orderId;

    private String userName;

    private String title;

    private Integer num;

    private Long price;

    private Long totalFee;

    private String receiverAddress;

    private String receiverPhone;

    private Integer paymentType;

    private Integer status;
    public TbOrder(){}

    public TbOrder(String userName, String title,Integer num,
                   Long price,Long totalFee,String receiverPhone,String
                           receiverAddress,Integer status,Integer paymentType){
        this.userName=userName;
        this.title=title;
        this.num=num;
        this.price=price;
        this.totalFee=totalFee;
        this.receiverAddress=receiverAddress;
        this.receiverPhone=receiverPhone;
        this.status=status;
        this.paymentType=paymentType;
    }
    public TbOrder(String userName, String title,Integer num,
                   Long price,Long totalFee,String receiverPhone,String
                           receiverAddress,Integer status){
        this.userName=userName;
        this.title=title;
        this.num=num;
        this.price=price;
        this.totalFee=totalFee;
        this.receiverAddress=receiverAddress;
        this.receiverPhone=receiverPhone;
        this.status=status;
    }
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Long totalFee) {
        this.totalFee = totalFee;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone == null ? null : receiverPhone.trim();
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}