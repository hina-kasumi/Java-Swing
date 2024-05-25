package ThanhPhanVaBoCuc;

import javax.swing.*;
import java.awt.*;

public class ViDu_FlowLayout extends JFrame {
    ViDu_FlowLayout(){
        this.setTitle("ViDu_FlowLayout");
        this.setSize(600, 400);

        //căn giữa cửa sổ chương trình
        this.setLocationRelativeTo(null);

        //set layout
        //layout chảy theo 1 dùng chảy từ trái sang phải
        FlowLayout flowLayout = new FlowLayout();
        FlowLayout flowLayout_1 = new FlowLayout(FlowLayout.RIGHT);
        FlowLayout flowLayout_2 = new FlowLayout(FlowLayout.CENTER, 50, 50);
        this.setLayout(flowLayout_2);

        //tạo button
        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");

        //add thành phần
        this.add(jButton_1);
        this.add(jButton_2);
        this.add(jButton_3);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ViDu_FlowLayout();
    }
}
