package adsion.bean;

import java.sql.Clob;

public class ShopInfo {
    public int id;
    public String name;
    public int equipment_id;
    public String status;
    public int goods_count;
    public double shop_points;
    public String address;
    public String shop_avatar;
    public String avatar;
    public String phone;
    public String QRcode_address;
    public double shop_discount;
    public String coordinates;
    public double user_stop_avg;
    public int user_num_default;
    public double user_shop_avg;
    public int user_id;

    @Override
    public String toString() {
        return "ShopInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", equipment_id=" + equipment_id +
                ", status='" + status + '\'' +
                ", goods_count=" + goods_count +
                ", shop_points=" + shop_points +
                ", address='" + address + '\'' +
                ", shop_avatar='" + shop_avatar + '\'' +
                ", avatar='" + avatar + '\'' +
                ", phone='" + phone + '\'' +
                ", QRcode_address='" + QRcode_address + '\'' +
                ", shop_discount=" + shop_discount +
                ", coordinates='" + coordinates + '\'' +
                ", user_stop_avg=" + user_stop_avg +
                ", user_num_default=" + user_num_default +
                ", user_shop_avg=" + user_shop_avg +
                ", user_id=" + user_id +
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

    public int getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(int equipment_id) {
        this.equipment_id = equipment_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getGoods_count() {
        return goods_count;
    }

    public void setGoods_count(int goods_count) {
        this.goods_count = goods_count;
    }

    public double getShop_points() {
        return shop_points;
    }

    public void setShop_points(double shop_points) {
        this.shop_points = shop_points;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getShop_avatar() {
        return shop_avatar;
    }

    public void setShop_avatar(String shop_avatar) {
        this.shop_avatar = shop_avatar;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQRcode_address() {
        return QRcode_address;
    }

    public void setQRcode_address(String QRcode_address) {
        this.QRcode_address = QRcode_address;
    }

    public double getShop_discount() {
        return shop_discount;
    }

    public void setShop_discount(double shop_discount) {
        this.shop_discount = shop_discount;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public double getUser_stop_avg() {
        return user_stop_avg;
    }

    public void setUser_stop_avg(double user_stop_avg) {
        this.user_stop_avg = user_stop_avg;
    }

    public int getUser_num_default() {
        return user_num_default;
    }

    public void setUser_num_default(int user_num_default) {
        this.user_num_default = user_num_default;
    }

    public double getUser_shop_avg() {
        return user_shop_avg;
    }

    public void setUser_shop_avg(double user_shop_avg) {
        this.user_shop_avg = user_shop_avg;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
