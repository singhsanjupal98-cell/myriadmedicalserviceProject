package model;

public class Admin extends User {
    public Admin(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void displayMenu() {
        System.out.println("1. Register Patient\n2. Assign Clinician\n3. View Assessed Treatments\n4. Bill Patient");
    }
}
