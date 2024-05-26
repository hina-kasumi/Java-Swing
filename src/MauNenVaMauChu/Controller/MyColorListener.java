package MauNenVaMauChu.Controller;

import MauNenVaMauChu.View.MyColorView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyColorListener implements ActionListener {
    private MyColorView myColorView;

    public MyColorListener(MyColorView myColorView) {
        this.myColorView = myColorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("Red Text")){
            this.myColorView.changeTextColor(Color.RED);
        } else if(src.equals("Yellow Text")){
            this.myColorView.changeTextColor(Color.YELLOW);
        } else if(src.equals("Green Text")){
            this.myColorView.changeTextColor(Color.GREEN);
        } else if (src.equals("Red Background")) {
            this.myColorView.changeBackGroundColor(Color.RED);
        } else if (src.equals("Yellow Background")) {
            this.myColorView.changeBackGroundColor(Color.YELLOW);
        } else if (src.equals("Green Background")) {
            this.myColorView.changeBackGroundColor(Color.GREEN);
        }
    }
}
