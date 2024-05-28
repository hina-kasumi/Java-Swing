package XuLySuKienChuot.View;

import XuLySuKienChuot.Controller.MouseExampleController;
import XuLySuKienChuot.Model.MouseExampleModel;

import javax.swing.*;
import java.awt.*;

public class MouseExampleView  extends JFrame {
    private final MouseExampleModel mouseExampleModel;
    private JPanel jPanel_mouse;
    private JLabel jLabel_position;
    private JLabel jLabel_x;
    private JLabel jLabel_y;
    private JLabel jLabel_count;
    private JLabel jLabel_countValue;
    private JLabel jLabel_empty_1;
    private JLabel jLabel_empty_2;
    private JLabel jLabel_check_in;
    private JLabel jLabel_check_in_value;

    public MouseExampleView() {
        this.mouseExampleModel = new MouseExampleModel();
        this.init();
    }

    private void init() {
        this.setTitle("Mouse Example");
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font = new Font("Arial", Font.BOLD, 15);

        //khai báo mouse listener
        MouseExampleController mouseExampleController = new MouseExampleController(this);

        //tạo JPanel
        jPanel_mouse = new JPanel();
        jPanel_mouse.setBackground(Color.CYAN);
        //gắn chức năng cho cho jPanel_mouse
        jPanel_mouse.addMouseListener(mouseExampleController);
        jPanel_mouse.addMouseMotionListener(mouseExampleController); //sử lý hành động đi chuyển chuột

        JPanel jPanel_info = new JPanel();
        jPanel_info.setLayout(new GridLayout(3, 3));

        //Tạo JLabel
        jLabel_position = new JLabel("Position: ");
        jLabel_position.setFont(font);
        jLabel_x = new JLabel("x = ");
        jLabel_x.setFont(font);
        jLabel_y = new JLabel("y = ");
        jLabel_y.setFont(font);
        jLabel_count = new JLabel("Number Of Click: ");
        jLabel_count.setFont(font);
        jLabel_countValue = new JLabel("n");
        jLabel_countValue.setFont(font);
        jLabel_empty_1 = new JLabel();
        jLabel_check_in = new JLabel("Mouse is in component: ");
        jLabel_check_in.setFont(font);
        jLabel_check_in_value = new JLabel("no");
        jLabel_check_in_value.setFont(font);
        jLabel_empty_2 = new JLabel();


        //thêm các JLabel vào JPanel_info
        jPanel_info.add(jLabel_position);
        jPanel_info.add(jLabel_x);
        jPanel_info.add(jLabel_y);
        jPanel_info.add(jLabel_count);
        jPanel_info.add(jLabel_countValue);
        jPanel_info.add(jLabel_empty_1);
        jPanel_info.add(jLabel_check_in);
        jPanel_info.add(jLabel_check_in_value);
        jPanel_info.add(jLabel_empty_2);



        this.setLayout(new BorderLayout());
        this.add(jPanel_mouse, BorderLayout.CENTER);
        this.add(jPanel_info, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void click(){
        this.mouseExampleModel.addClick();
        this.jLabel_countValue.setText(this.mouseExampleModel.getCount() + "");
    }
    public void enter(){
        this.mouseExampleModel.enter();
        this.jLabel_check_in_value.setText(this.mouseExampleModel.getCheckIn());
    }

    public void exit(){
        this.mouseExampleModel.exit();
        this.jLabel_check_in_value.setText(this.mouseExampleModel.getCheckIn());
    }

    public void update(int x, int y){
        this.mouseExampleModel.setX(x);
        this.mouseExampleModel.setY(y);
        this.jLabel_x.setText(this.mouseExampleModel.getX() + "");
        this.jLabel_y.setText(this.mouseExampleModel.getY() + "");
    }
}
