package adsion.bean;

import java.util.List;

public class GoodsLists {
    private String status;
    private List<GoodsList> goodsList;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public List<GoodsList> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<GoodsList> goodsList) {
        this.goodsList = goodsList;
    }

    @Override
    public String toString() {
        return "Message{" +
                "status='" + status + '\'' +
                ", goodsList=" + goodsList +
                '}';
    }
}
