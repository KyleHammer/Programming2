/**
 * A customer has a savings account and a loan account.
 *
 * You can deposit into and withdraw from the savings account,
 * and you can transfer money from the savings to the loan account.
 * You can also view the balance of all accounts.
 */


// == GOALS == 
// Menu - CUSTOMER, it's our main class and works with multiple accounts (e.g. transfer)
// Deposit - CUSTOMER+ACCOUNT, call deposit() from customer, deposit(double amount) in account
// Withdraw - CUSTOMER+ACCOUNT, call withdraw() from customer, withdraw(double amount) in account
// Transfer - CUSTOMER+ACCOUNT, call transfer() from customer, transferTo(Account target, double amount) in account
// Show - CUSTOMER+ACCOUNT, call show() from customer, Override toString() in account
// Exit - CUSTOMER, call exit() from customer

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
