package XuLySuKien.View;

import XuLySuKien.Controller.CounterListener;
import XuLySuKien.Model.CounterModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CounterView extends JFrame {
    private final CounterModel counterModel;
    private JButton jButton_Up;
    private JButton jButton_Down;
    private JLabel jLabel_value;
    public CounterView(){
        this.counterModel = new CounterModel();
        this.init();
        this.setVisible(true);
    }
    public void init(){
        this.setTitle("Counter");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //thêm listener vào
        ActionListener actionListener = new CounterListener(this);
        jButton_Up = new JButton("Up");
        jButton_Up.addActionListener(actionListener); //khi ng ta ấn nút thì đi đến controller mà nó quản lý thao tác nút này

        jButton_Down = new JButton("Down");
        jButton_Down.addActionListener(actionListener); //khi ng ta ấn nút thì đi đến controller mà nó quản lý thao tác nút này

        jLabel_value = new JLabel(this.counterModel.getValue() + "", JLabel.CENTER);



        //thêm vào panel
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(jButton_Up, BorderLayout.WEST);
        jPanel.add(jButton_Down, BorderLayout.EAST);
        jPanel.add(jLabel_value, BorderLayout.CENTER);

        //thêm vào cửa sổ
        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.CENTER);

    }

    public void increase(){
        this.counterModel.increase();
        this.jLabel_value.setText(this.counterModel.getValue() + ""); // cập nhật giá trị của counter
    }

    public void decrease(){
        this.counterModel.decrease();
        this.jLabel_value.setText(this.counterModel.getValue() + "");// cập nhật giá trị của counter
    }
}
