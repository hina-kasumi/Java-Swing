package HienThiHinhAnhVaGanIcon.View;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class IconExampleView extends JFrame {
    public IconExampleView() throws HeadlessException {
        this.setTitle("Icon Example");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        //Set Icon => JFame

        //tìm hiều về Url và toolkit
        URL url_IconNotePad = IconExampleView.class.getResource("Icon_Window.png");
        System.out.println(url_IconNotePad);
        Image img = Toolkit.getDefaultToolkit().createImage(url_IconNotePad);
        this.setIconImage(img);


        //khai báo thanh menu bar
        JMenuBar jMenuBar = new JMenuBar();

        //Menu
        JMenu jMenu = new JMenu("Menu");

        //Thêm Item cho Menu
        JMenuItem[] jMenuItem = new JMenuItem[6];
        for (int i = 1; i <= 3; i++) {
            jMenuItem[i] = new JMenuItem("Item " + i);
            jMenu.add(jMenuItem[i]);
            jMenuItem[i].setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(IconExampleView.class.getResource("img_" + i + ".png"))));
        }
        JMenu jMenu_SubMenu = new JMenu("Sub Menu");
        for (int i = 4; i <= 5; i++) {
            jMenuItem[i] = new JMenuItem("Item " + i);
            jMenu_SubMenu.add(jMenuItem[i]);
            jMenuItem[i].setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(IconExampleView.class.getResource("img_" + i + ".png"))));
        }
        jMenu.add(jMenu_SubMenu);


        jMenuBar.add(jMenu); //gán Menu vảo MenuBar

        JButton jButton = new JButton("TEST BUTTON");
        jButton.setFont(new Font("Arial", Font.BOLD, 50));
        jButton.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(IconExampleView.class.getResource("img_1.png"))));
        this.add(jButton, BorderLayout.SOUTH);

        //thêm thanh MenuBar vào cửa sổ
        this.add(jMenuBar, BorderLayout.NORTH);

        //JLabel
        JLabel jLabel = new JLabel();
        this.add(jLabel, BorderLayout.CENTER);
        jLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(IconExampleView.class.getResource("img.png"))));


        this.setVisible(true);
    }
    public static void main(String[] args) {
        new IconExampleView();
    }
}
