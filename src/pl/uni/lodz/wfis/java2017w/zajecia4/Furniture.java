package pl.uni.lodz.wfis.java2017w.zajecia4;

/**
 * Created by Krzysztof Podlaski on 14.03.2017.
 */
public class Furniture {
    private static int lastId =0;
    public String id;
    public int heigh;
    public int width;
    public String color;

    public Furniture(int heigh, int width, String color) {
        id = Integer.toString(lastId++);
        this.heigh = heigh;
        this.width = width;
        this.color = color;
    }

    @Override
    public String toString() {
        return id;
    }
}
