package pl.uni.lodz.wfis.java2017w.zjecia1;

import java.util.Random;

/**
 * Created by Krzysztof Podlaski on 21.02.2017.
 */
public class Rectangle implements MovableFigure {
    private static Random rand = new Random();
    private double x=0.0, y=0.0;
    private double width=rand.nextDouble()*10, height=rand.nextDouble()*10;
    @Override
    public void paint() {
        System.out.println("Rysuje Kwadrat ");
    }

    @Override
    public double area() {
        return width*height;
    }

    @Override
    public double perimeter() {
        return 2*(width+height);
    }

    @Override
    public void move(double x, double y) {
        this.x+=x;
        this.y+=y;
    }

    @Override
    public String toString() {
        return "rectangle:"+perimeter()+";"+area();
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof  MovableFigure){
            MovableFigure mf = (MovableFigure) o;
            return (int) (10000*(this.perimeter() - mf.perimeter()));
            //Double.compare(this.perimeter(),mf.perimeter());
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
