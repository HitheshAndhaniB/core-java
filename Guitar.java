package com.equalsmethod.in;

public class Guitar {
    public int id;
    public double price;
    public String material;


    public Guitar(int id, double price, String material) {
        this.id = id;
        this.material = material;
        this.price = price;

        System.out.println("created guitar using int,double String arg const");
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "id=" + id +
                ", price=" + price +
                ", material='" + material + '\'' +
                '}';
    }
    //if (guitar.equals(guitar1));

    @Override
    public boolean equals(Object obj) {
        Guitar leftRef = this;
        if (obj != null) {
            if (obj instanceof Guitar) {
                Guitar RightRef = (Guitar) obj;//casting
                if (leftRef.id == RightRef.id && leftRef.price == RightRef.price)
                {
                    System.out.println("guitar & guitar1 id & price is same ");
                    return true;
                }else {
                    System.err.println("object is not an super class of guitar");
                }
            } else {
                System.err.println("object is not an super class of guitar");

            }


        }

        System.err.println("obj is equals to null");
        return false;
    }
}
