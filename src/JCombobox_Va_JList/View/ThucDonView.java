package JCombobox_Va_JList.View;

import JCombobox_Va_JList.Controller.ThucDonController;
import JCombobox_Va_JList.Model.ThucDonModel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class ThucDonView extends JFrame {
    public final ThucDonModel thucDonModel;
    public JComboBox<String> jComboBox_MonChinh;
    public JList<String> jList_MonPhu;
    public JLabel jLabel_ThongTin;
    public JButton jButton_ThanhToan;


    public ThucDonView() throws HeadlessException {
        this.thucDonModel = new ThucDonModel();
        this.init();
    }

    private void init() {
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        ThucDonController thucDonController = new ThucDonController(this);

        Font font = new Font("Arial", Font.BOLD, 40);

        JLabel header = new JLabel("Thực Đơn");
        header.setFont(font);

        JPanel jPanel_TieuDe = new JPanel();
        jPanel_TieuDe.add(header);
        this.add(jPanel_TieuDe, BorderLayout.NORTH);

//món chính
        JPanel jPanel_MonChinh = new JPanel();
        jPanel_MonChinh.setLayout(new FlowLayout());
        String[] cacMonChinh = new String[]{"Cơm", "Phở", "Bánh Mì"};
        jComboBox_MonChinh = new JComboBox<>(cacMonChinh);
        jComboBox_MonChinh.setFont(font);

        //thêm vào jPanel
        jPanel_MonChinh.add(jComboBox_MonChinh);

//món phụ
        JPanel jPanel_MonPhu = new JPanel();
        //jCheckBox có thể chọn nhiều đối tượng được
        jPanel_MonPhu.setLayout(new GridLayout(2,2));
        String[] cacMonPhu = new String[]{"Trà Sữa", "Coca", "Bánh Ngọt", "Nem"};
        jList_MonPhu = new JList<String>(cacMonPhu);
        jList_MonPhu.setFont(font);
        jPanel_MonPhu.add(jList_MonPhu);


        //lựa chọn
        JPanel jPanel_LuaChon = new JPanel();
        jPanel_LuaChon.setLayout(new BorderLayout());
        jPanel_LuaChon.add(jPanel_MonChinh, BorderLayout.NORTH);
        jPanel_LuaChon.add(jPanel_MonPhu, BorderLayout.CENTER);
        this.add(jPanel_LuaChon, BorderLayout.CENTER);

//thanh toán
        JPanel jPanel_ThanhToan = new JPanel();
        jPanel_ThanhToan.setLayout(new GridLayout(1,2));
        jLabel_ThongTin = new JLabel();
        jLabel_ThongTin.setForeground(Color.RED);
        jButton_ThanhToan = new JButton("Thanh Toán");
        jButton_ThanhToan.setFont(font);
        jButton_ThanhToan.addActionListener(thucDonController);
        jPanel_ThanhToan.add(jLabel_ThongTin);
        jPanel_ThanhToan.add(jButton_ThanhToan);
        this.add(jPanel_ThanhToan, BorderLayout.SOUTH);


        this.setVisible(true);
    }

    public void hienThiKetQua() {
        String ketQua = "Món Chính: " +  this.thucDonModel.getLuaChon_MonChinh()
                + "Món Phụ: " + this.thucDonModel.getLuaChon_MonPhu()
                + "Tổng Tiền: " + this.thucDonModel.getTongTien();
        this.jLabel_ThongTin.setText(ketQua);
    }
}
