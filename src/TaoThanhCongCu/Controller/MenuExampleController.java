package TaoThanhCongCu.Controller;

import TaoThanhCongCu.View.MenuExampleView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExampleController implements ActionListener {

    private final MenuExampleView menuExampleView;

    public MenuExampleController(MenuExampleView menuExampleView) {
        this.menuExampleView = menuExampleView;
    }

    @Override
    // actionlistener là xử lý các hoạt động chung vừa click chuột, vừa bấn nút,...
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();

        if(button.equals("Exit")){
            System.exit(0);
        }
        else {
            this.menuExampleView.setTextJLabel("bạn đã click: " + button);
        }
    }
}
