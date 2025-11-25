package org.example.readers;

import org.example.model.Company;
import org.example.model.Departament;

import java.util.Scanner;

public class CompanyReader {
    private final Scanner scanner;
    private final EmployeeReader employeeReader;
    private final DepartamentReader departamentReader;


    public CompanyReader(Scanner scanner, EmployeeReader employeeReader, DepartamentReader departamentReader) {
        this.scanner = scanner;
        this.employeeReader = employeeReader;
        this.departamentReader = departamentReader;
    }


    public Company read(){
        System.out.println("        DATOS DE LA EMPRESA         ");
        System.out.println(" ");
        System.out.print("Introduce el NOMBRE de la empresa: ");
        var name = scanner.nextLine();

        System.out.print("Introduce el CIF de la empresa: ");
        var cif = scanner.nextLine();

        System.out.print("Introduce el NÚMERO DE DEPARTAMENTOS que hay en la empresa: ");
        var numOfDepartaments = scanner.nextInt();
        scanner.nextLine();

        Departament[] departamets = new Departament[numOfDepartaments];

        for (int d = 0; d < numOfDepartaments; d++){
            departamets[d] = departamentReader.read();
        }

        return new Company(name, cif, departamets);
    }
}
