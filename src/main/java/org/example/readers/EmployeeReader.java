package org.example.readers;

import org.example.enums.Positions;
import org.example.model.Employee;

import java.util.Scanner;

public class EmployeeReader {
    private final Scanner scanner;

    public EmployeeReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Employee read(){
        System.out.println("|DATOS DEL EMPLEADO|");
        System.out.println(" ");
        System.out.print("Introduce el NIF: ");
        var nif = scanner.nextLine();

        System.out.print("Introduce el nombre del empleado: ");
        var name = scanner.nextLine();

        System.out.print("Introduce los apellidos del empleado: ");
        var surnames = scanner.nextLine();

        var correctPosition = false;

        do {
            System.out.print("Introduce el número del puesto de trabajo del empleado: ");
            int posSelect = scanner.nextInt();
            scanner.nextLine();
            if (posSelect > 0 || posSelect < 30){
                var position = Positions.fromIndex(posSelect);
                return new Employee(nif, name, surnames, position);
            } else {
                System.out.println("La posición introducida no es correcta, por favor, introduzca una opción válida.");
            }
        } while (!correctPosition);
        return null;
    }
}
