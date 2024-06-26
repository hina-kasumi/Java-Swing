package JFrame.view;

import javax.swing.*;

public class MyWindow extends JFrame {


    public void showIt(){
        this.setVisible(true);
    }

    public void showIt(String title){
        this.setTitle(title);
        this.setVisible(true);
    }

    public void showIt(String title, int width, int height){
        this.setTitle(title);
        this.setSize(width, height);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MyWindow m1 = new MyWindow();
        m1.showIt();

        MyWindow m2 = new MyWindow();
        m2.showIt("Window 2");

        MyWindow m3 = new MyWindow();
        m3.showIt("Window 3", 600, 400);
    }
}
