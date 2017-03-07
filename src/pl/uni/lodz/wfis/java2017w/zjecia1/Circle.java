package pl.uni.lodz.wfis.java2017w.zjecia1;

import java.util.Random;

/**
 * Created by Krzysztof Podlaski on 21.02.2017.
 */
public class Circle implements  MovableFigure {
    private static Random rand = new Random();
    private double radius=rand.nextDouble()*10;
    private double x=0.0,y=0.0;
    @Override
    public void paint() {
        System.out.println("Rysuje Koło "+ radius);
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public void move(double x, double y){
        this.x+=x;
        this.y+=y;
    }

    @Override
    public String toString() {
        return "circle:"+perimeter()+";"+area();
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
