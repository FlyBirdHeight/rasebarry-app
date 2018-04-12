package adsion.javafx;

import adsion.Login;
import adsion.bean.All;
import adsion.bean.UserInfo;
import adsion.cardlayout;
import adsion.utils.Http;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import static javafx.geometry.HPos.RIGHT;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;

public class Login2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("码立方");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("码立方商家后台");
        scenetitle.setId("welcome-text");
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("邮箱或手机号:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("密码:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Button btn = new Button("登录");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 0, 6);
        grid.setColumnSpan(actiontarget, 2);
        grid.setHalignment(actiontarget, RIGHT);
        actiontarget.setId("actiontarget");

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                actiontarget.setText("正在登录,请稍后");
                String name = userTextField.getText();
                String password = pwBox.getText();
                System.out.println(password);
                UserInfo users = new UserInfo();
                users.setEmail(name);
                users.setPassword(password);
                All data = Http.jsonPost("http://101.132.71.227/api/login",users);
                if (data.status.equals("success")){
                    cardlayout.authorization = data.getToken().getToken_type()+" "+data.getToken().getAccess_token();
                    cardlayout.userInfo = data.getUserInfo();
                    new cardlayout();
                    primaryStage.hide();
                }else{
//                    JOptionPane.showConfirmDialog(null, "账号或密码错误", "登陆失败", JOptionPane.YES_NO_OPTION);
                    JOptionPane.showMessageDialog(null, "账号或密码错误", "登陆失败",JOptionPane.ERROR_MESSAGE);
                    userTextField.setText("");
                    pwBox.setText("");
                }

            }
        });


        Scene scene = new Scene(grid, 700, 500);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(Login.class.getResource("Login.css").toExternalForm());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
