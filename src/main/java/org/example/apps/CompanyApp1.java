package org.example.apps;

import org.example.Enums.Positions;
import org.example.model.Company;
import org.example.readers.CompanyReader;
import org.example.readers.DepartamentReader;
import org.example.readers.EmployeeReader;

import java.util.Scanner;

public class CompanyApp1 {
    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        final EmployeeReader employeeReader = new EmployeeReader(scanner);
        final DepartamentReader departamentReader = new DepartamentReader(scanner, employeeReader);
        final CompanyReader companyReader = new CompanyReader(scanner, employeeReader, departamentReader);

        Company company = companyReader.read();

        company.bucleMenu();
    }
}
