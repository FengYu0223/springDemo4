package com.cj.springtest.model;

public class TbOrderDet {
    private Integer id;

    private Long itemId;

    private Integer orderId;

    private Integer num;

    private String title;

    private Long price;

    private Long totalFee;

    private String receiverAddress;

    private String receiverPhone;

    public TbOrderDet( String title,Long price,Integer num){
        this.title=title;
        this.price=price;
        this.num=num;

    }

    public TbOrderDet(Integer orderId,Long itemId,String title,
                      Long price,String receiverAddress, String receiverPhone){
        this.itemId=itemId;
        this.orderId=orderId;
        this.title=title;
        this.price=price;
        this.receiverAddress=receiverAddress;
        this.receiverPhone=receiverPhone;
    }

    public TbOrderDet(Integer id,Long itemId,Integer orderId,
                      Integer num,String title, Long price,Long totalFee,
                      String receiverAddress, String receiverPhone){
        this.id=id;
        this.itemId=itemId;
        this.orderId=orderId;
        this.num=num;
        this.title=title;
        this.price=price;
        this.totalFee=totalFee;
        this.receiverAddress=receiverAddress;
        this.receiverPhone=receiverPhone;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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
}