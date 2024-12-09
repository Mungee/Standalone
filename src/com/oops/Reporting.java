package com.oops;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    public String name;
    public Integer id;
    public Integer managerId;

    public Employee(String name, int id, int managerId) {
        this.name = name;
        this.id = id;
        this.managerId = managerId;
    }
}

public class Reporting {
    static List<Employee> employees = new ArrayList<>();
	static List<Employee> result = new ArrayList<>();

    public static void main(String[] args) {
        Employee e0 = new Employee("Level0", 1, 0);
        Employee e = new Employee("Level1-1", 2, 1);
        Employee e1 = new Employee("Level1-2", 3, 1);
        Employee e2 = new Employee("Level2-1", 4, 2);
        Employee e3 = new Employee("Level3-1", 5, 4);
        employees.add(e0);
        employees.add(e);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        reportingTo(0, employees).stream().map(x->x.name).forEach(System.out::println);
    }

    static List<Employee> reportingTo(int mgrId, List<Employee> Pemployees) {

        List<Employee> temp = Pemployees.stream()
                .filter(x -> x.managerId.equals(mgrId))
                .collect(Collectors.toList());

        if (temp.size() > 0) {
            for (Employee e : temp) {
				result.add(e);
				reportingTo(e.id, Pemployees);
			}
        }

        return result;
    }
}