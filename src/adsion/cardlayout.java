package adsion;

import adsion.bean.ShopInfo;
import adsion.bean.UserInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    JPanel p_1=null,p_2=null,p_3=null,p_4=null,p_5=null,p_6=null,p_7=null;
    CardLayout card = new CardLayout();
    JTextField jtf2;
    public static String name;
    public cardlayout(){
        super("码立方");
        cardPanel.setLayout(card);
        String arr[] = {"二维码","店内客流查看","订单查看","商品信息录入","音乐设置","收益情况","通知查看"};
        p_1 = new JPanel();
        p_1.setLayout(null);
        p_1.setBounds(0,0,500,300);
        ImageIcon img = new ImageIcon("./aevzqgdrbhctlxonmwjyfipuk.png");
        img.setImage(img.getImage().getScaledInstance(270,270,Image.SCALE_DEFAULT));
        JLabel jl1 = new JLabel();
        jl1.setIcon(img);
        jl1.setBounds(105,0,270,270);
        jtf2 = new JTextField(10);
        p_1.add(jl1);

        p_2 = new JPanel();
        p_3 = new JPanel();
        p_4 = new JPanel();
        p_5 = new JPanel();
        p_6 = new JPanel();
        p_7 = new JPanel();

        p_2.add(new JLabel("店内客流查看"));
        p_3.add(new JLabel("订单查看"));
        p_4.add(new JLabel("一维码录入"));
        p_5.add(new JLabel("音乐设置"));
        p_6.add(new JLabel("收益情况"));
        p_7.add(new JLabel("通知查看"));

        p_4.add(jtf2);
        cardPanel.add(p_1,"p1");
        cardPanel.add(p_2,"p2");
        cardPanel.add(p_3,"p3");
        cardPanel.add(p_4,"p4");
        cardPanel.add(p_5,"p5");
        cardPanel.add(p_6,"p6");
        cardPanel.add(p_7,"p7");

        jb1 = new JButton(arr[0]);
        jb2 = new JButton(arr[1]);
        jb3 = new JButton(arr[2]);
        jb4 = new JButton(arr[3]);
        jb5 = new JButton(arr[4]);
        jb6 = new JButton(arr[5]);
        jb7 = new JButton(arr[6]);
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
        System.out.println(this.authorization);
        Container container = getContentPane();
        container.add(cardPanel,BorderLayout.CENTER);
        container.add(controlpaPanel,BorderLayout.NORTH);
        setSize(700,350);
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

}
