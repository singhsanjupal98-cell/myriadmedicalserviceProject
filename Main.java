import java.util.Scanner;

import model.Admin;
import model.Clinician;
import model.Patient;
import model.User;
import service.SystemManager;

public class Main {
    public static void main(String[] args) {
        SystemManager manager = new SystemManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to MMS System\nEnter Role: admin / clinician / patient");
        String role = scanner.nextLine();

        User user;
        switch (role.toLowerCase()) {
            case "admin":
                user = new Admin("A1", "AdminUser", "admin@mms.com");
                break;
            case "clinician":
                user = new Clinician("C1", "Dr. John", "doc@mms.com");
                break;
            case "patient":
                user = new Patient("P1", "Alice", "alice@mms.com", true);
                break;
            default:
                System.out.println("Invalid Role");
                return;
        }

        while (true) {
            user.displayMenu();
            System.out.println("Enter option number (or type 'exit' to quit):");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting system...");
                break;
            }

            switch (input) {
                case "1":
                    if (user instanceof Admin) {
                        System.out.println("Registering patient...");
                        System.out.print("Enter ID: ");
                        String id = scanner.nextLine();
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter email: ");
                        String email = scanner.nextLine();
                        manager.registerPatient(id, name, email);
                    } else if (user instanceof Clinician) {
                        System.out.println("Showing assigned patients (not implemented yet)");
                    } else if (user instanceof Patient) {
                        System.out.println("Booking treatment (not implemented yet)");
                    }
                    break;

                case "2":
                    if (user instanceof Admin) {
                        System.out.println("Assigning clinician...");
                        System.out.print("Enter Treatment ID: ");
                        String tid = scanner.nextLine();
                        System.out.print("Enter Patient ID: ");
                        String pid = scanner.nextLine();
                        System.out.print("Enter Clinician ID: ");
                        String cid = scanner.nextLine();
                        manager.assignClinician(tid, pid, cid);
                    }
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
