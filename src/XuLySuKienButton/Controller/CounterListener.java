package XuLySuKienButton.Controller;

import XuLySuKienButton.View.CounterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterListener implements ActionListener {
    private CounterView counterView;
    public CounterListener(CounterView counterView){
        this.counterView = counterView;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //muốn biết ngta ấn nút gì
        // e: là sự kiện ngta ấn nút
        String str = e.getActionCommand(); // lấy tên của cái nút
        System.out.println(str);

        if(str.equals("Up"))
            this.counterView.increase();
         else
            this.counterView.decrease();
    }
}
