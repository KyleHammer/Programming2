import java.text.*;
/**
 * Each account has a type (Savings/Loan) and a balance.
 * The initial balance is read in from the user.
 *
 * You can deposit into and withdraw from an account, and
 * transfer money to another account.
 * In all of these, the amount is read in.
 */

// == GOALS == 
// Deposit - CUSTOMER+ACCOUNT, call deposit() from customer, deposit(double amount) in account
// Withdraw - CUSTOMER+ACCOUNT, call withdraw() from customer, withdraw(double amount) in account
// Transfer - CUSTOMER+ACCOUNT, call transfer() from customer, transferTo(Account target, double amount) in account
// Show - CUSTOMER+ACCOUNT, call show() from customer, Override toString() in account

public class Account {
    // == FIELDS == 
    // Each account has a type (savings/loan) and a balance.
    private String type;
    private double balance;

    // == CONSTRUCTOR ==
    // Default values? Read-based? Initilise from params?
    // type: This could be "savingsAccount" or "loanAccount"
    // balance: The initial balance is "read in" from the user.
    public Account(String type){
        this.type = type;
        balance = readBalance();
    }

    private double readBalance(){
        System.out.print("Initial " + type + " balance: $");
        return In.nextDouble();
    }

    // Needs to be accessed by Customer (Public)
    // Also why Override?
    @Override
    public String toString(){
        return type + " account has $" + formatted();
    }

    private String formatted(){
        return new DecimalFormat("###,##0.00").format(balance);
    }
}
