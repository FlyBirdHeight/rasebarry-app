package adsion;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login {
    public Login(){
        JFrame frame = new JFrame("用户登录");
        JDialog jDialog = new JDialog(frame, "用户登录", true);

        JPanel input =new JPanel(new GridLayout(4, 4 ,10 ,10));
        JLabel userLabel = new JLabel("用户名");
        JLabel pwdLabel = new JLabel("密码");
        JButton login = new JButton("登录");

        JTextField user = new JTextField(10);
        JPasswordField pwd = new JPasswordField(10);
        login.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Object is[];
                String name = user.getText();
                String password = pwd.getText();
                System.out.println(password);

            }
        });



        frame.getContentPane().add(input);
        input.add(userLabel);
        input.add(user);
        input.add(pwdLabel);
        input.add(pwd);
        input.add(login);
//        input.add(resiger);

        int w = 700;
        int h = 400;
        frame.setLocation(w, h);


        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 200);
        frame.getContentPane().setLayout(new FlowLayout());
    }
    public static void main(String[] args) {
        new Login();

    }
}
