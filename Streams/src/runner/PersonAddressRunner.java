package runner;

import mapBucketing.AdressDto;
import mapBucketing.PersonDto;

import java.util.HashMap;
import java.util.Map;

public class PersonAddressRunner {
    public static void main(String[] args) {
        Map<PersonDto, AdressDto> personDtoAdressDtoMap = new HashMap<>();
        PersonDto personDto = new PersonDto("Anil","anil@gmail.com");
        PersonDto personDto1 = new PersonDto("Madhu","madhu@gamiml.com");
        PersonDto personDto2 = new PersonDto("Monoj","manoj@gamiml.com");
        PersonDto personDto3 = new PersonDto("kiran","kiran@gamiml.com");
        PersonDto personDto4 = new PersonDto("Hithesh","kiran@gamiml.com");

        AdressDto adressDto = new AdressDto(122,99898,"btm");
        AdressDto adressDto1 = new AdressDto(443,6767,"rrr");
        AdressDto adressDto2 = new AdressDto(667,8888,"janagar");
        AdressDto adressDto3 = new AdressDto(777,5567,"nagarbavi");
        AdressDto adressDto4 = new AdressDto(999,7788,"rajajeshwari");

        personDtoAdressDtoMap.put(personDto,adressDto);
        personDtoAdressDtoMap.put(personDto1,adressDto1);
        personDtoAdressDtoMap.put(personDto2,adressDto2);
        personDtoAdressDtoMap.put(personDto3,adressDto3);
        personDtoAdressDtoMap.put(personDto4,adressDto4);

        System.out.println("exiting "+personDtoAdressDtoMap.containsKey(personDto3));
        personDtoAdressDtoMap.forEach((k,v)-> System.out.println(k +" " +v));



    }
}

