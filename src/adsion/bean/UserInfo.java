package adsion.bean;

public class UserInfo {
    public int id;
    public String name;
    public String email;
    public String password;
    public String phone;
    public int comment_count;
    public int order_count;
    public int points;
    public int stop_time_avg;
    public int month_pay_avg;
    public int age;
    public int money;
    public ShopInfo shopInfo;
    public Order order;

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", comment_count=" + comment_count +
                ", order_count=" + order_count +
                ", points=" + points +
                ", stop_time_avg=" + stop_time_avg +
                ", month_pay_avg=" + month_pay_avg +
                ", age=" + age +
                ", money=" + money +
                ", shopInfo=" + shopInfo +
                ", order=" + order +
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getComment_count() {
        return comment_count;
    }

    public void setComment_count(int comment_count) {
        this.comment_count = comment_count;
    }

    public int getOrder_count() {
        return order_count;
    }

    public void setOrder_count(int order_count) {
        this.order_count = order_count;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getStop_time_avg() {
        return stop_time_avg;
    }

    public void setStop_time_avg(int stop_time_avg) {
        this.stop_time_avg = stop_time_avg;
    }

    public int getMonth_pay_avg() {
        return month_pay_avg;
    }

    public void setMonth_pay_avg(int month_pay_avg) {
        this.month_pay_avg = month_pay_avg;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getEmail() {
        return email;
    }

    public ShopInfo getShopInfo() {
        return shopInfo;
    }

    public void setShopInfo(ShopInfo shopInfo) {
        this.shopInfo = shopInfo;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
