package adsion.bean;

import java.util.Date;

public class Goods {
    int id;
    String name;
    double price;
    int num;
    String description;
    int shop_id;
    String show_img;
    String avatar;
    Date created_at;
    Date upodated_at;
    int status;
    Pivot pivot;

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", description='" + description + '\'' +
                ", shop_id=" + shop_id +
                ", show_img='" + show_img + '\'' +
                ", avatar='" + avatar + '\'' +
                ", created_at=" + created_at +
                ", upodated_at=" + upodated_at +
                ", status=" + status +
                ", pivot=" + pivot +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getShop_id() {
        return shop_id;
    }

    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }

    public String getShow_img() {
        return show_img;
    }

    public void setShow_img(String show_img) {
        this.show_img = show_img;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpodated_at() {
        return upodated_at;
    }

    public void setUpodated_at(Date upodated_at) {
        this.upodated_at = upodated_at;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Pivot getPivot() {
        return pivot;
    }

    public void setPivot(Pivot pivot) {
        this.pivot = pivot;
    }
}
