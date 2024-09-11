package com.cestar.view;

import java.lang.ModuleLayer.Controller;
import java.util.Scanner;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();

    while (choice != 6) {
        System.out.println("Welcome to the Employee Application!");
        System.out.println("1. Display Records");
        System.out.println("2. Find Record");
        System.out.println("3. Add Record");
        System.out.println("4. Update Record");
        System.out.println("5. Delete Record");
        System.out.println("6. Exit");

        System.out.print("Enter your choice: ");

        choice = scanner.nextInt();

        Controller controller = new Controller();

        switch (choice) {
            case 1:
                System.out.println("Display Records");
                controller.display();
                break;
            case 2:
                System.out.println("Find Record");
                break;
            case 3:
                System.out.println("Add Record");
                controller.insert();
                break;
            case 4:
                System.out.println("Update Record");
                controller.update();
                break;
            case 5:
                System.out.println("Delete Record");
                controller.delete();
                break;
            case 6:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

    }

}
}