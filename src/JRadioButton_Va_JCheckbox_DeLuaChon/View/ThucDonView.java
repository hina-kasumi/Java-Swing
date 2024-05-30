package JRadioButton_Va_JCheckbox_DeLuaChon.View;

import JRadioButton_Va_JCheckbox_DeLuaChon.Controller.ThucDonController;
import JRadioButton_Va_JCheckbox_DeLuaChon.Model.ThucDonModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class ThucDonView extends JFrame {
    public final ThucDonModel thucDonModel;
    public JRadioButton jRadioButton_Com, jRadioButton_Pho, jRadioButton_BanhMi;
    public ButtonGroup buttonGroup_MonChinh;
    public ArrayList<JCheckBox> list_MonPhu;
    public JCheckBox jCheckBox_TraSua, jCheckBox_Coca, jCheckBox_Nem, jCheckBox_BanhNgot;
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
        jPanel_MonChinh.setLayout(new GridLayout(1, 3));
        jRadioButton_Com = new JRadioButton("Cơm");
        jRadioButton_Com.setFont(font);
        jRadioButton_Pho = new JRadioButton("Phở");
        jRadioButton_Pho.setFont(font);
        jRadioButton_BanhMi = new JRadioButton("Bánh Mì");
        jRadioButton_BanhMi.setFont(font);
        //jRadioButton chỉ chọn được 1
        //nhóm các món chính vào 1 khu vực chỉ được chọn một trong các món này
        // chỉ group về mặt ý nghĩa chứ không về mặt hiển thị
        buttonGroup_MonChinh = new ButtonGroup();
        //add từng món vào
        buttonGroup_MonChinh.add(jRadioButton_Com);
        buttonGroup_MonChinh.add(jRadioButton_Pho);
        buttonGroup_MonChinh.add(jRadioButton_BanhMi);
        //thêm vào jPanel
        jPanel_MonChinh.add(jRadioButton_Com);
        jPanel_MonChinh.add(jRadioButton_Pho);
        jPanel_MonChinh.add(jRadioButton_BanhMi);

//món phụ
        JPanel jPanel_MonPhu = new JPanel();
        //jCheckBox có thể chọn nhiều đối tượng được
        jPanel_MonPhu.setLayout(new GridLayout(2,2));
        jCheckBox_TraSua = new JCheckBox("Trà Sữa");
        jCheckBox_TraSua.setFont(font);
        jCheckBox_Coca = new JCheckBox("Coca");
        jCheckBox_Coca.setFont(font);
        jCheckBox_BanhNgot = new JCheckBox("Bánh Ngọt");
        jCheckBox_BanhNgot.setFont(font);
        jCheckBox_Nem = new JCheckBox("Nem");
        jCheckBox_Nem.setFont(font);

        //add Món Phụ
        list_MonPhu = new ArrayList<JCheckBox>();
        list_MonPhu.add(jCheckBox_TraSua);
        list_MonPhu.add(jCheckBox_Coca);
        list_MonPhu.add(jCheckBox_BanhNgot);
        list_MonPhu.add(jCheckBox_Nem);

        jPanel_MonPhu.add(jCheckBox_TraSua);
        jPanel_MonPhu.add(jCheckBox_Coca);
        jPanel_MonPhu.add(jCheckBox_BanhNgot);
        jPanel_MonPhu.add(jCheckBox_Nem);



        //lựa chọn
        JPanel jPanel_LuaChon = new JPanel();
        jPanel_LuaChon.setLayout(new GridLayout(2,1));
        jPanel_LuaChon.add(jPanel_MonChinh);
        jPanel_LuaChon.add(jPanel_MonPhu);
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
