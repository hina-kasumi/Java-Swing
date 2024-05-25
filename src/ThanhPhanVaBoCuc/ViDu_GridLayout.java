package ThanhPhanVaBoCuc;

import javax.swing.*;
import java.awt.*;

public class ViDu_GridLayout extends JFrame {
    ViDu_GridLayout(){
        this.setTitle("ViDu_FlowLayout");
        this.setSize(600, 400);

        //căn giữa cửa sổ chương trình
        this.setLocationRelativeTo(null);

        //set layout
        //bố trí thành phần trên 1 cái lưới
        GridLayout gridLayout = new GridLayout();
        GridLayout gridLayout_1 = new GridLayout(4, 4);
        GridLayout gridLayout_2 = new GridLayout(4, 4, 25,25);
        this.setLayout(gridLayout_1);

        //tạo button
//        JButton jButton_1 = new JButton("1");
//        JButton jButton_2 = new JButton("2");
//        JButton jButton_3 = new JButton("3");
        for (int i = 0; i < 16; i++) {
            JButton jButton = new JButton(i + "");
            this.add(jButton);
        }

        //add thành phần
//        this.add(jButton_1);
//        this.add(jButton_2);
//        this.add(jButton_3);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ViDu_GridLayout();
    }
}
