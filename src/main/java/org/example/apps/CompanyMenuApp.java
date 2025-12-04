package org.example.apps;

import org.example.model.Company;
import org.example.readers.CompanyReader;

import java.util.Scanner;

public class CompanyMenuApp {
    private Scanner scanner;
    private CompanyReader companyReader;

    public CompanyMenuApp(Scanner scanner, CompanyReader companyReader) {
        this.scanner = scanner;
        this.companyReader = companyReader;
    }

    public void run(){
        var company = companyReader.read();
        menu(company);
    }

    public void menu(Company company){
        var opt = 0;

        do {
            opt = selectOption();

            if (opt == 1){
                company.optionOne();
            } else if (opt == 2) {
                company.optionTwo();
            } else if (opt == 3) {
                company.optionTrhee();
            } else{
                System.out.print("La opción introducida es errónea, por favor, introduzca una acción válida" +
                        "que se encuentre en el menú.");
            }
        } while(opt != 4);
    }


    public final void printMenu(){
        System.out.println("OPCIONES DE LA APP");
        System.out.println("    1. Mostrar Departamento mediante un Nombre.");
        System.out.println("    2. Mostrar los Empleados de un Departamento mediante un Nombre.");
        System.out.println("    3. Mostrar la información de un Empleado mediante su NIF.");
        System.out.println("    4. Salir.");
    }


    public final int selectOption(){
        printMenu();

        System.out.print("Introduce la acción que desea realizar: ");
        var optionSelected = scanner.nextInt();
        scanner.nextLine();

        return optionSelected;
    }
}
