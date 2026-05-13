package Homework.Homework_9;

class Task3 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);

        try {
            bankAccount.withdraw(500);
            bankAccount.withdraw(600);
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("End of transaction. Current balance: " + bankAccount.getBalance());
        }
    }
}
