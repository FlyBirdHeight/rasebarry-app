package adsion;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class DataReceiver extends JPanel {
    private List<Integer> values;                      // 保存接收到的数据的容器.
    private static final int MAX_VALUE = 200;          // 接收到的数据的最大值.
    private static final int MAX_COUNT_OF_VALUES = 50; // 最多保存数据的个数.

    public DataReceiver() {
        values = Collections.synchronizedList(new ArrayList<Integer>());
        generateData();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);


        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int x = 30;
        int y = 100;
        Font fn = new Font("微软雅黑", Font.BOLD, 22);
        Font fn2 = new Font("微软雅黑", Font.BOLD, 20);

        int w = getWidth();
        int h = getHeight();
        int xDelta = w / MAX_COUNT_OF_VALUES;
        int length = values.size();

        g2d.setColor(Color.black);
        g2d.fillRect(25, 5, 2, 596);
        g2d.fillRect(25, 600, 626, 2);
        g2d.fillRect(25, 586, 15, 15);
        for (int i = 0; i < 37; i++)
        {
            g2d.drawString("0", x - 20, 606);
            if (i % 2 == 0 && i / 2 != 0)
            {
                g2d.drawLine(25 + i * 15, 5, 25 + i * 15, 601);
                g2d.drawLine(25,  606 - i / 2 * 30, 600, 606 - i / 2 * 30);
                g2d.drawString(String.valueOf(i / 2), x - 20, 616 - i / 2 * 30);
                g2d.drawString(String.valueOf(i / 2), x - 5 + i / 2 * 30, 616);
            }
        }


        for (int i = 0; i < length - 1; ++i) {
            g2d.drawLine(xDelta * (MAX_COUNT_OF_VALUES - length + i), normalizeValueForYAxis(values.get(i), h),
                    xDelta * (MAX_COUNT_OF_VALUES - length + i + 1), normalizeValueForYAxis(values.get(i + 1), h));
        }


//        g2d.setFont(fn2);
//        g2d.setColor(Color.white);
//        g2d.drawString("A", 355, 350);
        g2d.setFont(fn);
        g2d.setColor(Color.black);
        g2d.drawString("Y", 5, 35);
        g2d.drawString("X", 600, 616);
//        g2d.fillPolygon(pox,poy,3);
//        g2d.fillPolygon(poxx,poyy,3);
//
//        g2d.fillPolygon(poxB,poyB,3);
//        g2d.fillPolygon(poxBB,poyBB,3);
        g2d.dispose();
    }

    /**
     * 接收到的数据放入内存.
     * @param value
     */
    private void addValue(int value) {
        // 循环的使用一个接收数据的空间.
        // 最好是实现一个循环数组，而不是偷懒的使用ArrayList.
        if (values.size() > MAX_COUNT_OF_VALUES) {
            values.remove(0);
        }

        values.add(value);
    }

    private void generateData() {
        // 使用一个线程模拟产生数据.
        new Thread(new Runnable() {
            @Override
            public void run() {
                Random rand = new Random();
                try {
                    while (true) {
                        addValue(rand.nextInt(30)+55); // 产生一个数据，并模拟接收并放到容器里.
                        repaint();
                        Thread.sleep(2000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    /**
     * 规一化y轴方向的值. 使得value在y轴的值为[0, height]之间.
     *
     * @param value
     * @param height
     * @return
     */
    private int normalizeValueForYAxis(int value, int height) {
        return (int) ((double) height / MAX_VALUE * value);
    }

    private static void createGuiAndShow() {
        JFrame frame = new JFrame("");

        frame.getContentPane().add(new DataReceiver());

        // Set frame's close operation and location in the screen.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        createGuiAndShow();
    }
}
