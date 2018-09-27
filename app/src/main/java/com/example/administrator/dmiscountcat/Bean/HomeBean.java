package com.example.administrator.dmiscountcat.Bean;

public class HomeBean {

    private String ImageURL ;  //展示图片
    private int brokerage;   //佣金
    private  String title;  //标题
    private int current;  //原价
    private int volume;  //销量
    private int price;   //券后价
    private int coupon;   //优惠价格

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        ImageURL = imageURL;
    }

    public int getBrokerage() {
        return brokerage;
    }

    public void setBrokerage(int brokerage) {
        this.brokerage = brokerage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCoupon() {
        return coupon;
    }

    public void setCoupon(int coupon) {
        this.coupon = coupon;
    }
}
