package org.example.Enums;

public enum Positions {
    Boss("Jefe"), JuniorDeveloper("Programador Junior"), SeniorDeveloper("Programador Senior"),
    BackendDeveloper("Desarrollador Backend"), FrontendDeveloper("Desarrollador Frontend"),
    FullStackDeveloper("Desarrollador Full-Stack"), MobileDeveloper("Desarrollador Mobile"),
    SoftwareEngineer("Ingeniero de Software"), SoftwareArchitect("Arquitecto de Software"), QATester("QA Tester"),
    QAAutomationEngineer("QA Automation Engineer"), DevOpsEngineer("DevOps Engineer"),
    SystemsAdministrator("Administrador de Sistemas"),  AnalystProgrammer("Analista Programador"),
    ProjectManager("Jefe de Proyecto"), ScrumMaster("Scrum Master"), ProductOwner("Product Owner"),
    ChiefTechnologyOfficer("Director Técnico (CTO)"), TeamLead("Líder de equipo"),
    BusinessAnalyst("Analista de Negocio"), FunctionalAnalyst("Analista Funcional"), UXUIDesigner("Diseñador UX/UI"),
    HumanResourcesDirector("Director de Recursos Humanos"), HumanResourcesTechnician("Técnico de Recursos Humanos"),
    Accountant("Contable"), AdministrativeAssistant("Administrativo"), ChiefFinancialOfficer("Director de Finanzas (CFO)"),
    MarketingManager("Responsable de Marketing"), SalesRepresentative("Comercial");

    private final String description;

    Positions(String description) {
        this.description = description;
    }


    public static Positions fromIndex(int opt) {
        return Positions.values()[opt];
    }



    public static void printMenu() {
        System.out.println("PUESTOS");
        for (int i = 1; i < Positions.values().length; i++) {
            System.out.println((i) +"." + Positions.values()[i].description);
        }
    }
}
