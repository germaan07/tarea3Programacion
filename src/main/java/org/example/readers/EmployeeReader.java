package org.example.readers;

import org.example.model.Employee;

import java.util.Scanner;

public class EmployeeReader {
    private final Scanner scanner;

    public EmployeeReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Employee read(){
        System.out.println("-__________________");
        System.out.println("|DATOS DEL EMPLEADO|");
        System.out.println("___________________");
        System.out.println(" ");
        System.out.print("Introduce el NIF: ");
        var nif = scanner.nextLine();

        System.out.print("Introduce el nombre del empleado: ");
        var name = scanner.nextLine();

        System.out.print("Introduce los apellidos del empleado: ");
        var surnames = scanner.next();

        System.out.print("Introduce el puesto de trabajo del empleado: ");
        var position = scanner.nextLine();

        return new Employee(nif, name, surnames, position);
    }
}
