import java.util.Scanner;

class BankAccount {
    int accno;
    double balance;

   
    BankAccount(int a, double b) {
        this.accno = a;
        this.balance = b;
    }

   
    void deposit(double depositAmount) {
        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.println("Deposited: $" + depositAmount);
        } else {
            System.out.println("Invalid deposit amount...");
        }
    }

    
    void withdraw(double withdrawAmount) {
        if (withdrawAmount > 0 && withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("Withdrawn: $" + withdrawAmount);
        } else {
            System.out.println("Invalid withdraw amount...");
        }
    }

    
    void display() {
        System.out.println("Account Number: " + accno + "; Account Balance: $" + balance);
    }
}


class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accno, double balance, double interestRate) {
        super(accno, balance); 
        this.interestRate = interestRate;
    }

    
    void deposit(double depositAmount) {
        super.deposit(depositAmount); 
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest Added: $" + interest);
    }
}


class CheckingAccount extends BankAccount {
    double overdraftLimit;

    CheckingAccount(int accno, double balance, double overdraftLimit) {
        super(accno, balance);
        this.overdraftLimit = overdraftLimit;
    }

    
    
    void withdraw(double withdrawAmount) {
        if (withdrawAmount > 0 && (balance - withdrawAmount >= -overdraftLimit)) {
            super.withdraw(withdrawAmount); // Call parent method
        } else {
            System.out.println("Withdrawal denied! Overdraft limit exceeded.");
        }
    }
}


public class constructor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Choose account type: Savings or Checking");
        String accountType = scan.nextLine().toLowerCase();

        BankAccount account = null;
        
        if (accountType.equals("savings")) {
            System.out.print("Enter Savings Account Number: ");
            int accNo = scan.nextInt();
            System.out.print("Enter Initial Balance: ");
            double balance = scan.nextDouble();
            System.out.print("Enter Interest Rate: ");
            double interestRate = scan.nextDouble();
            account = new SavingsAccount(accNo, balance, interestRate);
        } else if (accountType.equals("checking")) {
            System.out.print("Enter Checking Account Number: ");
            int accNo = scan.nextInt();
            System.out.print("Enter Initial Balance: ");
            double balance = scan.nextDouble();
            System.out.print("Enter Overdraft Limit: ");
            double overdraftLimit = scan.nextDouble();
            account = new CheckingAccount(accNo, balance, overdraftLimit);
        } else {
            System.out.println("Invalid account type selected!");
            scan.close();
            return;
        }

        
        

        
        System.out.print("Enter deposit amount: ");
        double depositAmount = scan.nextDouble();
        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = scan.nextDouble();
        System.out.println("Account details");
        account.deposit(depositAmount);
        account.display();
        account.withdraw(withdrawAmount);
        account.display();

        scan.close();
    }
}
