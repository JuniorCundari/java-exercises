public class CheckingAccount {
    String number;
    String agency;
    double balance;
    double currentLimitValue;
    double limitValue;
    boolean special;

    void debit(double debitAmount) {
        balance -= debitAmount;
    }

    boolean withdraw(double withdrawalAmount) {
        if (balance >= withdrawalAmount) {
            debit(withdrawalAmount);
            return true;
        } else {
            if (special) {
                double limit = currentLimitValue + balance;
                if (limit >= withdrawalAmount) {
                    debit(withdrawalAmount);
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    void deposit(double depositAmount) {
        balance += depositAmount;
    }

    void checkBalance() {
        System.out.println("Saldo: " + balance);

        overdraft();
        System.out.println("Limite: " + currentLimitValue);
    }

    void overdraft() {
        if (balance < 0) {
            System.out.println("Você está usando o cheque especial!");
        }
    }
}
