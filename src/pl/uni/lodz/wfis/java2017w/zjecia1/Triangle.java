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
    public void move(double x, double y) {
        x1+=x;
        x2+=x;
        x3+=x;
        y1+=y;
        y2+=y;
        y3+=y;
    }
}
