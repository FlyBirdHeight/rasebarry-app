package adsion.bean;

import java.util.Date;

public class Order {
    public UserInfo users;
    public int id;
    public int user_id;
    public int shop_id;
    public Date end_time;
    public double price;
    public Date pay_time;
    public String get_type;
    public int status;
    public String order_code;

    @Override
    public String toString() {
        return "Order{" +
                "users=" + users +
                ", id=" + id +
                ", user_id=" + user_id +
                ", shop_id=" + shop_id +
                ", end_time=" + end_time +
                ", price=" + price +
                ", pay_time=" + pay_time +
                ", get_type='" + get_type + '\'' +
                ", status=" + status +
                ", order_code='" + order_code + '\'' +
                '}';
    }

    public UserInfo getUsers() {
        return users;
    }

    public void setUsers(UserInfo users) {
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getShop_id() {
        return shop_id;
    }

    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getPay_time() {
        return pay_time;
    }

    public void setPay_time(Date pay_time) {
        this.pay_time = pay_time;
    }

    public String getGet_type() {
        return get_type;
    }

    public void setGet_type(String get_type) {
        this.get_type = get_type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getOrder_code() {
        return order_code;
    }

    public void setOrder_code(String order_code) {
        this.order_code = order_code;
    }
}
