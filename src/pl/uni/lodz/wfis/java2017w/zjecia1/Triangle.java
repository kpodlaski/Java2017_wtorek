package pl.uni.lodz.wfis.java2017w.zjecia1;

import java.util.Random;

/**
 * Created by Krzysztof Podlaski on 21.02.2017.
 */
public class Triangle implements MovableFigure{
    private static Random rand = new Random();
    private double
            x1 = rand.nextDouble()*10,
            y1 = rand.nextDouble()*10,
            x2 = rand.nextDouble()*10,
            y2 = rand.nextDouble()*10,
            x3 = rand.nextDouble()*10,
            y3 = rand.nextDouble()*10;

    @Override
    public void paint() {
        System.out.println("Rysuje Trojkąt");
    }

    @Override
    public double area() {
        return x1*x2*y1; //BZDURA
    }

    @Override
    public double perimeter() {
        double A = Math.sqrt( (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2) );
        double B = Math.sqrt( (x1-x3)*(x1-x3) + (y1-y3)*(y1-y3) );
        double C = Math.sqrt( (x3-x2)*(x3-x2) + (y3-y2)*(y3-y2) );
        return A+B+C;
    }

    @Override
    public void move(double x, double y) {
        x1+=x;
        x2+=x;
        x3+=x;
        y1+=y;
        y2+=y;
        y3+=y;
    }

    @Override
    public String toString() {
        return "triangle"+perimeter()+";"+area();
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof  MovableFigure){
            MovableFigure mf = (MovableFigure) o;
            return (int) (10000*(this.perimeter() - mf.perimeter()));
        }
        return -1;
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof  MovableFigure){
            MovableFigure mf = (MovableFigure) o;
            return ((int) (this.perimeter() - mf.perimeter()))==0;
        }
        return false;
    }
}
