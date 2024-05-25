package PhongChuVaCoChu.Controller;

import PhongChuVaCoChu.View.LastButtonView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LastButtonListener implements ActionListener {
    private LastButtonView lastButtonView;

    public LastButtonListener(LastButtonView lastButtonView) {
        this.lastButtonView = lastButtonView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nguonSuKien = e.getActionCommand();
        int number = (int)nguonSuKien.charAt(0) - 48;
        lastButtonView.changeTo(number);

    }
}
