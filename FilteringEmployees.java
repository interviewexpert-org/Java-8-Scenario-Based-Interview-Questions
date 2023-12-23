import java.util.*;
import java.util.stream.*;

class FilteringEmployees{
    public static void main(String ...args){
        List<Employee> employeeList = EmployeeDataGenerator.generateSampleData();
        //male employee
        List<Employee> maleEmployee = employeeList.stream().filter(e->e.getGender().equals("Male")).collect(Collectors.toList());
        maleEmployee.forEach(s->System.out.println(s.getName()));
        maleEmployee.forEach(System.out::println);

        // male employee + engineering department
        List<Employee> maleAndEngineeringEmployee = employeeList.stream()
                .filter(e->e.getGender().equals("Male") && e.getDepartment().equals("Engineering"))
                .collect(Collectors.toList());
        maleAndEngineeringEmployee.forEach(s->System.out.println(s.getName()));
        maleAndEngineeringEmployee.forEach(System.out::println);
    }
}