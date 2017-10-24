package com.cj.springtest.model;

public class TbItemCar {
    private Integer carId;

    private String title;

    private Long price;

    private Integer status;

    private Integer sortOrder;


    public TbItemCar(Integer carId, String title,Long price,Integer status,Integer sortOrder) {

        this.carId = carId;
        this.title = title;
        this.price = price;
        this.status = status;
        this.sortOrder = sortOrder;
    }

    public TbItemCar( String title,Long price,Integer sortOrder) {

        this.title = title;
        this.price = price;
        this.sortOrder = sortOrder;
    }

    public TbItemCar(String title, Integer sortOrder) {
        this.title = title;
        this.sortOrder = sortOrder;
    }
    public TbItemCar(String title, Long price) {
        this.title = title;
        this.price = price;
    }
    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }
}