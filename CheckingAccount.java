public class CheckingAccount {
    private String name;
    private int balance;
    private String id;

    public CheckingAccount(String inputName, int inputBalance, String inputId) {
        name = inputName;
        balance = inputBalance;
        id = inputId;
    }

    // Write new methods here:
    public int getBalance() {
        return balance;
    }

    public void setBalance(int newBalance) {
        balance = newBalance;
    }

}