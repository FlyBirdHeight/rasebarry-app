package adsion;

import adsion.bean.All;
import adsion.bean.UserInfo;
import adsion.utils.Http;
import java.awt.event.ActionListener;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;


public class Login {
    private cardlayout cardlayout;
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
                UserInfo users = new UserInfo();
                users.setEmail(name);
                users.setPassword(password);
                All data = Http.jsonPost("http://101.132.71.227/api/login",users);
                if (data.status.equals("success")){
                    cardlayout.authorization = data.getToken().getToken_type()+" "+data.getToken().getAccess_token();
                    cardlayout.userInfo = data.getUserInfo();
                    new cardlayout();
                    frame.setVisible(false);
                }else{
//                    JOptionPane.showConfirmDialog(null, "账号或密码错误", "登陆失败", JOptionPane.YES_NO_OPTION);
                    JOptionPane.showMessageDialog(null, "账号或密码错误", "登陆失败",JOptionPane.ERROR_MESSAGE);
                    user.setText("");
                    pwd.setText("");
                }
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
