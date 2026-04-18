package org.example.session09_baitap04.model;

public class ShopRegistration {
    private String fullname;
    private String email;
    private String shopName;
    private String shopAddress;
    private String businessType;

    public ShopRegistration() {
    }

    public ShopRegistration(String fullname, String email, String shopName, String shopAddress, String businessType) {
        this.fullname = fullname;
        this.email = email;
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.businessType = businessType;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }
}