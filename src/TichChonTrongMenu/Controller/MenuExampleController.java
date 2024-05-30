package TichChonTrongMenu.Controller;

import TichChonTrongMenu.View.MenuExampleView;

import javax.swing.*;
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
        } else if (button.equals("Toolbar")) {
            // AbstractButton là lớp cha của nhiều cái nút
            //e.getSource: Đối tượng mà Sự kiện ban đầu xảy ra.
            AbstractButton checkBox = (AbstractButton) e.getSource();

            // getModel: Trả về mô hình mà nút này đại diện
            // isSelected: Cho biết nút đã được chọn chưa. Chỉ cần thiết cho một số loại nút nhất định - chẳng hạn như nút radio và hộp kiểm.
            boolean check = checkBox.getModel().isSelected();
            if(check)
                this.menuExampleView.enableToolbar();
            else
                this.menuExampleView.disableToolbar();
            this.menuExampleView.refresh();
        } else {
            this.menuExampleView.setTextJLabel("bạn đã click: " + button);
        }
    }
}
