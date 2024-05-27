package JTextArea_VanBanNhieuDong.Listener;

import JTextArea_VanBanNhieuDong.View.TimKiemView;

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
