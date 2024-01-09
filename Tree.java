package Comparater;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tree {
    public static void main(String[] args) {
        Comparator<Integer> tree = new TreeImpl();
        List<Integer> treeList = new ArrayList<>();
        System.out.println("Asending order list");
        treeList.add(23);
        treeList.add(10);
        treeList.add(20);
        treeList.add(18);
        treeList.add(24);
        treeList.add(34);
        treeList.add(37);
        treeList.add(40);
        treeList.add(11);
        treeList.add(9);
        Collections.sort(treeList);
        for (Integer i :treeList)
        {
            System.out.println(i);
        }
        System.out.println("***************************");
        System.out.println("Desending order list");
        Collections.sort(treeList,tree);
        for (Integer i :treeList)
        {
            System.out.println(i);
        }
    }
    }

