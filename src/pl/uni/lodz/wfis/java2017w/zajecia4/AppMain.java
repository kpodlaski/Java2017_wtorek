package pl.uni.lodz.wfis.java2017w.zajecia4;

import java.util.*;

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
        Wardrobe w = new Wardrobe(190,80,
                "beech","beech");
        System.out.println(furnitures.contains(w));
        System.out.println("========SETS============");
        Set<Furniture> set = new HashSet<>();
        set.addAll(furnitures);
        System.out.println(set);
        boolean b;
         b = set.add(new Wardrobe(190,160,
                "oak","oak"));
        System.out.println(b? "Dodano": "Nie dodano");
        b = set.add(new Furniture(120,80,
                "darkgreen"));
        System.out.println(b? "Dodano": "Nie dodano");
        b= set.add(new Wardrobe(190,80,
                "beech","beech"));
        System.out.println(b? "Dodano": "Nie dodano");
        System.out.println(set);
        b = set.contains(furnitures.get(0));
        System.out.println(b? "Zawiera": "Nie zawiera");
        it = set.iterator();
        while(it.hasNext()){
            Furniture f = it.next();
            if (f.id.contains("1"))
                it.remove();
            System.out.println(f);
        }
        System.out.println("========MAPS============");
        Map<Furniture,Double> map = new HashMap<>();
        it = set.iterator();
        while(it.hasNext()){
            Furniture f = it.next();
            map.put(f,f.hashCode()*1.0/1000);
        }
        System.out.println(map);
        Furniture f = new Furniture(120,80,
                "darkgreen");
        System.out.println(map.get(f));
    }
}
