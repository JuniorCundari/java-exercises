package com.junior.ex1;

import java.util.Scanner;

public class TestContactBook {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o nome da agenda? ");
        String name = scan.nextLine();

        ContactBook contactBook = new ContactBook(name);

        Contact[] contacts = new Contact[3];

        System.out.println("------------------------------------------");
        System.out.println("Adicione as informações do contato");

        for (int i = 0; i < contacts.length; i++) {
            System.out.println("------------------------------------------");
            Contact contact = new Contact();

            System.out.print("Informe o nome do " + (i + 1) + "° contato: ");
            contact.setName(scan.nextLine());

            System.out.print("Informe o telefone do " + (i + 1) + "° contato: ");
            contact.setPhone(scan.nextLine());

            System.out.print("Informe o email do "  + (i + 1) + "° contato: ");
            contact.setEmail(scan.nextLine());

            contacts[i] = contact;
        }

        contactBook.setContacts(contacts);

        System.out.println("------------------------------------------");

        System.out.println(contactBook.showInfo());
    }
}