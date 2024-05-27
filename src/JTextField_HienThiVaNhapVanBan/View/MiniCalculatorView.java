package JTextField_HienThiVaNhapVanBan.View;

import JTextField_HienThiVaNhapVanBan.Controller.MiniCalculatorListener;
import JTextField_HienThiVaNhapVanBan.Model.MiniCalculatorModel;

import javax.swing.*;
import java.awt.*;

public class MiniCalculatorView extends JFrame {
    private MiniCalculatorModel miniCalculatorModel;
    JTextField jTextField_firstValue;
    JTextField jTextField_secondValue;
    JTextField jTextField_answer;

    public MiniCalculatorView(){
        miniCalculatorModel = new MiniCalculatorModel();
        this.init();
    }

    private void init() {
        this.setTitle("Mini Calculator");
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        Font font = new Font("Arial", Font.BOLD, 40);
        JLabel jLabel_firstValue = new JLabel("1st Value");
        jLabel_firstValue.setFont(font);

        JLabel jLabel_secondValue = new JLabel("2nd Value");
        jLabel_secondValue.setFont(font);

        JLabel jLabel_answer = new JLabel("Answer");
        jLabel_answer.setFont(font);



        //trường văn bản để điền số
        //JTextField dùng để điền vào hoặc hiển thị String
        jTextField_firstValue = new JTextField(50); // tham số bên trong là giới hạn số ký tư
        jTextField_firstValue.setFont(font);
        jTextField_secondValue = new JTextField(50);// tham số bên trong là giới hạn số ký tư
        jTextField_secondValue.setFont(font);
        jTextField_answer = new JTextField(50);// tham số bên trong là giới hạn số ký tư
        jTextField_answer.setFont(font);
        jTextField_answer.setEditable(false); // không cho điền vào

        JPanel jPanelIO = new JPanel();
        jPanelIO.setLayout(new GridLayout(3,2, 10, 10));

        jPanelIO.add(jLabel_firstValue);
        jPanelIO.add(jTextField_firstValue);

        jPanelIO.add(jLabel_secondValue);
        jPanelIO.add(jTextField_secondValue);

        jPanelIO.add(jLabel_answer);
        jPanelIO.add(jTextField_answer);


        //Khai báo listener
        MiniCalculatorListener miniCalculatorListener = new MiniCalculatorListener(this);

        //thêm button
        JButton jButton_plus = new JButton("+");
        jButton_plus.setFont(font);
        jButton_plus.addActionListener(miniCalculatorListener);

        JButton jButton_minus = new JButton("-");
        jButton_minus.setFont(font);
        jButton_minus.addActionListener(miniCalculatorListener);

        JButton jButton_multiple = new JButton("*");
        jButton_multiple.setFont(font);
        jButton_multiple.addActionListener(miniCalculatorListener);

        JButton jButton_divide = new JButton("/");
        jButton_divide.setFont(font);
        jButton_divide.addActionListener(miniCalculatorListener);

        JButton jButton_pow = new JButton("^");
        jButton_pow.setFont(font);
        jButton_pow.addActionListener(miniCalculatorListener);

        JButton jButton_mod = new JButton("%");
        jButton_mod.setFont(font);
        jButton_mod.addActionListener(miniCalculatorListener);

        JPanel jPanelButtons = new JPanel();
        jPanelButtons.setLayout(new GridLayout(2, 3));
        jPanelButtons.add(jButton_plus);
        jPanelButtons.add(jButton_minus);
        jPanelButtons.add(jButton_multiple);
        jPanelButtons.add(jButton_divide);
        jPanelButtons.add(jButton_pow);
        jPanelButtons.add(jButton_mod);

        //add vào màn hình chính
        this.setLayout(new BorderLayout(10, 10));
        this.add(jPanelIO, BorderLayout.CENTER);
        this.add(jPanelButtons, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public void plus(){
        double firstValue = Double.valueOf(jTextField_firstValue.getText());
        double secondValue = Double.valueOf(jTextField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.plus();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void minus(){
        double firstValue = Double.valueOf(jTextField_firstValue.getText());
        double secondValue = Double.valueOf(jTextField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.minus();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void multiply(){
        double firstValue = Double.valueOf(jTextField_firstValue.getText());
        double secondValue = Double.valueOf(jTextField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.multiply();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void divide(){
        double firstValue = Double.valueOf(jTextField_firstValue.getText());
        double secondValue = Double.valueOf(jTextField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.divide();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void power(){
        double firstValue = Double.valueOf(jTextField_firstValue.getText());
        double secondValue = Double.valueOf(jTextField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.power();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void mod(){
        double firstValue = Double.valueOf(jTextField_firstValue.getText());
        double secondValue = Double.valueOf(jTextField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.mod();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }
}
