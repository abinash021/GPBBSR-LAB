/*
Design a class to represent a bank account. Include the following members:

Data members:
-> Name of the depositor
-> Account Number
-> Type of account
-> Balance amount in the account

Methods:
-> To assign initial values
-> To deposit an amount
-> To withdraw an amount
-> To display the name and balance 
*/


public class Bank_account {
    public static void main(String[] args) {
        Bank Abinash = new Bank();
        Abinash.CreateAccount("Abinash", 340393, "Savings", 9908);
        Abinash.PrintBalances();
        System.out.println("\nAdding 100 rupees and printing the value again...");
        Abinash.Deposit(1000);
        Abinash.PrintBalances();
        System.out.println("\nWithdrawing 100 rupees and printing the value again...");
        Abinash.Withdraw(100);
        Abinash.PrintBalances();
    }
}

class Bank {
    String name;
    int accNo;
    String accType;
    double balance;

    public void CreateAccount(String naam, int acno, String Accty, double bal) {
        this.name = naam;
        this.accNo = acno;
        this.accType = Accty;
        this.balance = bal;
    }

    public void Deposit(double amt) {
        this.balance = this.balance + amt;
    }

    public void Withdraw(double amt) {
        this.balance = this.balance - amt;
    }

    public void PrintBalances() {
        System.out.println("Name: " + this.name);
        System.out.println("Account Number: " + this.accNo);
        System.out.println("Account Type: " + this.accType);
        System.out.println("Balance: " + this.balance);
    }
}