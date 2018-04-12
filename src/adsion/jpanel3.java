package adsion;

import adsion.bean.*;
import adsion.utils.Http;
import adsion.utils.RoundJPanel;
import com.google.gson.Gson;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class jpanel3 {
    JPanel jPanel = new JPanel();
    JScrollPane scroll = null;
    Gson gson;
    List<Order> orders = new ArrayList<Order>();
    public jpanel3(){
        orders = getData();
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        if (orders == null){
            System.out.println(123);
        }else{
            System.out.println(orders.size());
        }
        JPanel jbajp[]=new JPanel[orders.size()+1];
        JButton jbt[] = new JButton[orders.size()*2];
        jPanel.setPreferredSize(new Dimension(700,2000));
        scroll = new JScrollPane(jPanel);
        scroll.setBounds(0,0,700,700);
        int count = 0;
        Font font = new Font("微软雅黑",Font.BOLD,13);
        int i = 0;
        for (Order order:orders){
            List<Goods> goods = new ArrayList<Goods>();
            goods = order.getGoods();
            jbajp[i] = new JPanel();
            jbajp[i].setLayout(null);
            jbajp[i].setBackground(new Color(255,255,255));
            jbajp[i].setBorder(new RoundJPanel(true));
            jbt[count++] = new JButton("查看详情");
            jbt[count++] = new JButton("删除");
            int num1 = count-1;
            int num2 = count-2;
            jbajp[i].add(jbt[num2]);
            jbajp[i].add(jbt[num1]);
            System.out.println(count);
            jbajp[i].setPreferredSize(new Dimension(600,200));
            jbt[num2].setBounds(400,160,110,30);
            jbt[num2].setFont(new Font("微软雅黑",Font.BOLD,15));
            jbt[num1].setBounds(520,160,70,30);
            jbt[num1].setFont(new Font("微软雅黑",Font.BOLD,15));
            DateFormat mediumDateFormat = DateFormat.getDateTimeInstance
                    (DateFormat.MEDIUM,DateFormat.MEDIUM);
            Date date = order.getPay_time();
            JLabel jlabel1 = new JLabel("订单产生时间："+mediumDateFormat.format(date));

            JLabel jlabel2 = new JLabel("订单状态："+order.getStatus());
            JLabel jlabel3 = new JLabel("下单用户："+order.getUserInfo().getName());
            JLabel jlabel4 = new JLabel("支付金额："+order.getPrice());
            JLabel jlabel5 = new JLabel("订单编号："+order.getOrder_code());
            jlabel1.setFont(font);
            jlabel2.setFont(font);
            jlabel3.setFont(font);
            jlabel4.setFont(font);
            jlabel5.setFont(font);
            jlabel1.setBounds(50,25,250123,20);
            jlabel2.setBounds(50,50,100,20);
            jlabel3.setBounds(50,75,180,20);
            jlabel4.setBounds(50,100,180,20);
            jlabel5.setBounds(50,125,180,20);
            jbajp[i].add(jlabel1);
            jbajp[i].add(jlabel2);
            jbajp[i].add(jlabel3);
            jbajp[i].add(jlabel4);
            jbajp[i].add(jlabel5);

            Object[] columnNames = new Object[]{"商品名称","个数","价格"};//列名
            Object[][] rowData = new Object[0][3];//行数，列数
            DefaultTableModel defaultModel = new DefaultTableModel(rowData, columnNames);
            JTable jTable = new JTable(defaultModel);
            JScrollPane jscrollpane = new JScrollPane();
            jTable.setPreferredScrollableViewportSize(new Dimension(300, 130));
            jTable.getTableHeader().setBackground(new Color(255,255,255));
            jscrollpane.setViewportView(jTable);
            jscrollpane.setBounds(290,15,300,130);
            jTable.setRowHeight(35);
            for(Goods good: goods){
                Vector row = new Vector();
                String[] value = new String[3];
                value[0] = good.getName();
                value[1] = good.getPivot().getNum()+"";
                value[2] = good.getPivot().getPrice()+"";
                row.add(value[0]);
                row.add(value[1]);
                row.add(value[2]);
                defaultModel.addRow(row);
            }



            jbajp[i].add(jscrollpane);
            jPanel.add(jbajp[i]);
            i++;
        }

    }

    public List<Order> getData() {
        gson = new Gson();
        int shop_id = cardlayout.shopInfo.getId();
        String data = Http.getInfo("http://101.132.71.227/api/shop/getOrders/"+shop_id,cardlayout.authorization);
        Orders orders = gson.fromJson(data,Orders.class);
        System.out.println(orders.getOrder());
        return orders.getOrder();
    }


    public static void main(String[] args) {
        new jpanel3();
    }
}
