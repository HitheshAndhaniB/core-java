package Collections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Hospitals {
    public static void main(String[] args) {
        Collection<String> hospital = new ArrayList<>();
        hospital.add("1.Manipal Hospital");
        hospital.add("2.Narayana Health City");
        hospital.add("3.Fortis Hospital");
        hospital.add("4.Columbia Asia Referral Hospita");
        hospital.add("5.Vikram Hospital");
        hospital.add("6.ApollO");
        hospital.add("7.Sagar Hospitals,");
        hospital.add("8.St. John's Medical College Hospita");
        hospital.add("9.BGS Gleneagles Global Hospitals");
        hospital.add("10.Aster CMI Hospital");
        hospital.add("11.KLE Society's Hospita");
        hospital.add("12.OrlandO");
        hospital.add("13.JSS Hospita");
        hospital.add("14.Kasturba Hospital");
        hospital.add("13.KIMS Hospital");
        hospital.add("14.Orlando");
        hospital.add("15.SDM Narayana Heart Centre");
        hospital.add("16.Victoria Hospital");
        hospital.add("17.Ramaiah Memorial Hospital");
        hospital.add("18.Sparsh Hospital");
        hospital.add("19.Indira Gandhi Institute Of Child Health");
        hospital.add("20.Ricardo");
        Iterator<String> ref = hospital.iterator();
        while (ref.hasNext()) {
            String name = ref.next();
            if (name.endsWith("o") | name.endsWith("O")) {
                System.out.println(name);
            }
        }

    }
}
