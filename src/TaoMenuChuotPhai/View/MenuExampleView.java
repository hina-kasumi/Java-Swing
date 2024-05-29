package TaoMenuChuotPhai.View;

import TaoMenuChuotPhai.Controller.MenuExampleController;
import TaoMenuChuotPhai.Controller.MenuExampleMouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class MenuExampleView extends JFrame {
    private final JLabel jLabel;
    public final JPopupMenu jPopupMenu;// khai báo JPopUpMenu

    public MenuExampleView() {
        this.setTitle("Menu Example");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

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

        //tạo ToolBar (thanh công cụ)
        JToolBar jToolBar = new JToolBar();

        //tạo JButton
        JButton jButton_undo = new JButton("Undo");
        JButton jButton_redo = new JButton("Redo");
        JButton jButton_copy = new JButton("Copy");
        JButton jButton_cut = new JButton("Cut");
        JButton jButton_paste = new JButton("Paste");

        //thêm JButton vào ToolBar
        jToolBar.add(jButton_undo);
        jToolBar.add(jButton_redo);
        jToolBar.add(jButton_copy);
        jToolBar.add(jButton_cut);
        jToolBar.add(jButton_paste);

        //thêm chức năng cho các nút trên thanh công cụ
        jButton_undo.addActionListener(menuExampleController);
        jButton_redo.addActionListener(menuExampleController);
        jButton_copy.addActionListener(menuExampleController);
        jButton_cut.addActionListener(menuExampleController);
        jButton_paste.addActionListener(menuExampleController);

        //thêm cái phần nêu chức năng của nút khi đưa chuột vào
        jButton_undo.setToolTipText("quay lại thao tác vừa rồi");
        jButton_redo.setToolTipText("nút này tác giả cũng không biết là gì");
        jButton_copy.setToolTipText("sao chép");
        jButton_cut.setToolTipText("cắt");
        jButton_paste.setToolTipText("dán");

        //thêm ToolBar vào màn hình chính
        this.add(jToolBar, BorderLayout.NORTH);


        //Menu chuột chuột phải JPopUpMenu
        jPopupMenu = new JPopupMenu();
        JMenu jMenu_PopUpFont = new JMenu("Font"); // tạo một menu
        JMenuItem jMenuItem_Type = new JMenuItem("Type"); // tạo một menuItem
        jMenuItem_Type.addActionListener(menuExampleController);
        JMenuItem jMenuItem_Size = new JMenuItem("Size"); // tạo một menuItem
        jMenuItem_Size.addActionListener(menuExampleController);
        jMenu_PopUpFont.add(jMenuItem_Type); // thêm menuItem vào menu
        jMenu_PopUpFont.add(jMenuItem_Size); // thêm menuItem vào menu

        JMenuItem jMenuItem_Cut = new JMenuItem("Cut"); // tạo một menuItem
        JMenuItem jMenuItem_Copy = new JMenuItem("Copy"); // tạo một menuItem
        JMenuItem jMenuItem_Paste = new JMenuItem("Paste"); // tạo một menuItem

        jMenuItem_Cut.addActionListener(menuExampleController);
        jMenuItem_Copy.addActionListener(menuExampleController);
        jMenuItem_Paste.addActionListener(menuExampleController);


        jPopupMenu.add(jMenu_PopUpFont);
        jPopupMenu.addSeparator();
        jPopupMenu.add(jMenuItem_Cut);
        jPopupMenu.add(jMenuItem_Copy);
        jPopupMenu.add(jMenuItem_Paste);

        this.add(jPopupMenu); //thêm menu vào chương trình chính

        //thêm sự kiện click phải chuột vào JLabel
        MenuExampleMouseListener menuExampleMouseListener = new MenuExampleMouseListener(this);
        this.addMouseListener(menuExampleMouseListener); // khi nhấp chuột (bên nào ccũng được) thì chạy thao tác trong class

        //tạo JLabel hiển thị
        Font font = new Font("Arial", Font.BOLD, 20);
        jLabel = new JLabel();
        jLabel.setFont(font);




        this.add(jLabel, BorderLayout.CENTER);

        this.setVisible(true);
    }

    public void setTextJLabel(String str){
        this.jLabel.setText(str);
    }

}
