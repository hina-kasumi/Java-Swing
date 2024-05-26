package MauNenVaMauChu.View;

import MauNenVaMauChu.Controller.MyColorListener;
import MauNenVaMauChu.Model.MyColorModel;

import javax.swing.*;
import java.awt.*;

public class MyColorView extends JFrame {
    private MyColorModel myColorModel;
    private JLabel jLabel;

    public MyColorView(){
        this.myColorModel = new MyColorModel();
        this.init();
    }

    private void init() {
        this.setTitle("My Color");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font_text = new Font("Arial", Font.BOLD, 100);
        jLabel = new JLabel("TEXT", JLabel.CENTER);
        jLabel.setFont(font_text); // áp dụng phông chữ cho Label
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2, 3));

        Font font = new Font("Arial", Font.BOLD, 25);
        MyColorListener myColorListener = new MyColorListener(this);

        //chữ màu đỏ
        JButton jButton_text_red = new JButton("Red Text");
        jButton_text_red.setFont(font); // áp dụng kiểu chữ cho chữ trên nút
        jButton_text_red.setForeground(Color.red); // hàm gán màu cho chữ
        jButton_text_red.addActionListener(myColorListener);

        //chữ màu vàng
        JButton jButton_text_yellow = new JButton("Yellow Text");
        jButton_text_yellow.setFont(font); // áp dụng kiểu chữ cho chữ trên nút
        jButton_text_yellow.setForeground(Color.YELLOW); // hàm gán màu cho chữ
        jButton_text_yellow.addActionListener(myColorListener);

        //chữ màu xanh
        JButton jButton_text_green = new JButton("Green Text");
        jButton_text_green.setFont(font); // áp dụng kiểu chữ cho chữ trên nút
        jButton_text_green.setForeground(Color.GREEN); // hàm gán màu cho chữ
        jButton_text_green.addActionListener(myColorListener);


        //màu nền đỏ
        JButton jButton_background_red = new JButton("Red Background");
        jButton_background_red.setFont(font); // áp dụng kiểu chữ cho chữ trên nút
        jButton_background_red.setBackground(Color.RED); // tô màu cho nền nút
        jButton_background_red.setOpaque(true); // tạo viền cho nút
        jButton_background_red.setBorderPainted(false); // fix bug không hiện màu trên macbook
        jButton_background_red.addActionListener(myColorListener);

        //màu nền vàng
        JButton jButton_background_Yellow = new JButton("Yellow Background");
        jButton_background_Yellow.setFont(font); // áp dụng kiểu chữ cho chữ trên nút
        jButton_background_Yellow.setBackground(Color.YELLOW); // tô màu cho nền nút
        jButton_background_Yellow.setOpaque(true); // tạo viền cho nút
        jButton_background_Yellow.setBorderPainted(false); // fix bug không hiện màu trên macbook
        jButton_background_Yellow.addActionListener(myColorListener);

        //màu nền xanh
        JButton jButton_background_green = new JButton("Green Background");
        jButton_background_green.setFont(font); // áp dụng kiểu chữ cho chữ trên nút
        jButton_background_green.setBackground(Color.GREEN); // tô màu cho nền nút
        jButton_background_green.setOpaque(true); // tạo viền cho nút
        jButton_background_green.setBorderPainted(false); // fix bug không hiện màu trên macbook
        jButton_background_green.addActionListener(myColorListener);




        jPanel.add(jButton_text_red);
        jPanel.add(jButton_text_yellow);
        jPanel.add(jButton_text_green);

        jPanel.add(jButton_background_red);
        jPanel.add(jButton_background_Yellow);
        jPanel.add(jButton_background_green);


        this.add(jLabel, BorderLayout.NORTH);
        this.add(jPanel, BorderLayout.CENTER);


        this.setVisible(true);
    }


    public void changeTextColor(Color color) {
        this.jLabel.setForeground(color); // tô màu chữ
    }

    public void changeBackGroundColor(Color color) {
        this.jLabel.setBackground(color); // tô màu nền
        this.jLabel.setOpaque(true); // tô màu viền
    }
}
