package adsion.bean;

import java.util.List;

public class Orders {
    private String status;
    private List<Order> order;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrders(List<Order> order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "status='" + status + '\'' +
                ", orders=" + order +
                '}';
    }
}
