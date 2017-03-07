package pl.uni.lodz.wfis.java2017w.zjecia1;

import java.util.Arrays;

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
        System.out.println(c.getClass().getSimpleName() );
        if (c instanceof  Movable) {
            move((Movable) c, 12.5, 8.12);
        }

        MovableFigure[] figures= new MovableFigure[5];
        figures[0]= circle;
        figures[1]=rect;
        figures[2]=trian;
        figures[3]=new Circle();
        figures[4]=new Rectangle();
        System.out.println(Arrays.toString(figures));
        MovableFigure temp;
        //Posortować rosnąco, im większy obwód tym gorzej.
        /*for (int i=0; i<figures.length; i++){
            for(int j=i+1; j<figures.length; j++){
                double pi = figures[i].perimeter();
                double pj = figures[j].perimeter();
                if (pi>pj){
                    temp = figures[i];
                    figures[i]=figures[j];
                    figures[j]=temp;
                }
            }
        }
        */
        Arrays.sort(figures);
        System.out.println(Arrays.toString(figures));
        System.out.println("=========================");
        Arrays.sort(figures,new AreaFigureComparator());
        System.out.println(Arrays.toString(figures));
    }

    public static void move(Movable f,double x, double y){
        f.move(x,y);
    }
}
