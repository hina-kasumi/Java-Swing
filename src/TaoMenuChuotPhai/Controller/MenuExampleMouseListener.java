package TaoMenuChuotPhai.Controller;

import TaoMenuChuotPhai.View.MenuExampleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MenuExampleMouseListener implements MouseListener {
    private MenuExampleView menuExampleView;

    public MenuExampleMouseListener(MenuExampleView menuExampleView) {
        this.menuExampleView = menuExampleView;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //kiểm tra xem chuột được nhấn có phải là chuột phải hay không
        if (e.getButton() == MouseEvent.BUTTON3) {
            this.menuExampleView.jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
        }
    }
    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
