package PhongChuVaCoChu.View;

import PhongChuVaCoChu.Controller.LastButtonListener;
import PhongChuVaCoChu.Model.LastButtonModel;

import javax.swing.*;
import java.awt.*;

public class LastButtonView extends JFrame {
    private LastButtonModel lastButtonModel;
    private JLabel jLabel;
    public LastButtonView(){
        this.lastButtonModel = new LastButtonModel();
        this.init();
    }

    private void init() {
        this.setTitle("Last Button");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        //tạo listener
        LastButtonListener lastButtonListener = new LastButtonListener(this);

        Font font = new Font("Arial", Font.BOLD, 40);//set phông chữ

        JPanel jPanel_Center = new JPanel();
        jPanel_Center.setLayout(new GridLayout(2,2));

        JButton[] jButtons = new JButton[5];
        for (int i = 1; i < 5; i++) {
            jButtons[i] = new JButton(i + "");
            jButtons[i].addActionListener(lastButtonListener);
            jButtons[i].setFont(font);
            jPanel_Center.add(jButtons[i]);
        }
        this.add(jPanel_Center, BorderLayout.CENTER);



        JPanel jPanel_footer = new JPanel();
        jLabel = new JLabel("-----");
        jLabel.setFont(font);
        jPanel_footer.add(jLabel);

        this.add(jPanel_footer, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void changeTo(int value){
        this.lastButtonModel.setValue(value);
        jLabel.setText("Last Button: " + this.lastButtonModel.getValue());
    }
}
