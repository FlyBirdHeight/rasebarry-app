package adsion;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class jpanel2{

    JPanel panel1,panel2,panel3;
    JPanel panel= new JPanel();
    JLabel l1,l2;
    JLabel date1,date2,date3;
    JLabel date1Sales,date1SalesPre1,date1SalesPre2,date1SalesPre3,date1SalesPre4,date1Order,date1OrderPre1,date1OrderPre2,date1OrderPre3,date1OrderPre4,date1People,date1PeoplePre1,date1PeoplePre2,date1PeoplePre3,date1PeoplePre4;
    JLabel date2Sales,date2SalesPre1,date2SalesPre2,date2SalesPre3,date2SalesPre4,date2Order,date2OrderPre1,date2OrderPre2,date2OrderPre3,date2OrderPre4,date2People,date2PeoplePre1,date2PeoplePre2,date2PeoplePre3,date2PeoplePre4;
    JLabel date3Sales,date3SalesPre1,date3SalesPre2,date3SalesPre3,date3SalesPre4,date3Order,date3OrderPre1,date3OrderPre2,date3OrderPre3,date3OrderPre4,date3People,date3PeoplePre1,date3PeoplePre2,date3PeoplePre3,date3PeoplePre4;

    public jpanel2(){

        panel.setLayout(null);

        Font font = new Font("微软雅黑",Font.PLAIN, 13);
        Font font2 = new Font("微软雅黑",Font.BOLD, 13);
        Font font1 = new Font("微软雅黑",Font.BOLD, 22);
        panel1 = new JPanel();
        panel1.setBounds(75, 250, 200, 200);
        panel1.setLayout(null);
        panel1.setBorder(BorderFactory.createTitledBorder("昨日"));
        panel2 = new JPanel();
        panel2.setBounds(300, 250, 200, 200);
        panel2.setLayout(null);
        panel2.setBorder(BorderFactory.createTitledBorder("近7日"));
        panel3 = new JPanel();
        panel3.setBounds(525, 250, 200, 200);
        panel3.setLayout(null);
        panel3.setBorder(BorderFactory.createTitledBorder("近30日"));

        l1 = new JLabel("今日营业额:￥" + 696.10);
        l1.setFont(font1);
        l1.setBounds(200, 105, 200, 40);
        l2 = new JLabel("有效订单:" + 30 + "单");
        l2.setFont(font1);
        l2.setBounds(450, 105, 200, 40);

        panel.add(l1);
        panel.add(l2);

//		date1 = new JLabel("昨日");
//		date1.setForeground(Color.BLUE);
//		date1.setBounds(15, 0, 26, 40);
        date1Sales = new JLabel("营业额:￥" + 536.63);
        date1Sales.setFont(font2);
        date1Sales.setBounds(15, 25, 185, 40);
        date1SalesPre1 = new JLabel("比前1日");
        date1SalesPre1.setFont(font);
        date1SalesPre1.setBounds(15, 40, 50, 40);
        date1SalesPre2 = new JLabel("下降");
        date1SalesPre2.setFont(font2);
        date1SalesPre2.setForeground(new Color(205,38,38));
        date1SalesPre2.setBounds(61, 40, 26, 40);
        date1SalesPre3 = new JLabel("" + 2.24);
        date1SalesPre3.setFont(font2);
        date1SalesPre3.setForeground(new Color(69,139,0));
        date1SalesPre3.setBounds(87, 40, 35, 40);
        date1SalesPre4 = new JLabel("%");
        date1SalesPre4.setFont(font2);
        date1SalesPre4.setBounds(122, 40, 20, 40);

        date1Order = new JLabel("有效订单:" + 23 + "单");
        date1Order.setFont(font2);
        date1Order.setBounds(15, 70, 185, 40);
        date1OrderPre1 = new JLabel("比前1日");
        date1OrderPre1.setFont(font);
        date1OrderPre1.setBounds(15, 85, 50, 40);
        date1OrderPre2 = new JLabel("下降");
        date1OrderPre2.setFont(font2);
        date1OrderPre2.setForeground(new Color(205,38,38));
        date1OrderPre2.setBounds(61, 85, 26, 40);
        date1OrderPre3 = new JLabel("" + 3.0);
        date1OrderPre3.setFont(font2);
        date1OrderPre3.setForeground(new Color(69,139,0));
        date1OrderPre3.setBounds(87, 85, 35, 40);
        date1OrderPre4 = new JLabel("%");
        date1OrderPre4.setFont(font2);
        date1OrderPre4.setBounds(122, 85, 20, 40);

        date1People = new JLabel("访店人数:" + 30);
        date1People.setFont(font2);
        date1People.setBounds(15, 115, 185, 40);
        date1PeoplePre1 = new JLabel("比前1日");
        date1PeoplePre1.setFont(font);
        date1PeoplePre1.setBounds(15, 130, 50, 40);
        date1PeoplePre2 = new JLabel("下降");
        date1PeoplePre2.setFont(font2);
        date1PeoplePre2.setForeground(new Color(205,38,38));
        date1PeoplePre2.setBounds(61, 130, 26, 40);
        date1PeoplePre3 = new JLabel("" + 5.0);
        date1PeoplePre3.setFont(font2);
        date1PeoplePre3.setForeground(new Color(69,139,0));
        date1PeoplePre3.setBounds(87, 130, 35, 40);
        date1PeoplePre4 = new JLabel("%");
        date1PeoplePre4.setFont(font2);
        date1PeoplePre4.setBounds(122, 130, 20, 40);

//		panel1.add(date1);
        panel1.add(date1Sales);
        panel1.add(date1SalesPre1);
        panel1.add(date1SalesPre2);
        panel1.add(date1SalesPre3);
        panel1.add(date1SalesPre4);
        panel1.add(date1Order);
        panel1.add(date1OrderPre1);
        panel1.add(date1OrderPre2);
        panel1.add(date1OrderPre3);
        panel1.add(date1OrderPre4);
        panel1.add(date1People);
        panel1.add(date1PeoplePre1);
        panel1.add(date1PeoplePre2);
        panel1.add(date1PeoplePre3);
        panel1.add(date1PeoplePre4);


//		date2 = new JLabel("近7日");
//		date2.setForeground(Color.BLUE);
//		date2.setBounds(290, 40, 34, 40);
        date2Sales = new JLabel("营业额:￥" + 3800);
        date2Sales.setBounds(15, 25, 185, 40);
        date2SalesPre1 = new JLabel("比前1周");
        date2SalesPre1.setBounds(15, 40, 50, 40);
        date2SalesPre2 = new JLabel("上升");
        date2SalesPre2.setForeground(new Color(205,38,38));
        date2SalesPre2.setBounds(61, 40, 26, 40);
        date2SalesPre3 = new JLabel("" + 6.9);
        date2SalesPre3.setForeground(new Color(69,139,0));
        date2SalesPre3.setBounds(87, 40, 35, 40);
        date2SalesPre4 = new JLabel("%");
        date2SalesPre4.setBounds(122, 40, 20, 40);

        date2Order = new JLabel("有效订单:" + 450 + "单");
        date2Order.setBounds(15, 70, 185, 40);
        date2OrderPre1 = new JLabel("比前1周");
        date2OrderPre1.setBounds(15, 85, 50, 40);
        date2OrderPre2 = new JLabel("上升");
        date2OrderPre2.setForeground(new Color(205,38,38));
        date2OrderPre2.setBounds(61, 85, 26, 40);
        date2OrderPre3 = new JLabel("" + 10.0);
        date2OrderPre3.setForeground(new Color(69,139,0));
        date2OrderPre3.setBounds(87, 85, 35, 40);
        date2OrderPre4 = new JLabel("%");
        date2OrderPre4.setBounds(122, 85, 20, 40);

        date2People = new JLabel("访店人数:" + 360);
        date2People.setBounds(15, 115, 185, 40);
        date2PeoplePre1 = new JLabel("比前1周");
        date2PeoplePre1.setBounds(15, 130, 50, 40);
        date2PeoplePre2 = new JLabel("上升");
        date2PeoplePre2.setForeground(new Color(205,38,38));
        date2PeoplePre2.setBounds(61, 130, 26, 40);
        date2PeoplePre3 = new JLabel("" + 7.6);
        date2PeoplePre3.setForeground(new Color(69,139,0));
        date2PeoplePre3.setBounds(87, 130, 35, 40);
        date2PeoplePre4 = new JLabel("%");
        date2PeoplePre4.setBounds(122, 130, 20, 40);

        date2Sales.setFont(font);
        date2SalesPre1.setFont(font);
        date2SalesPre2.setFont(font);
        date2SalesPre3.setFont(font);
        date2SalesPre4.setFont(font);
        date2Order.setFont(font);
        date2OrderPre1.setFont(font);
        date2OrderPre2.setFont(font);
        date2OrderPre3.setFont(font);
        date2OrderPre4.setFont(font);
        date2People.setFont(font);
        date2PeoplePre1.setFont(font);
        date2PeoplePre2.setFont(font);
        date2PeoplePre3.setFont(font);
        date2PeoplePre4.setFont(font);

//		panel2.add(date2);
        panel2.add(date2Sales);
        panel2.add(date2SalesPre1);
        panel2.add(date2SalesPre2);
        panel2.add(date2SalesPre3);
        panel2.add(date2SalesPre4);
        panel2.add(date2Order);
        panel2.add(date2OrderPre1);
        panel2.add(date2OrderPre2);
        panel2.add(date2OrderPre3);
        panel2.add(date2OrderPre4);
        panel2.add(date2People);
        panel2.add(date2PeoplePre1);
        panel2.add(date2PeoplePre2);
        panel2.add(date2PeoplePre3);
        panel2.add(date2PeoplePre4);

//		date3 = new JLabel("近30日");
//		date3.setForeground(Color.BLUE);
//		date3.setBounds(525, 40, 40, 40);
        date3Sales = new JLabel("营业额:￥" + 536.63 + "%");
        date3Sales.setBounds(15, 25, 185, 40);
        date3SalesPre1 = new JLabel("比前1日");
        date3SalesPre1.setBounds(15, 40, 50, 40);
        date3SalesPre2 = new JLabel("下降");
        date3SalesPre2.setForeground(new Color(205,38,38));
        date3SalesPre2.setBounds(61, 40, 26, 40);
        date3SalesPre3 = new JLabel("" + 18.24);
        date3SalesPre3.setForeground(new Color(69,139,0));
        date3SalesPre3.setBounds(87, 40, 35, 40);
        date3SalesPre4 = new JLabel("%");
        date3SalesPre4.setBounds(122, 40, 20, 40);

        date3Order = new JLabel("有效订单:" + 23 + "单");
        date3Order.setBounds(15, 70, 185, 40);
        date3OrderPre1 = new JLabel("比前1日");
        date3OrderPre1.setBounds(15, 85, 50, 40);
        date3OrderPre2 = new JLabel("下降");
        date3OrderPre2.setForeground(new Color(205,38,38));
        date3OrderPre2.setBounds(61, 85, 26, 40);
        date3OrderPre3 = new JLabel("" + 18.24);
        date3OrderPre3.setForeground(new Color(69,139,0));
        date3OrderPre3.setBounds(87, 85, 35, 40);
        date3OrderPre4 = new JLabel("%");
        date3OrderPre4.setBounds(122, 85, 20, 40);

        date3People = new JLabel("访店人数:" + 30);
        date3People.setBounds(15, 115, 185, 40);
        date3PeoplePre1 = new JLabel("比前1日");
        date3PeoplePre1.setBounds(15, 130, 50, 40);
        date3PeoplePre2 = new JLabel("下降");
        date3PeoplePre2.setForeground(new Color(205,38,38));
        date3PeoplePre2.setBounds(61, 130, 26, 40);
        date3PeoplePre3 = new JLabel("" + 18.24);
        date3PeoplePre3.setForeground(new Color(69,139,0));
        date3PeoplePre3.setBounds(87, 130, 35, 40);
        date3PeoplePre4 = new JLabel("%");
        date3PeoplePre4.setBounds(122, 130, 20, 40);

        date3Sales.setFont(font);
        date3SalesPre1.setFont(font);
        date3SalesPre2.setFont(font);
        date3SalesPre3.setFont(font);
        date3SalesPre4.setFont(font);
        date3Order.setFont(font);
        date3OrderPre1.setFont(font);
        date3OrderPre2.setFont(font);
        date3OrderPre3.setFont(font);
        date3OrderPre4.setFont(font);
        date3People.setFont(font);
        date3PeoplePre1.setFont(font);
        date3PeoplePre2.setFont(font);
        date3PeoplePre3.setFont(font);
        date3PeoplePre4.setFont(font);

//		panel3.add(date3);
        panel3.add(date3Sales);
        panel3.add(date3SalesPre1);
        panel3.add(date3SalesPre2);
        panel3.add(date3SalesPre3);
        panel3.add(date3SalesPre4);
        panel3.add(date3Order);
        panel3.add(date3OrderPre1);
        panel3.add(date3OrderPre2);
        panel3.add(date3OrderPre3);
        panel3.add(date3OrderPre4);
        panel3.add(date3People);
        panel3.add(date3PeoplePre1);
        panel3.add(date3PeoplePre2);
        panel3.add(date3PeoplePre3);
        panel3.add(date3PeoplePre4);

        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
    }

}

