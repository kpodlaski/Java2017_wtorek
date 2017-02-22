package pl.uni.lodz.wfis.java2017w.zjecia1;

public class Main {

    public static void main(String[] args) {
        MovableFigure circle, rect, trian;
        circle = new Circle();
        rect = new Rectangle();
        trian = new Triangle();

        circle.paint();
        rect.paint();
        trian.paint();
        move( circle, 12.5, 8.12);

    }

    public static void move(Movable f,double x, double y){
        f.move(x,y);
    }
}
