import account.Account;
import account.SavingsAccount;
import account.CurrentAccount;
import payment.Payment;
import payment.UPIPayment;
import payment.CardPayment;
import payment.OnlineTransaction;

public class Main {
    public static void main(String[] args) {
        Account account;

        account = new SavingsAccount("SA1001", "Sajan", 25000, 6.5);
        account.displayDetails();

        System.out.println();
        account = new CurrentAccount("CA2001", "Krishna", 40000, 10000);
        account.displayDetails();

        System.out.println();
        Payment payment;

        UPIPayment upi = new UPIPayment();
        payment = upi;
        payment.pay(1500);
        upi.verifyPayment();

        payment = new CardPayment();
        payment.pay(3000);

        System.out.println();
        System.out.println("UPI is an online transaction: " + (upi instanceof OnlineTransaction));
        System.out.println("Card is an online transaction: " + (payment instanceof OnlineTransaction));
    }
}
