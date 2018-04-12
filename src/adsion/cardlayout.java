package adsion;

import adsion.bean.GoodsList;
import adsion.bean.GoodsLists;
import adsion.bean.ShopInfo;
import adsion.bean.UserInfo;
import adsion.utils.ButtonUi;
import adsion.utils.Http;
import com.google.gson.Gson;
import javafx.scene.control.Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class cardlayout extends JFrame implements ActionListener{
    public static UserInfo userInfo;
    public static String authorization;
    public static ShopInfo shopInfo;
    JButton jb1;
    JButton jb2;
    JButton jb3;
    JButton jb4;
    JButton jb5;
    JButton jb6;
    JButton jb7;
    Image img;
    Panel cardPanel = new Panel();
    Panel controlpaPanel = new Panel();
    JPanel p_1=null,p_2=null,p_3=null,p_5=null,p_6=null,p_7=null;
    jpanel1 p_4;
    CardLayout card = new CardLayout();
    JTextField jtf2;
    Gson gson;
    public static String name;
    public cardlayout(){
        super("码立方");

        gson = new Gson();
        String shopInfo01 = Http.getInfo("http://101.132.71.227/api/user/getShop/"+userInfo.getId(),authorization);
        shopInfo = gson.fromJson(shopInfo01,ShopInfo.class);




        cardPanel.setLayout(card);
        String arr[] = {"二维码","店内客流查看","订单查看","商品信息录入","音乐设置","收益情况","通知查看"};
        p_1 = new JPanel();
        p_1.setLayout(null);
        p_1.setBounds(0,0,500,300);
        ImageIcon img = new ImageIcon("./aevzqgdrbhctlxonmwjyfipuk.png");
        img.setImage(img.getImage().getScaledInstance(270,270,Image.SCALE_DEFAULT));
        JLabel jl1 = new JLabel();
        jl1.setIcon(img);
        jl1.setBounds(200,0,270,270);
        jtf2 = new JTextField(10);
        p_1.add(jl1);

        p_2 = new DataReceiver();
        p_3 = new jpanel3().jPanel;

        p_4 = new jpanel1();

        p_5 = new JPanel();
        p_6 = new jpanel2().panel;
        p_7 = new JPanel();

//        p_3.add(new JLabel("订单查看"));
        p_5.add(new JLabel("音乐设置"));
        p_6.add(new JLabel("收益情况"));
        p_7.add(new JLabel("通知查看"));

        cardPanel.add(p_1,"p1");
        cardPanel.add(p_2,"p2");
        cardPanel.add(p_3,"p3");
        cardPanel.add(p_4.jPanel3,"p4");
        cardPanel.add(p_5,"p5");
        cardPanel.add(p_6,"p6");
        cardPanel.add(p_7,"p7");

        jb1 = new ButtonUi(arr[0]);
        jb1.setFont(new Font("微软雅黑", Font.BOLD, 16));


        jb2 = new ButtonUi(arr[1]);
        jb2.setFont(new Font("微软雅黑", Font.BOLD, 16));
        jb3 = new ButtonUi(arr[2]);
        jb3.setFont(new Font("微软雅黑", Font.BOLD, 16));
        jb4 = new ButtonUi(arr[3]);
        jb4.setFont(new Font("微软雅黑", Font.BOLD, 16));
        jb5 = new ButtonUi(arr[4]);
        jb5.setFont(new Font("微软雅黑", Font.BOLD, 16));
        jb6 = new ButtonUi(arr[5]);
        jb6.setFont(new Font("微软雅黑", Font.BOLD, 16));
        jb7 = new ButtonUi(arr[6]);
        jb7.setFont(new Font("微软雅黑", Font.BOLD, 16));
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        jb5.addActionListener(this);
        jb6.addActionListener(this);
        jb7.addActionListener(this);

        controlpaPanel.add(jb1);
        controlpaPanel.add(jb2);
        controlpaPanel.add(jb3);
        controlpaPanel.add(jb4);
        controlpaPanel.add(jb5);
        controlpaPanel.add(jb6);
        controlpaPanel.add(jb7);
        Container container = getContentPane();
        container.add(cardPanel,BorderLayout.CENTER);
        container.add(controlpaPanel,BorderLayout.NORTH);
        setSize(778,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==jb1){
            card.show(cardPanel,"p1");
        }
        if (e.getSource()==jb2){
            card.show(cardPanel,"p2");
        }
        if(e.getSource()==jb3){
            card.show(cardPanel,"p3");
        }
        if (e.getSource()==jb4){
//            List<GoodsList> goodsLists=jpanel1.goodsLists();
            card.show(cardPanel,"p4");
        }
        if (e.getSource()==jb5){
            card.show(cardPanel,"p5");
        }
        if (e.getSource()==jb6){
            card.show(cardPanel,"p6");
        }
        if (e.getSource()==jb7){
            card.show(cardPanel,"p7");
        }
    }



    public static void main(String[] args) {
        new cardlayout();

    }
}
