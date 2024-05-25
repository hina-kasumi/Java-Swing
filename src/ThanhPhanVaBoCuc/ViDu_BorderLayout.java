package ThanhPhanVaBoCuc;

import javax.swing.*;
import java.awt.*;

public class ViDu_BorderLayout extends JFrame {
    ViDu_BorderLayout(){
        this.setTitle("ViDu_FlowLayout");
        this.setSize(600, 400);

        //căn giữa cửa sổ chương trình
        this.setLocationRelativeTo(null);

        //set layout
        //layout chia theo các hướng đông tây nam bắc
        BorderLayout borderLayout = new BorderLayout();
        BorderLayout borderLayout_1 = new BorderLayout(15, 15);
        this.setLayout(borderLayout);

        //tạo button
        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");
        JButton jButton_4 = new JButton("4");
        JButton jButton_5 = new JButton("5");

        //add thành phần
        this.add(jButton_1, BorderLayout.NORTH);
        this.add(jButton_2, BorderLayout.SOUTH);
        this.add(jButton_3, BorderLayout.WEST);
        this.add(jButton_4, BorderLayout.EAST);
        this.add(jButton_5, BorderLayout.CENTER);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ViDu_BorderLayout();
    }
}
