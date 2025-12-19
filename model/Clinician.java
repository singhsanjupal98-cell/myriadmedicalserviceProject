package model;

public class Clinician extends User {
    public Clinician(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void displayMenu() {
        System.out.println("1. View Assigned Patients\n2. Assess Treatments");
    }
}
