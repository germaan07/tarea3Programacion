package org.example.model;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Company {
    private String name;
    private String cif;
    private Departament[] departaments;

    private final Scanner scanner = new Scanner(System.in);

    public Company(String name, String cif, Departament[] departaments) {
        this.name = name;
        this.cif = cif;
        this.departaments = departaments;
    }


    public final void showInfo(){
        System.out.println("        ---EMPRESA---      ");
        System.out.println("Nombre: " + name);
        System.out.println("CIF: " + cif);
        System.out.println("Departamentos");
        for (Departament d : departaments){
            d.showInfo();
        }
    }


    public final void bucleMenu(){
        var cont = true;
        do {
            printMenu();
            var option = selectOption();

            if (option == 1){
                optionOne();
            } else if (option == 2) {
                optionTwo();
            } else if (option == 3) {
                optionTrhee();
            } else if (option == 4) {
                System.out.print("Saliendo del programa, adiós.");
                cont = false;
            } else {
                System.out.print("La opción introducida es errónea, por favor introduzca una acción válida.");
            }

        } while(cont);
    }


    public final void printMenu(){
        System.out.println("OPCIONES DE LA APP");
        System.out.println("    1. Mostrar Departamento mediante un Nombre.");
        System.out.println("    2. Mostrar los Empleados de un Departamento mediante un Nombre.");
        System.out.println("    3. Mostrar la información de un Empleado Departamento mediante un Nombre y un NIF de empleado.");
    }


    public final int selectOption(){
        System.out.print("Introduce la acción que desea realizar: ");
        var optionSelected = scanner.nextInt();
        scanner.nextLine();
        return optionSelected;
    }


    public final void optionOne(){
        var name = getDepartamentName();
        if (findDepartamentWithName(name) != null){
            findDepartamentWithName(name).showInfo();
        } else {
            System.out.println("No se encuentra el departamento.");
        }
    }

    private String getDepartamentName() {
        System.out.print("Introduce el nombre del departamento: ");
        var name = scanner.nextLine();
        return name;
    }


    public final void optionTwo(){
        var name =getDepartamentName();
        if (findDepartamentWithName(name) != null){
            findDepartamentWithName(name).showEmployees();
        } else {
            System.out.println("No se encuentra el departamento.");
        }
    }


    public final void optionTrhee(){
        var name = getDepartamentName();
        var nif = getEmployeeNif();

        if (findDepartamentWithName(name) != null){
            if (findDepartamentWithName(name).showEmployeeInfo(nif) != null){
                findDepartamentWithName(name).showEmployeeInfo(nif).showInfo();
            } else {
                System.out.println("No se encuentra el empleado.");
            }

        } else {
            System.out.println("No se encuentra el departamento.");
        }
    }


    public final Departament findDepartamentWithName(String name){
        for (Departament departament : departaments){
            if (departament.getName().equals(name)){
                return departament;
            }
        }
        return null;
    }


    private String getEmployeeNif() {
        System.out.print("Introduce el NIF del empleado: ");
        var nif = scanner.nextLine();
        return nif;
    }

    //Constructores, getters, setters, hassCode y toString


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Departament[] getDepartaments() {
        return departaments;
    }

    public void setDepartaments(Departament[] departaments) {
        this.departaments = departaments;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(cif, company.cif) && Objects.deepEquals(departaments, company.departaments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cif, Arrays.hashCode(departaments));
    }


    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", cif='" + cif + '\'' +
                ", departaments=" + Arrays.toString(departaments) +
                '}';
    }
}

