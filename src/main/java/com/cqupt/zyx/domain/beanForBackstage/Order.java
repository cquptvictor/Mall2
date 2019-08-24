package com.cqupt.zyx.domain.beanForBackstage;

import java.util.List;

public class Order {
    private int oid;
    private double totalPrice;
    private String OrderTime;
    private String addr;
    private String phone;
    private String status;
    private List<SimpleProduct> products;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getOrderTime() {
        return OrderTime;
    }

    public void setOrderTime(String orderTime) {
        OrderTime = orderTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<SimpleProduct> getProducts() {
        return products;
    }

    public void setProducts(List<SimpleProduct> products) {
        this.products = products;
    }
}
