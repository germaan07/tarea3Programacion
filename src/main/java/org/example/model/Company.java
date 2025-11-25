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
        System.out.println("        EMPRESA         ");
        System.out.println("Nombre: " + name);
        System.out.println("CIF: " + cif);
        System.out.println("Departamentos");
        for (Departament d : departaments){
            d.showInfo();
        }
    }


    public final void optionOne(){
        System.out.print("Introduce el nombre del departamento: ");
        var name = scanner.nextLine();
        if (findDepartamentWithName(name) != null){
            findDepartamentWithName(name).showInfo();
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

