package com.dbda;

import java.util.ArrayList;

public class Phonebook {
	private ArrayList<Contact> contacts = new ArrayList<>();
	
	// Constructor
	public Phonebook() {
		contacts = new  ArrayList<>();
	}

	// Add a new contact with validation
	public void addContact(String name, String phoneNumber) throws ResourceNotFoundException {
		// Validate name
		if (name == null) {
			throw new ResourceNotFoundException("Name cannot be empty.");
		}
		if (searchContact(name) != null) {
			throw new ResourceNotFoundException("Name already exists in the phonebook.");
		}
		
		// Validate phone number
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new ResourceNotFoundException("Enter valid phone number.");
		}
		
		// Add the contact
		Contact newContact = new Contact(name, phoneNumber);
		contacts.add(newContact);
		System.out.println("Contact added successfully.");
	}
	
	// Display contacts
	public void displayContacts() {
		if (contacts.isEmpty()) {
			System.out.println("Phonebook is empty.");
		} else {
			System.out.println("Contacts in the phonebook: \n");
			for (Contact contact : contacts)
				System.out.println(contact);
		}
	}

	// Search for a contact by name
	public Contact searchContact(String name) throws ResourceNotFoundException {
		for (Contact contact : contacts) {
			if (contact.getName().equalsIgnoreCase(name))
				return contact;
		}
		return null;
	}
	
	// Delete a contact
	public void deleteContact(String name) throws ResourceNotFoundException {
		Contact contactToRemove = searchContact(name);
		if (contactToRemove != null) {
			contacts.remove(contactToRemove);
			System.out.println("Contact deleted successfully.");
		}
		throw new ResourceNotFoundException("Contact not found.");
	}

}
