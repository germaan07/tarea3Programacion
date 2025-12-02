package org.example.enums;

public enum Positions {
    CEO("CEO"), HumanResources("Recursos Humanos"), Accountant ("Contable"),
    JuniorDeveloper("Programador Junior"), SeniorDeveloper("Programador Senior"),
    SoftwareEngineer("Ingeniero de Software"), SystemAdministrator("Administrador de Sistemas"),
    ProjectManager("Jefe de Proyecto");

    private final String description;

    Positions(String description) {
        this.description = description;
    }


    public static Positions fromIndex(int opt) {
        return Positions.values()[opt-1];
    }



    public static void printMenu() {
        System.out.println("PUESTOS");
        for (int i = 0; i < Positions.values().length; i++) {
            System.out.println((i+1) +"." + Positions.values()[i].description);
        }
    }
}
