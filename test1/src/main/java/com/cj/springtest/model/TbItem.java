package com.cj.springtest.model;

public class TbItem {
    private Long id;

    private String title;

    private Long price;

    private Integer num;

    private Long cid;

    public TbItem (){}
    public TbItem(Long id, String title, Long price, Integer num,Long cid) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.num = num;
        this.cid = cid;
    }
    public TbItem(String title, Long price, Integer num) {
        this.title = title;
        this.price = price;
        this.num = num;
    }

    public TbItem(String title, Long price) {
        this.title = title;
        this.price = price;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }
}