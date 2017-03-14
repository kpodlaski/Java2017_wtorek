package pl.uni.lodz.wfis.java2017w.zajecia4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 14.03.2017.
 */
public class AppMain {

    public static void main(String[] a){
        List<Furniture> furnitures = new ArrayList<>();
        furnitures.add(new Wardrobe(190,160,
                "oak","oak"));
        furnitures.add(0,new Furniture(120,80,
                "darkgreen"));
        furnitures.add(new Wardrobe(190,80,
                "beech","beech"));
        System.out.println(furnitures);
        //furnitures.remove(1);
        for (int i=0; i<furnitures.size();i++){
            System.out.println(i + "=>" + furnitures.get(i));
        }
        System.out.println("========================");
        for (Furniture f: furnitures) {
            System.out.println(f);
        }
        System.out.println("========================");
        Iterator<Furniture> it = furnitures.iterator();
        while(it.hasNext()){
            Furniture f = it.next();
            if (f.id.contains("1"))
                it.remove();
            System.out.println(f);
        }
        System.out.println("========================");
        for (int i=0; i<furnitures.size();i++){
            System.out.println(i + "=>" + furnitures.get(i));
        }
    }
}
