package JFrame.view;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        //tiêu đề của cửa sổ
        jf.setTitle("Ví dụ JFrame");

        //cài đặt kích cỡ của cửa sổ
        jf.setSize(600, 400);

        //gán vị trí hiển thị
        jf.setLocation(300, 300);

        //khi cửa sổ đóng sẽ dừng chương trình
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //khi cửa số đóng ẩn đi chương trình
        //jf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        //jf.pack();


        // hiển thị cửa sổ
        jf.setVisible(true);
    }
}
