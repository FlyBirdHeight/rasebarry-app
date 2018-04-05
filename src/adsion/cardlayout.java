package adsion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cardlayout extends JFrame implements ActionListener{
    JButton jb1;
    JButton jb2;
    JButton jb3;
    JButton jb4;
    Image img;
    Panel cardPanel = new Panel();
    Panel controlpaPanel = new Panel();
    JPanel p_1=null,p_2=null,p_3=null,p_4=null;
    CardLayout card = new CardLayout();
    JTextField jtf2;
    public cardlayout(){
        super("码立方");
        cardPanel.setLayout(card);
        String arr[] = {"二维码","店内客流查看","订单查看","其他信息设置"};
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

        p_2.add(new JLabel("JPanel_2"));
        p_3.add(new JLabel("JPanel_3"));
        p_4.add(new JLabel("一维码录入"));
        p_4.add(jtf2);
        cardPanel.add(p_1,"p1");
        cardPanel.add(p_2,"p2");
        cardPanel.add(p_3,"p3");
        cardPanel.add(p_4,"p4");
        jb1 = new JButton(arr[0]);
        jb2 = new JButton(arr[1]);
        jb3 = new JButton(arr[2]);
        jb4 = new JButton(arr[3]);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        controlpaPanel.add(jb1);
        controlpaPanel.add(jb2);
        controlpaPanel.add(jb3);
        controlpaPanel.add(jb4);
        Container container = getContentPane();
        container.add(cardPanel,BorderLayout.CENTER);
        container.add(controlpaPanel,BorderLayout.NORTH);
        setSize(500,350);
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
    }

    public static void main(String[] args) {
        cardlayout kapian = new cardlayout();
    }
}
