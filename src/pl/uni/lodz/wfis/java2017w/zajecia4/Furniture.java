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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Furniture wardrobe = (Furniture) o;
        if (wardrobe.heigh!= this.heigh) return false;
        if (wardrobe.width!= this.width) return false;
        if (!color.equalsIgnoreCase(wardrobe.color)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = hash*31 + heigh;
        hash = hash*31 + width;
        hash = hash*31 + color.hashCode();
        return hash;
    }
}
