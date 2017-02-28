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
        Object c = circle;
        if (c instanceof  Movable) {
            move((Movable) c, 12.5, 8.12);
        }

        MovableFigure[] figures= new MovableFigure[5];
        figures[0]= circle;
        figures[1]=rect;
        figures[2]=trian;
        figures[3]=circle;
        figures[4]=rect;
        //Posortować rosnąco, im większe pole tym gorzej.
    }

    public static void move(Movable f,double x, double y){
        f.move(x,y);
    }
}
