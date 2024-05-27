package JScrollPane_VaHienThiThanhCuon.View;

import JScrollPane_VaHienThiThanhCuon.Listener.TimKiemListener;
import JScrollPane_VaHienThiThanhCuon.Model.TimKiemModel;

import javax.swing.*;
import java.awt.*;

public class TimKiemView extends JFrame {
    private final TimKiemModel timKiemModel = new TimKiemModel();
    JTextArea jTextArea_vanBan;
    JTextField jTextField_tuKhoa;
    JLabel jLabel_ketQua;
    public TimKiemView (){
        this.init();
    }

    private void init() {
        this.setTitle("");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font = new Font("Arial", Font.BOLD, 40);


        //Center văn bản
        JLabel jLabel_vanBan = new JLabel("Văn Bản");
        jLabel_vanBan.setFont(font);
        //Nhập văn bản nhiều dòng có thể gán số lượng đòng và số lượng cột
        jTextArea_vanBan = new JTextArea(100, 100); //tham só bên trong là giới hạn
        jTextArea_vanBan.setFont(font);

        //thêm thanh cuộn
        // JScrollPane(object, thanh cuộn dọc, thanh cuộn ngang)
        JScrollPane jScrollPane = new JScrollPane(jTextArea_vanBan, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        //jScrollPane.setViewportView(jTextArea_vanBan); //khi không có gì truyền vào JScrollPane()
        //VERTICAL: thanh cuộn dọc
        //HORIZONTAL: thanh cuộn ngang
        //ALWAY: luôn hiển thị thanh cuộn
        //AS_NEEDED: chỉ hiện thị khi cần
        //NEVER: không bao giờ hiển thị







        // Footer
        JPanel jPanel_footer = new JPanel();
        jPanel_footer.setLayout(new GridLayout(2, 2, 20 ,20));

        // từ khóa
        JLabel jLabel_tuKhoa = new JLabel("Từ Khóa");
        jLabel_tuKhoa.setFont(font);

        jTextField_tuKhoa = new JTextField();
        jTextField_tuKhoa.setFont(font);
        jPanel_footer.add(jLabel_tuKhoa);
        jPanel_footer.add(jTextField_tuKhoa);

        // nút
        TimKiemListener timKiemListener = new TimKiemListener(this);
        JButton jButton_thongKe = new JButton("Thống Kê");
        jButton_thongKe.setFont(font);
        jButton_thongKe.addActionListener(timKiemListener);
        jButton_thongKe.setBackground(Color.BLUE);
        jButton_thongKe.setBorderPainted(false);
        jButton_thongKe.setOpaque(true);

        jLabel_ketQua = new JLabel();
        jLabel_ketQua.setBackground(Color.YELLOW);
        jLabel_ketQua.setFont(font);
        jLabel_ketQua.setOpaque(true);

        jPanel_footer.add(jButton_thongKe);
        jPanel_footer.add(jLabel_ketQua);




        //cửa sổ chính
        this.setLayout(new BorderLayout());
        this.add(jLabel_vanBan, BorderLayout.NORTH);
        this.add(jScrollPane, BorderLayout.CENTER);
        this.add(jPanel_footer, BorderLayout.SOUTH);


        this.setVisible(true);
    }

    public void timKiem(){
        this.timKiemModel.setVanBan(jTextArea_vanBan.getText());
        this.timKiemModel.setTuKhoa(jTextField_tuKhoa.getText());
        this.timKiemModel.timKiem();
        this.jLabel_ketQua.setText(this.timKiemModel.getKetQua());
    }
}
