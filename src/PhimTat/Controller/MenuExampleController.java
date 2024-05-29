package PhimTat.Controller;

import PhimTat.View.MenuExampleView;

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

        if(button.equals("Open")){
            this.menuExampleView.setTextJLabel("bạn đã click vào JMenuItem Open");
        }
        else if (button.equals("Exit")){
            System.exit(0); // thoát khỏi chương trình
        } else if (button.equals("Welcome")) {
            this.menuExampleView.setTextJLabel("bạn đã click vào JMenuItem Welcome");
        } else if (button.equals("New")) {
            this.menuExampleView.setTextJLabel("bạn đã click vào JMenuItem New");
        }
    }
}
