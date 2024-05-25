package Panel_Look_Feel;

import javax.swing.*;
import java.awt.*;

public class MyCalculator extends JFrame {
    MyCalculator(){
        this.setTitle("My Calculator");

        this.setSize(300, 300);

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JTextField jTextField = new JTextField(50); //trường văn bản
        JPanel jPanel_head = new JPanel();
        jPanel_head.setLayout(new BorderLayout());
        jPanel_head.add(jTextField);


        JPanel jPanel_Buttons = new JPanel();

        jPanel_Buttons.setLayout(new GridLayout(5, 3));
        JButton[] jButton = new JButton[15];
        for (int i = 0; i < 10; i++) {
            jButton[i] = new JButton(i + "");
            jPanel_Buttons.add(jButton[i]);
        }
        jButton[10] = new JButton("+");
        jButton[11] = new JButton("-");
        jButton[12] = new JButton("*");
        jButton[13] = new JButton("/");
        jButton[14] = new JButton("=");
        for (int i = 10; i <= 14 ; i++) {
            jPanel_Buttons.add(jButton[i]);
        }

        this.setLayout(new BorderLayout());
        this.add(jPanel_head, BorderLayout.NORTH);
        this.add(jPanel_Buttons, BorderLayout.CENTER);


        this.setVisible(true);
    }

    public static void main(String[] args) {
        //điều chỉnh giao diện các nút bấm
        try{
            //một số giao diện khác
//          com.sun.java.swing.plaf.gtk.GTKLookAndFeel
//			com.sun.java.swing.plaf.motif.MotifLookAndFeel
//			com.sun.java.swing.plaf.windows.WindowsLookAndFeel
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");


            UIManager.setLookAndFeel((UIManager.getSystemLookAndFeelClassName())); //giao diện người dùng phù hợp theo hệ điều hành
            new MyCalculator();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
