package VeVaHienThiCacHinhAnhCoBan.View;

import javax.swing.*;
import java.awt.*;

public class JPanelDraw extends JPanel {
    public JPanelDraw() {
        this.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //vẽ đường thẳng
        g.setColor(Color.RED);
        g.drawLine(15, 15, 50,150);

        //vẽ hình tròn hoặc oval
        g.setColor(Color.BLUE);
        g.drawOval(255, 255, 50, 25);

        //vẽ hình chữ nhật
        g.setColor(Color.GREEN);
        g.drawRect(45, 150, 30, 90);

        //vẽ hình oval có màu bên trong
        g.setColor(Color.PINK);
        g.fillOval(400, 300, 50, 100);

        //vẽ hình chữ nhật có màu bên trong
        g.setColor(Color.DARK_GRAY);
        g.fillRect(100, 100, 150, 150);

        //vẽ chữ
        g.setColor(Color.CYAN);
        g.drawString("hello", 250, 250);
    }
}
