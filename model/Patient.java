package model;

public class Patient extends User {
    private boolean registered;

    public Patient(String id, String name, String email, boolean registered) {
        super(id, name, email);
        this.registered = registered;
    }

    @Override
    public void displayMenu() {
        System.out.println("1. Book Treatment\n2. View Offers\n3. Opt-out Notifications");
    }
}
