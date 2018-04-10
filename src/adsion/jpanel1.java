package adsion;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Vector;

public class jpanel1 {
    JPanel jpanel1;
    public jpanel1(){
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model); // 用数据模型创建JTable，JTable会自动监听到数据模型中的数据改变并显示出来
        JScrollPane jsp = new JScrollPane(table); // 用列表创建可滚动的Panel，把这个Panel添加到窗口中
        Vector names = new Vector();// 列名向量，使用它的add()方法添加列名

    }
}
