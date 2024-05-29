package PhimTat.View;

import PhimTat.Controller.MenuExampleController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class MenuExampleView extends JFrame {
    private final JLabel jLabel;

    public MenuExampleView() {
        this.setTitle("Menu Example");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //tao controller
        MenuExampleController menuExampleController = new MenuExampleController(this);

        //tạo thanh menu
        JMenuBar jMenuBar = new JMenuBar();

        //tạo menu file trên thanh menu
        JMenu jMenu_file = new JMenu("File");

        //tạo các lựa chọn con trong menu
        JMenuItem jMenuItem_new = new JMenuItem("New", KeyEvent.VK_N); // thêm dấu gạch dưới của N
        JMenuItem jMenuItem_open = new JMenuItem("Open", KeyEvent.VK_O);// thêm dấu gạch dưới của O
        JMenuItem jMenuItem_exit = new JMenuItem("Exit", KeyEvent.VK_X); // thêm dấu gạch dưới của X

        //thêm các JMenuItem vào JMenu
        jMenu_file.add(jMenuItem_new);
        jMenu_file.add(jMenuItem_open);
        jMenu_file.addSeparator(); // thêm cái gạch ngang vào
        jMenu_file.add(jMenuItem_exit);

        //gắn chức năng cho các JMenuItem
        jMenuItem_new.addActionListener(menuExampleController);
        jMenuItem_exit.addActionListener(menuExampleController);
        jMenuItem_open.addActionListener(menuExampleController);



        //tạo menu help trên thanh menu
        JMenu jMenu_help = new JMenu("Help");

        //tạo các lựa chọn trong menu help
        JMenuItem jMenuItem_welcome = new JMenuItem("Welcome");

        //gắn chức năng cho các JMenuItem
        jMenuItem_welcome.addActionListener(menuExampleController);

        //thêm phím tắt cho các JMenuItem
        jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_DOWN_MASK));



        //thêm các JMenuItem vào JMenu
        jMenu_help.add(jMenuItem_welcome);


        //gắn các menu vào thanh menu bar
        jMenuBar.add(jMenu_file);
        jMenuBar.add(jMenu_help);


        //thêm thanh menu vào cửa sổ
        this.setJMenuBar(jMenuBar);

        //tạo JLabel hiển thị
        Font font = new Font("Arial", Font.BOLD, 20);
        jLabel = new JLabel();
        jLabel.setFont(font);


        this.setLayout(new BorderLayout());

        this.add(jLabel);

        this.setVisible(true);
    }

    public void setTextJLabel(String str){
        this.jLabel.setText(str);
    }

}
