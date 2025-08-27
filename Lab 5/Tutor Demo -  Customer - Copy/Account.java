/**
 * Each account has a type (Savings/Loan) and a balance.
 * The initial balance is read in from the user.
 *
 * You can deposit into and withdraw from an account, and
 * transfer money to another account.
 * In all of these, the amount is read in.
 */

// == GOALS == 


public class Account {
    // == FIELDS == 
    // Each account has a type (savings/loan) and a balance.
    String type;
    double balance;

    // == CONSTRUCTOR ==
    // Default values? Read-based? Initilise from params?
    // type: This could be "savingsAccount" or "loanAccount"
    // balance: The initial balance is "read in" from the user.
    public Account(String type){
        this.type = type;
        // balance = readBalance();
    }


}
