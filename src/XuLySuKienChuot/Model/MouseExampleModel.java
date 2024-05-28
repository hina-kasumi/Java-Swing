package XuLySuKienChuot.Model;

public class MouseExampleModel {
    private int x, y;
    private int count;
    private String checkIn;

    public MouseExampleModel() {
        x = 0;
        y = 0;
        checkIn = "no";
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public String getCheckIn() {
        return checkIn;
    }
    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public void addClick(){
        this.count++;
    }

    public void enter(){
        this.checkIn = "yes";

    }

    public void exit(){
        this.checkIn = "no";
    }

}
