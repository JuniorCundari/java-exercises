public class Main {
    public static void main(String[] args) {

        CheckingAccount account = new CheckingAccount();

        account.number = "0012345";
        account.agency = "7894";
        account.special = true;
        account.limit = 10000;
        account.balance = 5231.98;

        System.out.println("Conta: " + account.number + " Agencia: " + account.agency);
        System.out.println("Conta Especial: " + account.special);
        System.out.println("Saldo: R$ " + account.balance + " com o limite de: R$ " + account.limit);
    }
}