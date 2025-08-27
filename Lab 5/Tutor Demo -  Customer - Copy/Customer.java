/**
 * A customer has a savings account and a loan account.
 *
 * You can deposit into and withdraw from the savings account,
 * and you can transfer money from the savings to the loan account.
 * You can also view the balance of all accounts.
 */


// == GOALS == 

public class Customer {
    // == FIELDS == 
    // A customer has a savings account and a loan account.
    Account savingsAccount;
    Account loanAccount;

    // == CONSTRUCTOR == 
    // Default values? Read-based? Initilise from params?
    // savingsAccount, loanAccount
    // Does not specify to read anything, or init from params
    // so we can just start from literals/default values
    public Customer(){
        savingsAccount = new Account("Savings");
        loanAccount = new Account("Loan");
    }
}
