package com.toString.in;

public class LensRunner {

    public static void main(String[] args) {
        System.out.println("Starting main in LensRunner");

        Lens lens = new Lens("Lenskart", 2.2, "Metal");
        System.out.println(lens);


        Locker locker = new Locker(60, "silver", "50g");
        System.out.println(locker);

        Mic mic = new Mic(999.9,"pilips","Wireless");
        System.out.println(mic);

        Money money = new Money("real money",100000.0);
        System.out.println(money);

        Rice rice = new Rice("bullet",50,"good");
        System.out.println(rice);

        Seed seed=new Seed("vegitable",10);
        System.out.println(seed);

        Basket basket = new Basket(560.0,4,"plastic");
        System.out.println(basket);

        Bowl bowl = new Bowl("pingani",200);
        System.out.println(bowl);

        Chain chain =new Chain("gold",60000.0,"XL");
        System.out.println(chain);

        Cotton cotton = new Cotton("tawel",399,"not bad");
        System.out.println(cotton);

        Heart heart = new Heart("Human",25,110);
        System.out.println(heart);

        Bucket bucket = new Bucket(20,299);
        System.out.println(bucket);

        System.out.println("Starting main in LensRunner");

    }
}
