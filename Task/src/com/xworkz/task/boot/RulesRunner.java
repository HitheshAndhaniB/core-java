package com.xworkz.task.boot;

import com.xworkz.task.HitheshRules;
import com.xworkz.task.Librarian;
import com.xworkz.task.LibraryRule;

public class RulesRunner {

    public static void main(String[] args) {

        LibraryRule libraryRule= new HitheshRules();
        Librarian librarian=new Librarian(libraryRule);//abstraction
        librarian.lendingBook();
        librarian.timeings();
    }
}
