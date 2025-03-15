package com.dbda;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Phonebook phonebook = new Phonebook();
		
		while (true) {
			System.out.println("\nPhonebook Menu: ");
			System.out.println("1. Add a new contact: ");
			System.out.println("2. Display all contacts: ");
			System.out.println("3. Search for a contact by name: ");
			System.out.println("4. Delete a contact: ");
			System.out.println("5. Exit: ");
			System.out.println("Enter your choice: ");
			
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline
			
			try {
				switch (choice) {
					case 1:
						System.out.println("Enter the name: ");
						String name = scanner.next();
						
						System.out.println("Enter the phone number: ");
						String phoneNumber = scanner.next();
						
						phonebook.addContact(name, phoneNumber);
						break;
						
					case 2:
						phonebook.displayContacts();
						break;
						
					case 3:
						System.out.println("Enter the name to search: ");
						String searchName = scanner.nextLine();
						Contact foundContact = phonebook.searchContact(searchName);
						System.out.println("Contact found: " + foundContact);
						break;
						
					case 4:
						System.out.println("Enter name to delete: ");
						String deleteName = scanner.nextLine();
						phonebook.deleteContact(deleteName);
						break;
						
					case 5:
						System.out.println("Exiting the phonebook application. Goodbye!");
						scanner.close();
						System.exit(0);
					
					default:
						System.out.println("Invalid choice!");
						break;
				}
			} catch (ResourceNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
}