package pl.uni.lodz.wfis.java2017w.zjecia1;

/**
 * Created by Krzysztof Podlaski on 21.02.2017.
 */
public class Triangle implements MovableFigure{
    private double x1,y1,x2,y2,x3,y3;

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
}
