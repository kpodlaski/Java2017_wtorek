package pl.uni.lodz.wfis.java2017w.zjecia1;

/**
 * Created by Krzysztof Podlaski on 21.02.2017.
 */
public class Circle implements  MovableFigure {
    private double radius=1.0;
    private double x=0.0,y=0.0;
    @Override
    public void paint() {
        System.out.println("Rysuje Koło "+ radius);
    }

    @Override
    public void move(double x, double y){
        this.x+=x;
        this.y+=y;
    }
}
