package Part_One_Fundamentals;
public class Bank {
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;

    public Bank() {
        this.accountOne = new CheckingAccount("Bob", 100, "1");
        this.accountTwo = new CheckingAccount("Jones", 200, "2");
    }

    public static void main(String[] args) {
        Bank bankOfGods = new Bank();
        bankOfGods.accountOne.getAccountInformation();
        //bankOfGods.accountOne.calculateNextMonthInterest();
    }

}