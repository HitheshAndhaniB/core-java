package com.equalsmethod.in;

public class GuitarStarter {
    public static void main(String[] args) {
        System.out.println("Starting main in guitar Starter ");
        Guitar guitar=new Guitar(012, 9999, "wood");
        Guitar guitar1=new Guitar(0123, 9990, "wood");
        boolean same=guitar.equals(guitar1);
        System.out.println(same);
        System.out.println(guitar);
        System.out.println(guitar1);

        System.out.println("Ending main in guitar Starter ");
    }

}