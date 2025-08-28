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
    public static void main(String[] args){
        new Customer().use();
    }

    // == FIELDS == 
    // A customer has a savings account and a loan account.
    private Account savingsAccount;
    private Account loanAccount;

    // == CONSTRUCTOR == 
    // Default values? Read-based? Initilise from params?
    // savingsAccount, loanAccount
    // Does not specify to read anything, or init from params
    // so we can just start from literals/default values
    public Customer(){
        savingsAccount = new Account("Savings");
        loanAccount = new Account("Loan");
    }

    private char readChoice(){
        System.out.print("Customer menu (d/w/t/s/x): ");
        return In.nextChar();
    }

    // For now keep private
    // BUT what if we had a "Bank" class that wants to access customer.use()?
    private void use(){
        char choice;
        while((choice = readChoice()) != 'x'){
            switch(choice){
                case 'd': deposit(); break;
                case 'w': withdraw(); break;
                case 't': transfer(); break;
                case 's': show(); break;
                default: help(); break;
            }
        }
    }

    private double readAmountToDeposit() {
        System.out.print("Amount to deposit: $");
        return In.nextDouble();
    }

    private void deposit() {
        savingsAccount.deposit(readAmountToDeposit());
    }

    private void withdraw(){

    }

    private void transfer(){

    }

    private void show(){
        System.out.println(savingsAccount);
        System.out.println(loanAccount);
    }

    private void help() {
        System.out.println("Menu options");
        System.out.println("d = deposit");
        System.out.println("w = withdraw");
        System.out.println("t = transfer");
        System.out.println("s = show");
        System.out.println("x = exit");
    }
}
