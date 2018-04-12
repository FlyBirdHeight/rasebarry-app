package adsion;

import adsion.bean.GoodsList;
import adsion.bean.GoodsLists;
import adsion.utils.Border;
import adsion.utils.Http;
import com.google.gson.Gson;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class jpanel1 implements ActionListener{
    JPanel jpanel1 = new JPanel();
    JPanel jPanel = new JPanel();
    JPanel jPanel2 = new JPanel();
    JPanel jPanel3= new JPanel();

    JTable table;

    JButton addBtn;
    JButton delBtn;

    JLabel label1;
    JLabel label2;
    JLabel label3;

    JTextField ja1;
    JTextField ja2;
    JTextField ja3;
    Gson gson;
    JScrollPane jscrollpane = new JScrollPane();
    DefaultTableModel defaultModel = null;
    List<GoodsList> goodsLists = new ArrayList<GoodsList>();
    public jpanel1(){
        goodsLists = getData();
        try{
            Thread.sleep(2500);
        }catch (Exception e){
            e.printStackTrace();
        }

        addBtn = new JButton("添加");
        delBtn = new JButton("删除");
        addBtn.addActionListener(this);
        delBtn.addActionListener(this);
        Font font = new Font("微软雅黑",Font.BOLD,20);

        label1 = new JLabel("商品名称：");
        label2 = new JLabel("条形码：");
        label3 = new JLabel("价格：");
        label1.setFont(font);
        label2.setFont(font);
        label3.setFont(font);

        ja1 = new JTextField(10);
        ja1.setBorder(new Border());
        ja2 = new JTextField(15);
        ja2.setBorder(new Border());
        ja3 = new JTextField(10);
        ja3.setBorder(new Border());

        Object[] columnNames = new Object[]{"条形码","价格","商品名称"};//列名
        Object[][] rowData = new Object[0][3];//行数，列数
//        Vector names = new Vector();
        defaultModel = new DefaultTableModel(rowData, columnNames);
        table = new JTable(defaultModel);
        table.setPreferredScrollableViewportSize(new Dimension(700, 300));
        Vector data = new Vector(); // 数据行向量集，因为列表不止一行，往里面添加数据行向量，添加方法add(row)

        for(GoodsList goodsList: goodsLists){
            System.out.println(goodsList.toString());
            Vector row = new Vector();
            String[] value = new String[3];
            value[0] = goodsList.getIsbn();
            value[1] = goodsList.getPrice()+"";
            value[2] = goodsList.getName();
            row.add(value[0]);
            row.add(value[1]);
            row.add(value[2]);
            defaultModel.addRow(row);
        }

        jscrollpane.setViewportView(table);
        table.getTableHeader().setBackground(new Color(255,255,255));
        table.setRowHeight(40);


        jPanel.setLayout(new GridLayout(4,2,1,2));
        jPanel.add(label1);
        jPanel.add(ja1);
        jPanel.add(label2);
        jPanel.add(ja2);
        jPanel.add(label3);
        jPanel.add(ja3);
        jPanel2.add(jPanel);
        jPanel2.add(addBtn);
        jPanel2.add(delBtn);
        jpanel1.setLayout(new BorderLayout());
        jpanel1.add(jscrollpane);
        jPanel3.add(jPanel2);
        jPanel3.add(jpanel1);
        jPanel3.setLayout(new GridLayout(1,2));
    }

    public List<GoodsList> getData(){
        gson = new Gson();
        int shop_id = cardlayout.shopInfo.getId();
        String data = Http.getInfo("http://101.132.71.227/api/shop/getList/"+shop_id,cardlayout.authorization);
        GoodsLists goodsLists = gson.fromJson(data,GoodsLists.class);
        System.out.println(data);
        return goodsLists.getGoodsList();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("添加")) {
            // 如果点击"增加行"按钮后，会在表中增加一行
            if(label1.getText()!=""&&label2.getText()!=""&&label3.getText()!=""){
                GoodsList goodsList = new GoodsList();
                goodsList.setIsbn(ja2.getText());
                goodsList.setName(ja1.getText());
                goodsList.setPrice(Double.parseDouble(ja3.getText()));
                goodsList.setShop_id(cardlayout.shopInfo.getId());
                String status = Http.useGoodsList("http://101.132.71.227/api/shop/insertList",goodsList,cardlayout.authorization);
                System.out.println(status);
                if(status.equals("{\"status\":\"success\"}")){
                    Vector row = new Vector();
                    row.add(ja2.getText());
                    row.add(ja3.getText());
                    row.add(ja1.getText());
                    defaultModel.addRow(row);
                    ja1.setText("");
                    ja2.setText("");
                    ja3.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "网络故障", "添加失败",JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "信息不能为空", "添加失败",JOptionPane.ERROR_MESSAGE);
            }

        }
        if (e.getActionCommand().equals("删除")) {
            int numrow=table.getSelectedRows().length;

            String a = table.getValueAt(table.getSelectedRow(),0).toString();
            GoodsList goodsList = new GoodsList();
            goodsList.setIsbn(a);
            String status = Http.useGoodsList("http://101.132.71.227/api/shop/delList",goodsList,cardlayout.authorization);
            System.out.println(status);
            if (status.equals("success")){
                // getRowCount返回行数，rowcount<0代表已经没有行了
                for (int i=0;i<numrow;i++){
                    //删除所选行;
                    defaultModel.removeRow(table.getSelectedRow());
                }
            }else{
                JOptionPane.showMessageDialog(null, "网络故障", "删除失败",JOptionPane.ERROR_MESSAGE);
            }

        }
        table.revalidate();
    }

    public static void main(String[] args) {

        new jpanel1();
    }
}

