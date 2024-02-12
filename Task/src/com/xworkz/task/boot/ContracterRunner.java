package com.xworkz.task.boot;

import com.xworkz.task.*;

public class ContracterRunner {

    public static void main(String[] args) {

        System.out.println("Starting main in ContracterRunner ");
        Contracter contracter = new Contracter();
        System.out.println("Contracter rules ");
        contracter.checkPollutionLevels();
        Contracter contracter1=new Contracter();
        contracter1.hithesh();
        contracter.sewageDisposalGuidelines();
        System.out.println("-------------------------");
        System.out.println("Metro contracter rules");

        System.out.println("Ending main in ContracterRunner ");

    }
}
