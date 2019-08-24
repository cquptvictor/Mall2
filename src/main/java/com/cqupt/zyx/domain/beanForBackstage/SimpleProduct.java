package com.cqupt.zyx.domain.beanForBackstage;
/**
 * 用于商品的简略页面*/
public class SimpleProduct {
        private int pid;
        private String title;
        private Double price;
        private String pic;
        private int quantity;
        private int inventory;

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }


        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public int getPid() {
            return pid;
        }

        public void setPid(int pid) {
            this.pid = pid;
        }
    }

