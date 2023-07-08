package DefiningClasses_exercise.CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int countOfEmployee = Integer.parseInt(scanner.nextLine());
        ArrayList<Employee> employees = new ArrayList<>();

        Map<String, Department> departmentMap = new HashMap<>();
        for (int i = 0; i < countOfEmployee; i++) {
            String[] employeeInfo = scanner.nextLine().split("\\s+");
            String name = employeeInfo[0];
            double salary = Double.parseDouble(employeeInfo[1]);
            String position = employeeInfo[2];
            String department = employeeInfo[3];
            Employee employee = null;
            switch (employeeInfo.length){
                case 4:
                    employee = new Employee(name, salary,position, department);
                    break;
                case 6:
                    String email = employeeInfo[4];
                    int age = Integer.parseInt(employeeInfo[5]);
                     employee = new Employee(name, salary,position,department,email,age);
                    break;
                case 5:
                    if(employeeInfo[4].matches("\\d+")){
                        int personAge = Integer.parseInt(employeeInfo[4]);
                        employee = new Employee(name,salary,position,department,personAge);
                    }else {
                        String personEmail = employeeInfo[4];
                        employee = new Employee(name, salary, position, department, personEmail);
                    }
                    break;
            }

            departmentMap.putIfAbsent(department, new Department(department));
            departmentMap.get(department).getEmployees().add(employee);
        }
        Department highestPaidDepartment = departmentMap.entrySet().stream()
                .max(Comparator.comparingDouble(e -> e.getValue().calculateAverageSalary()))
                .get()
                .getValue();

        String departmentName = highestPaidDepartment.getName();
        System.out.println("Highest Average Salary: " + departmentName);
        highestPaidDepartment.getEmployees()
                .stream()
                .sorted((e1,e2)-> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(System.out::println);

    }
}
