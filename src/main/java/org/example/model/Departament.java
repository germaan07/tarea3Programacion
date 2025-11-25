package org.example.model;

import java.util.Arrays;
import java.util.Objects;

public class Departament {
    private String name;
    private Double budget;
    private Employee[] employees;

    public Departament(String name, Double budget, Employee[] employees) {
        this.name = name;
        this.budget = budget;
        this.employees = employees;
    }


    public final void showInfo(){
        System.out.println("    DEPARTAMENTO ");
        System.out.println("        Nombre: " + name);
        System.out.println("        Presupuesto: " + budget);
        System.out.println("        EMPLEADOS: ");
        for (Employee e: employees){
            e.showInfo();
        }
    }


    public final void showEmployees(){
        for (Employee e: employees){
            e.showInfo();
        }
    }


    public final Employee showEmployeeInfo(String nif){
        for (Employee e : employees){
            if (e.getNif().equals(nif)){
                return e;
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

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Departament that = (Departament) o;
        return Objects.equals(name, that.name) && Objects.equals(budget, that.budget) && Objects.deepEquals(employees, that.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, budget, Arrays.hashCode(employees));
    }


    @Override
    public String toString() {
        return "Departament{" +
                "name='" + name + '\'' +
                ", budget=" + budget +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
