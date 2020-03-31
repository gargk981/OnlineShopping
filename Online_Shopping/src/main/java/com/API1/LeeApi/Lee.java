package com.API1.LeeApi;

public class Lee {
    int id;
    String imgName;
    String imgUrl;
    String imgInfo;
    int imgPrice;

    public Lee(int id, String imgName, String imgUrl, String imgInfo, int imgPrice) {
        this.id = id;
        this.imgName = imgName;
        this.imgUrl = imgUrl;
        this.imgInfo = imgInfo;
        this.imgPrice = imgPrice;
    }
    public Lee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
