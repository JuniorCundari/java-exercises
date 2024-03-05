package com.junior.ex1;

public class ContactBook {
    private String name;
    private Contact[] contacts;

    public ContactBook() {}

    public ContactBook(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    public String showInfo() {
        String info = "Nome da Agenda: " + name + "\n";

        if (contacts != null) {
            for (Contact contact : contacts) {
                info += contact.showInfo() + "\n";
            }
        }

        return info;
    }
}
