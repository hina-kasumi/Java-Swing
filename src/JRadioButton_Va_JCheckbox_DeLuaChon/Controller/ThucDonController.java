package JRadioButton_Va_JCheckbox_DeLuaChon.Controller;

import JRadioButton_Va_JCheckbox_DeLuaChon.View.ThucDonView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;

public class ThucDonController implements ActionListener {
    private final ThucDonView thucDonView;

    public ThucDonController(ThucDonView thucDonView) {
        this.thucDonView = thucDonView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //món chính
        String monChinh = "";
        Enumeration<AbstractButton> button_MonChinh = thucDonView.buttonGroup_MonChinh.getElements();
        while (button_MonChinh.hasMoreElements()){
            AbstractButton b = button_MonChinh.nextElement();
            if (b.isSelected()){
                monChinh = b.getText();
            }
        }

        //món phụ
        String monPhu = "";
        for(AbstractButton b: thucDonView.list_MonPhu){
            if (b.isSelected()){
                monPhu = monPhu + b.getText() + ";";
            }
        }

        thucDonView.thucDonModel.setLuaChon_MonChinh(monChinh);
        thucDonView.thucDonModel.setLuaChon_MonPhu(monPhu);
        thucDonView.thucDonModel.tinhTongTien();
        thucDonView.hienThiKetQua();
    }
}
