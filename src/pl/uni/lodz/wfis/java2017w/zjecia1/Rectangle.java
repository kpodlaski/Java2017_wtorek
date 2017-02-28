package pl.uni.lodz.wfis.java2017w.zjecia1;

/**
 * Created by Krzysztof Podlaski on 21.02.2017.
 */
public class Rectangle implements MovableFigure {
    private double x=0.0, y=0.0;
    private double width=0.0, height=0.0;
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
}
