package com.ua.lesson3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Contact> contacts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Оберіть опцію:");
            System.out.println("1. Створити новий контакт");
            System.out.println("2. Видалити контакт");
            System.out.println("3. Редагувати контакт");
            System.out.println("4. Отримати список усіх контактів");
            System.out.println("5. Завершити програму");

            int option = scanner.nextInt();
            scanner.nextLine(); // Очистити буфер вводу

            switch (option) {
                case 1:
                    createContact();
                    break;
                case 2:
                    deleteContact();
                    break;
                case 3:
                    editContact();
                    break;
                case 4:
                    listContacts();
                    break;
                case 5:
                    System.out.println("Програма завершила свою роботу.");
                    System.exit(0);
                default:
                    System.out.println("Невірний вибір опції. Будь ласка, спробуйте ще раз.");
            }
        }
    }

    private static void createContact() {
        System.out.print("Введіть ім'я: ");
        String firstName = scanner.nextLine();
        System.out.print("Введіть прізвище: ");
        String lastName = scanner.nextLine();
        System.out.print("Введіть номер телефону: ");
        String phoneNumber = scanner.nextLine();

        Contact contact = new Contact(firstName, lastName, phoneNumber);
        contacts.add(contact);

        System.out.println("Контакт створено успішно.");
    }

    private static void deleteContact() {
        System.out.print("Введіть ім'я контакту, який потрібно видалити: ");
        String firstName = scanner.nextLine();

        Contact contactToRemove = null;

        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                contactToRemove = contact;
                break;
            }
        }

        if (contactToRemove != null) {
            contacts.remove(contactToRemove);
            System.out.println("Контакт видалено успішно.");
        } else {
            System.out.println("Контакт з таким ім'ям не знайдено.");
        }
    }

    private static void editContact() {
        System.out.print("Введіть ім'я контакту, який потрібно редагувати: ");
        String firstName = scanner.nextLine();

        Contact contactToEdit = null;

        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                contactToEdit = contact;
                break;
            }
        }

        if (contactToEdit != null) {
            System.out.print("Введіть нове ім'я: ");
            String newFirstName = scanner.nextLine();
            System.out.print("Введіть нове прізвище: ");
            String newLastName = scanner.nextLine();
            System.out.print("Введіть новий номер телефону: ");
            String newPhoneNumber = scanner.nextLine();

            contactToEdit = new Contact(newFirstName, newLastName, newPhoneNumber);
            System.out.println("Контакт відредаговано успішно.");
        } else {
            System.out.println("Контакт з таким ім'ям не знайдено.");
        }
    }

    private static void listContacts() {
        if (contacts.isEmpty()) {
            System.out.println("У вас немає жодного контакту.");
        } else {
            System.out.println("Список усіх контактів:");
            for (Contact contact : contacts) {
                System.out.println(contact);
                System.out.println("---------------------");
            }
        }
    }
}
