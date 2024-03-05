public class Main {
    public static void main(String[] args) {

        Contact contact1 = new Contact();

        contact1.name = "Junior";
        contact1.address = "Rua Dos Rios, 502";
        contact1.email = "jr@email.com";

        contact1.numberPhones = new String[5];
        contact1.numberPhones[0] = "(99)99999-9999";
        contact1.numberPhones[1] = "(88)88888-8888";
        contact1.numberPhones[2] = "(77)77777-7777";
        contact1.numberPhones[3] = "(66)66666-7777";
        contact1.numberPhones[4] = "(55)55777-7777";

        System.out.println(contact1.name + " mora na " + contact1.address);
    }
}