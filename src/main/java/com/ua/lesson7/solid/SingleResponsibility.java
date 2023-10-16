package com.ua.lesson7.solid;

public class SingleResponsibility {
    public static void main(String[] args) {
        Employee employee = new Employee("Mark", 100);

        EmployeeService service = new EmployeeService();
        service.calculatePay(employee);
        service.saveToDatabase(employee);

        EmployeeAccounting accounting = new EmployeeAccounting();
        accounting.calculatePay(employee);

        EmployeeDAO dao = new EmployeeDAO();
        dao.saveToDatabase(employee);
    }
}

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

//This is good code
class EmployeeAccounting {
    public void calculatePay(Employee employee) {
        // Розрахунок зарплати
    }
}

class EmployeeDAO {
    public void saveToDatabase(Employee employee) {
        // Збереження в базу даних
    }
}


// This is bad code
class EmployeeService {
    public void calculatePay(Employee employee) {
        // Розрахунок зарплати
    }

    public void saveToDatabase(Employee employee) {
        // Збереження в базу даних
    }
}
