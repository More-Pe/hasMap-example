package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> contactos = new HashMap<>();

        while (true) {
            // Show options menu
            System.out.println("\n1. Add contact");
            System.out.println("2. Search contact");
            System.out.println("3. Delete contact");
            System.out.println("4. Show all contacts");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Clean Buffer

            switch (option) {
                case 1:
                    // Add contact
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = scanner.nextLine();
                    contactos.put(name, phone);
                    System.out.println("Contact added!");
                    break;
                case 2:
                    // Search contact
                    System.out.print("Enter name to search: ");
                    name = scanner.nextLine();
                    if (contactos.containsKey(name)) {
                        System.out.println("Phone: " + contactos.get(name));
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 3:
                    // Delete contact
                    System.out.print("Enter name to delete: ");
                    name = scanner.nextLine();
                    if (contactos.remove(name) != null) { // remove elimina si existe
                        System.out.println("Contact deleted.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 4:
                    // Show all contacts
                    System.out.println("All contacts:");
                    for (String key : contactos.keySet()) { // keySet para iterar
                        System.out.println(key + " → " + contactos.get(key));
                    }
                    break;
                case 5:
                    System.out.println("Bye!");
                    scanner.close(); // Cerrar el Scanner
                    return; // Salir del programa
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
