package account;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Savings Account");
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
