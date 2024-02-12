package lamdaExpretions.forEachMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiseaseRunner {
    public static void main(String[] args) {
        DiseaseDto disease1 = new DiseaseDto("Influenza", "Fever, cough, sore throat", "Antiviral medication, rest", "High fever lasting more than 3 days");
        DiseaseDto disease2 = new DiseaseDto("COVID-19", "Fever, cough, shortness of breath", "Supportive care, vaccines", "Difficulty breathing or persistent chest pain");
        DiseaseDto disease3 = new DiseaseDto("Malaria", "Fever, chills, fatigue", "Antimalarial drugs, mosquito control measures", "Severe headache or vomiting");
        DiseaseDto disease4 = new DiseaseDto("Diabetes", "Increased thirst, frequent urination, fatigue", "Insulin therapy, lifestyle changes", "Unexplained weight loss or extreme fatigue");
        DiseaseDto disease5 = new DiseaseDto("Common Cold", "Runny nose, sneezing, cough", "Symptomatic relief, rest", "Persistent fever above 100.4°F (38°C)");

        List<DiseaseDto> list = new ArrayList<>();
        list.add(disease1);
        list.add(disease2);
        list.add(disease3);
        list.add(disease4);
        list.add(disease5);

        System.out.println("Asecending order Name");
        Collections.sort(list,(p1, p2)->p1.getName().compareTo(p2.getName()));
        list.forEach(Name -> System.out.println(Name));

        System.out.println("Decending order Name");
        Collections.sort(list,(p1, p2)->p2.getName().compareTo(p1.getName()));
        list.forEach(Name -> System.out.println(Name));

        System.out.println("Asecending order Symtoms");
        Collections.sort(list,(p1, p2)->p1.getSymtoms().compareTo(p2.getSymtoms()));
        list.forEach(Symtoms -> System.out.println(Symtoms));

        System.out.println("Decending order Symtoms");
        Collections.sort(list,(p1, p2)->p2.getSymtoms().compareTo(p1.getSymtoms()));
        list.forEach(Symtoms -> System.out.println(Symtoms));

        System.out.println("Asecending order Treatment");
        Collections.sort(list,(p1, p2)->p1.getTreatment().compareTo(p2.getTreatment()));
        list.forEach(Treatment -> System.out.println(Treatment));

        System.out.println("Decending order Treatment");
        Collections.sort(list,(p1, p2)->p2.getTreatment().compareTo(p1.getTreatment()));
        list.forEach(Treatment -> System.out.println(Treatment));

        System.out.println("Asecending order ConsernDoctor");
        Collections.sort(list,(p1, p2)->p1.getConsernDocter().compareTo(p2.getConsernDocter()));
        list.forEach(Doctor -> System.out.println(Doctor));

        System.out.println("Decending order ConsernDoctor");
        Collections.sort(list,(p1, p2)->p2.getConsernDocter().compareTo(p1.getConsernDocter()));
        list.forEach(Doctor -> System.out.println(Doctor));




    }
}
