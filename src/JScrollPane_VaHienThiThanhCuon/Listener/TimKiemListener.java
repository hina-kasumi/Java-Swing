package JScrollPane_VaHienThiThanhCuon.Listener;

import JScrollPane_VaHienThiThanhCuon.View.TimKiemView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimKiemListener implements ActionListener {
    private final TimKiemView timKiemView;

    public TimKiemListener(TimKiemView timKiemView) {
        this.timKiemView = timKiemView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.timKiemView.timKiem();
    }
}
