package methods;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ClothBrandsPrice {
    public static void main(String[] args) {
        Map<String,Integer> clothBrandprice = new HashMap<>();
        clothBrandprice.put("Ck",2000);
        clothBrandprice.put("Gucchi",3000);
        clothBrandprice.put("Dkny",3999);
        clothBrandprice.put("Boss",4000);
        clothBrandprice.put("Chanel",5000);

        Map<String,Integer> clothBrandprice1 = new HashMap<>();
        clothBrandprice1.put("Burberry",7000);
        clothBrandprice1.put("Chole",6000);
        clothBrandprice1.put("Celine",5000);
        clothBrandprice1.put("Fendi",7000);
        clothBrandprice1.put("Lacoste",9000);



        String s1 = "Ck";
        String s2 = "Boss";
        String s3 = "Dkny";
        String s5 = "Zara";

        Integer i1 = 2000;
        Integer i2 = 3000;
        Integer i3 = 4999;


        System.out.println("*****ContainsKey Method*********");
        System.out.println(clothBrandprice.containsKey(s1));
        System.out.println(clothBrandprice.containsKey(s2));
        System.out.println(clothBrandprice.containsKey(s5));

        System.out.println("*****ContainsValue Method*********");
        System.out.println(clothBrandprice.containsValue(i1));
        System.out.println(clothBrandprice.containsValue(i2));
        System.out.println(clothBrandprice.containsValue(i3));

        System.out.println("*****EntrySet Method********");
        Set<Map.Entry<String,Integer>> set1 = clothBrandprice.entrySet();
        set1.forEach(m-> System.out.println(m.getKey()+" "+m.getValue()));

        System.out.println("*****Get Method*****");
        System.out.println(clothBrandprice.get("Ck"));

        System.out.println("******PutAll method******");
        clothBrandprice1.putAll(clothBrandprice);
        clothBrandprice1.forEach((k,v)-> System.out.println(k+" "+v));

        System.out.println("******keySet method*******");
        clothBrandprice.keySet().forEach(k-> System.out.println(k));

        System.out.println("******EntrySet method******");
        Set<Map.Entry<String,Integer>> entrySet1 = clothBrandprice1.entrySet();
        entrySet1.forEach(k-> System.out.println(k.getKey()+" "+k.getValue()));

        System.out.println("*******Replace*********");
        clothBrandprice.replace("Ck",1900);
        clothBrandprice.forEach((k,v)-> System.out.println(k+" "+v));







    }
}
