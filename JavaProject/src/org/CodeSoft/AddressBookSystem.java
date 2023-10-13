package org.CodeSoft;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddressBookMethod abm = new AddressBookMethod();
		while (true) {
			System.out.println("1. Add a Contact");
			System.out.println("2. Remove a Contact");
			System.out.println("3. Search for a Contact");
			System.out.println("4. Display All Contacts");
			System.out.println("5. Exit");

			int n = sc.nextInt();
			sc.nextLine();

			switch (n) {
			case 1:
				System.out.println("Enter name:-");
				String name = sc.nextLine();
				System.out.println("Enter phone number:-");
				String phoneNumber = sc.nextLine();
				System.out.println("Enter Email Address:-");
				String emailAddress = sc.nextLine();

				Contact contact = new Contact(name, phoneNumber, emailAddress);
				abm.addContact(contact);
				System.out.println("Contact added succefully");
				break;

			case 2:
				System.out.println("Enter name to remove:-");
				String remove = sc.nextLine();
				Contact cr = abm.searchContact(remove);

				if (cr != null) {
					abm.removeContact(cr);
					System.out.println("Contact remove succefully");
				} else {
					System.out.println("contact not found");
				}
				break;

			case 3:
				System.out.println("Enter name to search");
				String nameTo = sc.nextLine();
				Contact cs = abm.searchContact(nameTo);

				if (cs != null) {
					System.out.println("Contact found");
					System.out.println(cs);
				} else {
					System.out.println("contact not found");
				}
				break;
				
			case 4:
				System.out.println("All contact ");
				abm.displayAllContact();
				break;
				
			case 5:
				System.out.println("Exiting Address Book System.");
				sc.close();
				System.exit(0);
				
			default:
				System.out.println("Enter valid number");
			}
		}
	}

}

class Contact {
	private String name;
	private String phoneNumber;
	private String emailAddress;

	public Contact(String name, String phoneNumber, String emailAddress) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress + "]";
	}

}

class AddressBookMethod {
	private ArrayList<Contact> al = new ArrayList<>();

	public void addContact(Contact contact) {
		al.add(contact);
	}

	public void removeContact(Contact contact) {
		al.remove(contact);
	}

	public Contact searchContact(String name) {
		for (Contact contact : al) {
			if (contact.getName().equalsIgnoreCase(name))
				return contact;
		}
		return null;
	}

	public void displayAllContact() {
		for (Contact contact : al) {
			System.out.println(contact);
		}
	}
}