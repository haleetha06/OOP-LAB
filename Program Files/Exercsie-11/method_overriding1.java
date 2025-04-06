class Bank {
    double getInterestRate() {
        return 0;
    }
}

class SBI extends Bank {
    
    double getInterestRate() {
        return 5.5;
    }
}

class HDFC extends Bank {
    
    double getInterestRate() {
        return 6.2;
    }
}

class ICICI extends Bank {
   
    double getInterestRate() {
        return 7.0;
    }
}

public class method_overriding1 {
    public static void main(String[] args) {
        Bank bank;
        

         bank = new SBI();
        System.out.println("SBI Interest Rate: " + bank.getInterestRate() + "%");

        bank = new HDFC();
        System.out.println("HDFC Interest Rate: " + bank.getInterestRate() + "%");

         bank = new ICICI();
        System.out.println("ICICI Interest Rate: " + bank.getInterestRate() + "%");
    }
}
