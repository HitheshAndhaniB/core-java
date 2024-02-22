package runner;

import mapBucketing.CompanyDto;
import mapBucketing.EmployeeDto;

import java.util.HashMap;
import java.util.Map;

public class CompanyEmployeeRunner {
    public static void main(String[] args) {
        CompanyDto companyDto1 = new CompanyDto("Microsoft", "Redmond", 1001);
        CompanyDto companyDto2 = new CompanyDto("Google", "Mountain View", 1002);
        CompanyDto companyDto3 = new CompanyDto("Apple", "Cupertino", 1003);
        CompanyDto companyDto4 = new CompanyDto("Amazon", "Seattle", 1004);
        CompanyDto companyDto5 = new CompanyDto("Facebook", "Menlo Park", 1005);
        CompanyDto companyDto6 = new CompanyDto("IBM", "Armonk", 1006);
        CompanyDto companyDto7 = new CompanyDto("Oracle", "Redwood City", 1007);
        CompanyDto companyDto8 = new CompanyDto("Intel", "Santa Clara", 1008);
        CompanyDto companyDto9 = new CompanyDto("Cisco", "San Jose", 1009);
        CompanyDto companyDto10 = new CompanyDto("Cisco", "San Jose", 1010);

        EmployeeDto employeeDto1 = new EmployeeDto("John", 30, "software engineer");
        EmployeeDto employeeDto2 = new EmployeeDto("Alice", 28, "data analyst");
        EmployeeDto employeeDto3 = new EmployeeDto("Michael", 35, "systems administrator");
        EmployeeDto employeeDto4 = new EmployeeDto("Emily", 26, "web developer");
        EmployeeDto employeeDto5 = new EmployeeDto("David", 33, "network engineer");
        EmployeeDto employeeDto6 = new EmployeeDto("Sophia", 29, "UX/UI designer");
        EmployeeDto employeeDto7 = new EmployeeDto("Daniel", 31, "quality assurance tester");
        EmployeeDto employeeDto8 = new EmployeeDto("Olivia", 27, "database administrator");
        EmployeeDto employeeDto9 = new EmployeeDto("Ethan", 32, "mobile app developer");
        EmployeeDto employeeDto10 = new EmployeeDto("Ava", 25, "frontend developer");

        Map<CompanyDto,EmployeeDto> companyDtoEmployeeDtoMap = new HashMap<>();
        companyDtoEmployeeDtoMap.put(companyDto1,employeeDto1);
        companyDtoEmployeeDtoMap.put(companyDto2,employeeDto2);
        companyDtoEmployeeDtoMap.put(companyDto3,employeeDto3);
        companyDtoEmployeeDtoMap.put(companyDto4,employeeDto4);
        companyDtoEmployeeDtoMap.put(companyDto5,employeeDto5);
        companyDtoEmployeeDtoMap.put(companyDto6,employeeDto6);
        companyDtoEmployeeDtoMap.put(companyDto7,employeeDto7);
        companyDtoEmployeeDtoMap.put(companyDto8,employeeDto8);
        companyDtoEmployeeDtoMap.put(companyDto9,employeeDto9);
        companyDtoEmployeeDtoMap.put(companyDto10,employeeDto10);

        System.out.println("Exiting :"+companyDtoEmployeeDtoMap.containsKey(companyDto10));
        companyDtoEmployeeDtoMap.forEach((k,v)-> System.out.println(k+ " "+v));

    }
}
