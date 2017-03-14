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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wardrobe wardrobe = (Wardrobe) o;
        if (wardrobe.heigh!= this.heigh) return false;
        if (wardrobe.width!= this.width) return false;
        if (!color.equalsIgnoreCase(wardrobe.color)) return false;
        return material.equalsIgnoreCase(wardrobe.material);
    }

    @Override
    public int hashCode() {
        return material.hashCode();
    }
}
