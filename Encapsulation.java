public class BankAccount {
    private String accountNumber;
    private double balance;
    private String AccHolderName;
    
  
    public BankAccount(String accNo, double bal, String name) {
        this.accountNumber = accNo;
        this.balance = bal;
        this.AccHolderName = name;
    }
    
    public void SetAccHolderName(String name) {
        this.AccHolderName = name;
    }
    
    public double Getbalance(){
        return balance;
    }
    
    public String GetaccHoldername(){
        return AccHolderName;
    }
    
    public String GetaccountNumber(){
        return accountNumber;
    }
    
    public void deposit(double amount){ 
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Deposited: " + amount + " | Total Balance: " + balance);
        }
    }
    
    public void withdraw(double amount){ // FIX 4
        if(amount > 0 && amount <= balance){
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount + " | Remaining: " + balance);
        } else {
            System.out.println("Money low Balance: " + balance);
        }
    }
    
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("1A2543Xxx", 0, "Rahul");
        acc.deposit(10000);
        acc.withdraw(3000);
        acc.withdraw(10000);
    }
}