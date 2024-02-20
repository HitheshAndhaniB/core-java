package com.xworkz.Streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MedicineDtoRunner {
    public static void main(String[] args) {
        String[] ref1 = {"Lubricants","Preservatives","Solvents"};
        MedicineDto medicineDto1 = new MedicineDto("Coughfix",1,"Torrent", LocalDate.of(2023,10,20),LocalDate.now(),350.0,ref1);

        String[] ref2 = {"Binders", "Disintegrants", "Fillers"};
        MedicineDto medicineDto2 = new MedicineDto("HeadacheRelief", 2, "Pharmex", LocalDate.of(2024, 5, 15), LocalDate.now(), 250.0, ref2);

        String[] ref3 = {"Coating Agents", "Antioxidants"};
        MedicineDto medicineDto3 = new MedicineDto("FeverAway", 3, "MediCure", LocalDate.of(2023, 8, 10), LocalDate.now(), 180.0, ref3);

        String[] ref4 = {"Disinfectants", "Antifungal Agents", "Emulsifiers"};
        MedicineDto medicineDto4 = new MedicineDto("SkinGuard", 4, "HealthCare Ltd.", LocalDate.of(2023, 12, 5), LocalDate.now(), 120.0, ref4);

        String[] ref5 = {"Stabilizers", "Flavorings", "Sweeteners"};
        MedicineDto medicineDto5 = new MedicineDto("DigestEase", 5, "BioMed", LocalDate.of(2024, 3, 20), LocalDate.now(), 180.0, ref5);

        String[] ref6 = {"Colorants", "Humectants", "Viscosity Modifiers"};
        MedicineDto medicineDto6 = new MedicineDto("PainRelax", 6, "MediLife", LocalDate.of(2023, 9, 15), LocalDate.now(), 300.0, ref6);

        String[] ref7 = {"Anticaking Agents", "Astringents", "Opacifying Agents"};
        MedicineDto medicineDto7 = new MedicineDto("AllergyRelief", 7, "PharmTech", LocalDate.of(2024, 2, 10), LocalDate.of(2024,2,2), 220.0, ref7);

        String[] ref8 = {"Humectants", "Emollients"};
        MedicineDto medicineDto8 = new MedicineDto("AsthmaEase", 8, "HealthFirst", LocalDate.of(2023, 7, 25), LocalDate.now(), 270.0, ref8);

        String[] ref9 = {"Antiemetics", "Antihistamines", "Expectorants"};
        MedicineDto medicineDto9 = new MedicineDto("HeartCare", 9, "CureWell", LocalDate.of(2024, 1, 30), LocalDate.now(), 200.0, ref9);

        String[] ref10 = {"Antitussives", "Mucolytics", "Bronchodilators"};
        MedicineDto medicineDto10 = new MedicineDto("DiabetesControl", 10, "PharmCare", LocalDate.of(2023, 11, 20), LocalDate.of(2024,2,18), 320.0, ref10);

        String[] ref11 = {"Antipyretics", "Analgesics", "Anti-inflammatory Drugs","Mucolytics"};
        MedicineDto medicineDto11 = new MedicineDto("ArthritisRelief", 11, "LifeMed", LocalDate.of(2024, 4, 15), LocalDate.now(), 280.0, ref11);

        String[] ref12 = {"Anticonvulsants", "Anxiolytics", "Sedatives"};
        MedicineDto medicineDto12 = new MedicineDto("InsomniaCure", 12, "HealWell", LocalDate.of(2023, 10, 10), LocalDate.now(), 230.0, ref12);

        String[] ref13 = {"Antiemetics", "Antidiarrheals", "Antispasmodics"};
        MedicineDto medicineDto13 = new MedicineDto("GastroRelief", 13, "CureMe", LocalDate.of(2024, 6, 20), LocalDate.now(), 260.0, ref13);

        String[] ref14 = {"Antiemetics", "Antidiarrheals", "Antispasmodics"};
        MedicineDto medicineDto14 = new MedicineDto("VisionCare", 14, "EyeHealth", LocalDate.of(2023, 12, 30), LocalDate.now(), 180.0, ref14);

        String[] ref15 = {"Antibiotics", "Antivirals", "Antifungals"};
        MedicineDto medicineDto15 = new MedicineDto("KidneySupport", 15, "RenalCare", LocalDate.of(2024, 7, 10), LocalDate.now(), 300.0, ref15);

        String[] ref16 = {"Anticoagulants", "Thrombolytics", "Antiplatelet Drugs"};
        MedicineDto medicineDto16 = new MedicineDto("LiverGuard", 16, "HepaCare", LocalDate.of(2023, 11, 5), LocalDate.now(), 280.0, ref16);

        String[] ref17 = {"Antihypertensives", "Vasodilators", "Diuretics"};
        MedicineDto medicineDto17 = new MedicineDto("MemoryBoost", 17, "BrainCare", LocalDate.of(2024, 5, 25), LocalDate.now(), 250.0, ref17);

        String[] ref18 = {"Hormone Replacement Therapy", "Oral Contraceptives", "Fertility Medications"};
        MedicineDto medicineDto18 = new MedicineDto("BoneHealth", 18, "OrthoCare", LocalDate.of(2023, 9, 20), LocalDate.now(), 220.0, ref18);

        String[] ref19 = {"Antiulcerants", "Antiemetics", "Proton Pump Inhibitors"};
        MedicineDto medicineDto19 = new MedicineDto("ImmuneBooster", 19, "ImmunoTech", LocalDate.of(2024, 3, 15), LocalDate.now(), 320.0, ref19);

        String[] ref20 = {"Analgesics", "Antipyretics", "Anti-inflammatory Drugs"};
        MedicineDto medicineDto20 = new MedicineDto("MoodStabilizer", 20, "PsychCare", LocalDate.of(2023, 8, 30), LocalDate.now(), 280.0, ref20);

        List<MedicineDto> list = new ArrayList<>();
        list.add(medicineDto1);
        list.add(medicineDto2);
        list.add(medicineDto3);
        list.add(medicineDto3);
        list.add(medicineDto4);
        list.add(medicineDto5);
        list.add(medicineDto6);
        list.add(medicineDto7);
        list.add(medicineDto8);
        list.add(medicineDto9);
        list.add(medicineDto10);
        list.add(medicineDto11);
        list.add(medicineDto12);
        list.add(medicineDto13);
        list.add(medicineDto14);
        list.add(medicineDto15);
        list.add(medicineDto16);
        list.add(medicineDto17);
        list.add(medicineDto18);
        list.add(medicineDto19);
        list.add(medicineDto20);

        System.out.println("****** Sorted medicine by Company name ******");
        Collections.sort(list);
        list.forEach(e-> System.out.println(e));

        System.out.println("********Sorted ExpiryDate by Decending********");
        list.stream().sorted(Comparator.comparing(MedicineDto::getExpirydate).reversed()).collect(Collectors.toList()).forEach(r-> System.out.println(r));

        System.out.println("********Sort cost by Ascending*********");
        list.stream().sorted((c1,c2)->Double.compare(c1.getCost(), c2.getCost())).forEach(f1-> System.out.println(f1));

        System.out.println("********Ingredients Graterthan 3*********");
        list.stream().filter(a->a.getIngredients().length>3).forEach(b-> System.out.println(b));

        System.out.println("******* collecting all Ingredientes *******");
        for (MedicineDto medicine:list
             ) {
            String[] ingredients = medicine.getIngredients();
            for (String ing : ingredients)
            System.out.println(ing);
        }

        System.out.println("******** Company sort by Decending and print in uppercase******");
        list.stream().sorted((a1,a2)->a2.getCompany().compareTo(a1.getCompany())).map(a->a.getCompany().toUpperCase()).forEach(q-> System.out.println(q));

        System.out.println("******** Name sort by Decending and print in LowerCase&*******");
        list.stream().sorted((b1,b2)->b2.getName().compareTo(b1.getName())).map(b->b.getName().toLowerCase()).forEach(w-> System.out.println(w));


        LocalDate dt=LocalDate.parse("2024-02-20");
        LocalDate dt1=LocalDate.parse("2024-01-21");
        System.out.println("******* manufacture date lessthan 30 days *********");
        list.stream().filter(a->a.getManifacturedate().isBefore(dt)&&a.getManifacturedate().isAfter(dt1)).forEach(p-> System.out.println(p));

        LocalDate dt2=LocalDate.parse("2024-01-21");
        System.out.println("******* manufacture date Graterthan 30 days *********");
        list.stream().filter(b->b.getManifacturedate().isAfter(dt2)).forEach(n-> System.out.println(n));

        System.out.println("******** collect all elements expirtdate lessthan 30 days ******");
        LocalDate dt3=LocalDate.parse("2024-04-01");
        list.stream().filter(c->c.getExpirydate().isAfter(dt3)).forEach(n-> System.out.println(n));






    }
}
