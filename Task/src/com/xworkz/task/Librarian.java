package com.xworkz.task;

public class Librarian {

    LibraryRule libraryRule;


    public Librarian(LibraryRule libraryRule) {
        this.libraryRule = libraryRule;

    }
    public void lendingBook(){
        System.out.println("Starting  main in lendinbook");
        boolean keepSilence = libraryRule.keepSilence();
        String memberId = libraryRule.memberId();

        if (keepSilence && memberId != null) {
            System.out.println("can lend the book"+memberId);
        }
        else {
            System.out.println("can not lend the book" );
        }
        System.out.println("ending  main in lendinbook");

    }
    public void timeings(){
        System.out.println("Starting  main in timeings");
        boolean openingTime =libraryRule.openingTime();
        String closingTime = libraryRule.closingTime();

        if (openingTime && closingTime !=null){
            System.out.println("time to lend book"+closingTime);
        }
        else {
            System.out.println("library is closed");

        }

        System.out.println("ending  main in timeings");

    }
}
