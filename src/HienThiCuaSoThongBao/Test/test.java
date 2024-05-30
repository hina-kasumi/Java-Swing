package HienThiCuaSoThongBao.Test;

import HienThiCuaSoThongBao.View.ThucDonView;

import javax.swing.*;

public class test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new ThucDonView();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}