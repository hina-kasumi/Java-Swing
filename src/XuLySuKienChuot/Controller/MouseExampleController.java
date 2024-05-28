package XuLySuKienChuot.Controller;

import XuLySuKienChuot.View.MouseExampleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseExampleController implements MouseListener, MouseMotionListener {
    private MouseExampleView mouseExampleView;

    public MouseExampleController(MouseExampleView mouseExampleView) {
        this.mouseExampleView = mouseExampleView;
    }

    @Override
    // khi click chuột sẽ làm gì
    public void mouseClicked(MouseEvent e) {
        this.mouseExampleView.click();
    }

    @Override
    //khi nhấn và giữ chuột sẽ làm gì
    public void mousePressed(MouseEvent e) {

    }

    @Override
    // khi không giữ chuột nữa sẽ làm gì
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    // khi con chuột đi vào khu vực sẽ làm gì
    public void mouseEntered(MouseEvent e) {
        this.mouseExampleView.enter();
        int x = e.getX();
        int y = e.getY();
        this.mouseExampleView.update(x, y);
    }

    @Override
    // khi con chuột đi ra khỏi khu vực sẽ làm gì
    public void mouseExited(MouseEvent e) {
        this.mouseExampleView.exit();
    }

    @Override
    //sử lý giữ chuột và kéo
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    //sử lý di chuyển chuột
    public void mouseMoved(MouseEvent e) {
        this.mouseExampleView.enter();
        int x = e.getX();
        int y = e.getY();
        this.mouseExampleView.update(x, y);
    }
}
