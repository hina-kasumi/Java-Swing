package JTextField_HienThiVaNhapVanBan.Controller;

import JTextField_HienThiVaNhapVanBan.View.MiniCalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniCalculatorListener implements ActionListener {
    private MiniCalculatorView miniCalculatorView;

    public MiniCalculatorListener(MiniCalculatorView miniCalculatorView) {
        this.miniCalculatorView = miniCalculatorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if(button.equals("+")){
            this.miniCalculatorView.plus();
        } else if (button.equals("-")) {
            this.miniCalculatorView.minus();
        } else if (button.equals("*")) {
            this.miniCalculatorView.multiply();
        } else if (button.equals("/")) {
            this.miniCalculatorView.divide();
        } else if (button.equals("^")) {
            this.miniCalculatorView.power();
        } else if (button.equals("%")) {
            this.miniCalculatorView.mod();
        }
    }
}
