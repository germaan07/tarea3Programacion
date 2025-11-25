package org.example.readers;

import org.example.model.Departament;
import org.example.model.Employee;

import java.util.Scanner;

public class DepartamentReader {
    private final Scanner scanner;
    private final EmployeeReader employeeReader;

    public DepartamentReader(Scanner scanner, EmployeeReader employeeReader) {
        this.scanner = scanner;
        this.employeeReader = employeeReader;
    }

    public Departament read(){
        System.out.println("DEPARTAMENTO");
        System.out.println(" ");
        System.out.print("Introduce el nomrbe del departamento: ");
        var name = scanner.nextLine();

        System.out.print("Introduce el presupuesto del departamento: ");
        var budget = scanner.nextDouble();

        System.out.print("Introduce el número de empleados: ");
        var numEmployees = scanner.nextInt();
        scanner.nextLine();

        Employee[] employees = new Employee[numEmployees];

        for (int e = 0; e < numEmployees; e++){
            employees[e] = employeeReader.read();
        }

        return new Departament(name, budget, employees);
    }
}
