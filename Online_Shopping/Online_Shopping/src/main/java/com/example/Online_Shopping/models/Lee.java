package com.example.Online_Shopping.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Lee {
    @Id
    String id;

    String imgName;
    String imgUrl;
    String imgInfo;
    int imgPrice;

    public Lee( String imgName, String imgUrl, String imgInfo, int imgPrice) {
        this.imgName = imgName;
        this.imgUrl = imgUrl;
        this.imgInfo = imgInfo;
        this.imgPrice = imgPrice;
    }
    public Lee() {

    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getImgInfo() {
        return imgInfo;
    }

    public void setImgInfo(String imgInfo) {
        this.imgInfo = imgInfo;
    }

    public int getImgPrice() {
        return imgPrice;
    }

    public void setImgPrice(int imgPrice) {
        this.imgPrice = imgPrice;
    }


}
