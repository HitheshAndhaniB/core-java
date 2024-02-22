package runner;

import mapBucketing.CollegeDto;
import mapBucketing.StudentDto;

import java.util.HashMap;
import java.util.Map;

public class CollegeStudentRunner {
    public static void main(String[] args) {
        CollegeDto collegeDto1 = new CollegeDto("Dhayanand College of Engineering", "Bangalore", 1999);
        CollegeDto collegeDto2 = new CollegeDto("St. Xavier's College", "Mumbai", 1869);
        CollegeDto collegeDto3 = new CollegeDto("Madras Christian College", "Chennai", 1837);
        CollegeDto collegeDto4 = new CollegeDto("Presidency University", "Kolkata", 1817);
        CollegeDto collegeDto5 = new CollegeDto("Hindu College", "Delhi", 1899);
        CollegeDto collegeDto6 = new CollegeDto("Osmania University", "Hyderabad", 1918);
        CollegeDto collegeDto7 = new CollegeDto("Savitribai Phule Pune University", "Pune", 1949);
        CollegeDto collegeDto8 = new CollegeDto("Gujarat University", "Ahmedabad", 1949);
        CollegeDto collegeDto9 = new CollegeDto("University of Rajasthan", "Jaipur", 1947);
        CollegeDto collegeDto10 = new CollegeDto("Dhayanand College of Engineering", "Lucknow", 1867);

        StudentDto studentDto1 = new StudentDto("John", 1234, 24);
        StudentDto studentDto2 = new StudentDto("Alice", 5678, 22);
        StudentDto studentDto3 = new StudentDto("Michael", 9012, 21);
        StudentDto studentDto4 = new StudentDto("Emily", 3456, 23);
        StudentDto studentDto5 = new StudentDto("David", 7890, 20);
        StudentDto studentDto6 = new StudentDto("Sophia", 2345, 22);
        StudentDto studentDto7 = new StudentDto("Daniel", 6789, 25);
        StudentDto studentDto8 = new StudentDto("Olivia", 1235, 24);
        StudentDto studentDto9 = new StudentDto("Ethan", 5679, 23);
        StudentDto studentDto10 = new StudentDto("Ava", 9013, 21);

        Map<CollegeDto,StudentDto> collegeDtoStudentDtoMap = new HashMap<>();
        collegeDtoStudentDtoMap.put(collegeDto1,studentDto1);
        collegeDtoStudentDtoMap.put(collegeDto2,studentDto2);
        collegeDtoStudentDtoMap.put(collegeDto3,studentDto3);
        collegeDtoStudentDtoMap.put(collegeDto4,studentDto4);
        collegeDtoStudentDtoMap.put(collegeDto5,studentDto5);
        collegeDtoStudentDtoMap.put(collegeDto6,studentDto6);
        collegeDtoStudentDtoMap.put(collegeDto7,studentDto7);
        collegeDtoStudentDtoMap.put(collegeDto8,studentDto8);
        collegeDtoStudentDtoMap.put(collegeDto9,studentDto9);
        collegeDtoStudentDtoMap.put(collegeDto10,studentDto10);

        System.out.println("Exiting : "+collegeDtoStudentDtoMap.containsKey(collegeDto2));
        collegeDtoStudentDtoMap.forEach((k,v)-> System.out.println(k+" "+v));




    }
}
