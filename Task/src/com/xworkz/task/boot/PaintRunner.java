package com.xworkz.task.boot;

import com.xworkz.task.Paints;

public class PaintRunner {

    public static void main(String[] args) {
        Paints paints=new Paints("blue","Asian",3);
        Paints paint=new Paints("blue","Asian",3);
        paint.setBrand("Asian");
        System.out.println(paints);


        }
    }

