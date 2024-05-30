package HienThiCuaSoThongBao.Controller;

import HienThiCuaSoThongBao.View.ThucDonView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThucDonController implements ActionListener {
    private final ThucDonView thucDonView;

    public ThucDonController(ThucDonView thucDonView) {
        this.thucDonView = thucDonView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //món chính
        String monChinh = thucDonView.jComboBox_MonChinh.getSelectedItem().toString();

        //món phụ
        String monPhu = "";
        Object[] luaChonMonPhus = thucDonView.jList_MonPhu.getSelectedValues();
        for (Object o : luaChonMonPhus) {
            monPhu = monPhu + o.toString() + "; ";
        }

        thucDonView.thucDonModel.setLuaChon_MonChinh(monChinh);
        thucDonView.thucDonModel.setLuaChon_MonPhu(monPhu);
        thucDonView.thucDonModel.tinhTongTien();
        thucDonView.hienThiKetQua();

        //hiển thị cửa số để nhập số tiền khách trả lại
        String soTien_Chuoi = (String) JOptionPane.showInputDialog(
                thucDonView, thucDonView.jLabel_ThongTin.getText() + "\nNhập vào số tiền:",
                "Thông báo",
                JOptionPane.PLAIN_MESSAGE);

        try {
            //hiện ra thông báo trả lại khác bao nhiêu tiền
            double soTien = Double.valueOf(soTien_Chuoi);
            JOptionPane.showMessageDialog(thucDonView,
                    "trả lại: " + (soTien - this.thucDonView.thucDonModel.getTongTien()),
                    "Infor", JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e1){
            //báo lỗi khi nhập ký tự vào
            JOptionPane.showMessageDialog(thucDonView, "nhập sai", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
