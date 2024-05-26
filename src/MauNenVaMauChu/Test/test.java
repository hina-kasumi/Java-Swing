package MauNenVaMauChu.Test;

import JFrame.view.Main;
import MauNenVaMauChu.View.MyColorView;

import javax.swing.*;

public class test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MyColorView();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
