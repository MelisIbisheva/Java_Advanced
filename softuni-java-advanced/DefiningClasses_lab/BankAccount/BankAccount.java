package DefiningClasses_lab;

public class BankAccount {
    private static double interestRote = 0.02;
    private static int nextId = 1;
    private int id;
    private double balance;

    public BankAccount(){
        this.id = nextId;
        nextId++;
    }

    public static void setInterestRate(double interest){
        interestRote = interest;
    }

    public double getInterest(int years){
        return interestRote * years * this.balance;

    }
    public void deposit(double amount){
        this.balance += amount;
    }

    public int getId() {
        return id;
    }
}
