package pl.uni.lodz.wfis.java2017w.zjecia1;

import java.util.Comparator;

/**
 * Created by Krzysztof Podlaski on 07.03.2017.
 */
public class AreaFigureComparator implements Comparator<Figure> {
    @Override
    public int compare(Figure o1, Figure o2) {
        return (int) (o1.area()-o2.area());
    }
}
