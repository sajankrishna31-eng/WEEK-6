package account;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void displayDetails() {
        System.out.println("Current Account");
        super.displayDetails();
        System.out.println("Overdraft Limit: ₹" + overdraftLimit);
    }
}
