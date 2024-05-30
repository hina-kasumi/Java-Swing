package JCombobox_Va_JList.Controller;

import JCombobox_Va_JList.View.ThucDonView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

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
    }
}
