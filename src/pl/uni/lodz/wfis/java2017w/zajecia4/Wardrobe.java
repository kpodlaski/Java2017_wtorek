package pl.uni.lodz.wfis.java2017w.zajecia4;

/**
 * Created by Krzysztof Podlaski on 14.03.2017.
 */
public class Wardrobe extends Furniture{
    public String material;

    public Wardrobe(int heigh, int width,
                    String color, String material) {
        super(heigh, width, color);
        this.material = material;
        this.id = "W"+this.id;
    }
}
