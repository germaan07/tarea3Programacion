package org.example;

import org.example.apps.CompanyMenuApp;
import org.example.readers.CompanyReader;
import org.example.readers.DepartamentReader;
import org.example.readers.EmployeeReader;

import java.util.Scanner;

public class CompanyMenuMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        EmployeeReader employeeReader = new EmployeeReader(scanner);
        DepartamentReader departamentReader = new DepartamentReader(scanner, employeeReader);
        CompanyReader companyReader = new CompanyReader(scanner, employeeReader, departamentReader);
        CompanyMenuApp companyMenu = new CompanyMenuApp(scanner, companyReader);


    }
}
