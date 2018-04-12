package adsion.bean;

public class GoodsList {
    public int shop_id;
    public int id;
    public double price;
    public String isbn;
    public String name;


    @Override
    public String toString() {
        return "GoodsList{" +
                "shop_id=" + shop_id +
                ", id=" + id +
                ", price=" + price +
                ", isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public int getShop_id() {
        return shop_id;
    }

    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
