package runner;

import mapBucketing.CityDto;
import mapBucketing.StateDto;

import java.util.HashMap;
import java.util.Map;

public class StateCityRunner {
    public static void main(String[] args) {
        StateDto stateDto1 = new StateDto("Karnataka", "Bangalore", 300.0);
        StateDto stateDto2 = new StateDto("Maharashtra", "Mumbai", 350.0);
        StateDto stateDto3 = new StateDto("Tamil Nadu", "Chennai", 275.0);
        StateDto stateDto4 = new StateDto("Uttar Pradesh", "Lucknow", 400.0);
        StateDto stateDto5 = new StateDto("Gujarat", "Gandhinagar", 250.0);
        StateDto stateDto6 = new StateDto("Rajasthan", "Jaipur", 325.0);
        StateDto stateDto7 = new StateDto("West Bengal", "Kolkata", 275.0);
        StateDto stateDto8 = new StateDto("Bihar", "Patna", 200.0);
        StateDto stateDto9 = new StateDto("Kerala", "Thiruvananthapuram", 270.0);
        StateDto stateDto10 = new StateDto("Telangana", "Hyderabad", 325.0);


        CityDto cityDto1 = new CityDto("Bangalore", "Chikpete", 25.0);
        CityDto cityDto2 = new CityDto("Mumbai", "Andheri", 18.5);
        CityDto cityDto3 = new CityDto("Chennai", "T. Nagar", 20.3);
        CityDto cityDto4 = new CityDto("Kolkata", "Park Street", 15.8);
        CityDto cityDto5 = new CityDto("Delhi", "Connaught Place", 22.1);
        CityDto cityDto6 = new CityDto("Hyderabad", "Banjara Hills", 16.7);
        CityDto cityDto7 = new CityDto("Pune", "Koregaon Park", 12.4);
        CityDto cityDto8 = new CityDto("Ahmedabad", "Navrangpura", 14.9);
        CityDto cityDto9 = new CityDto("Jaipur", "Malviya Nagar", 10.5);
        CityDto cityDto10 = new CityDto("Lucknow", "Hazratganj", 9.8);

        Map<StateDto,CityDto> stateDtoCityDtoMap = new HashMap<>();
        stateDtoCityDtoMap.put(stateDto1,cityDto1);
        stateDtoCityDtoMap.put(stateDto2,cityDto2);
        stateDtoCityDtoMap.put(stateDto3,cityDto3);
        stateDtoCityDtoMap.put(stateDto4,cityDto4);
        stateDtoCityDtoMap.put(stateDto5,cityDto5);
        stateDtoCityDtoMap.put(stateDto6,cityDto6);
        stateDtoCityDtoMap.put(stateDto7,cityDto7);
        stateDtoCityDtoMap.put(stateDto8,cityDto8);
        stateDtoCityDtoMap.put(stateDto9,cityDto9);
        stateDtoCityDtoMap.put(stateDto10,cityDto10);

        System.out.println("Existing :"+stateDtoCityDtoMap.containsKey(stateDto2));
        stateDtoCityDtoMap.forEach((k,v)-> System.out.println(k+" "+v));

    }
}
