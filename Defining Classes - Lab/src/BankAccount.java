public class BankAccount {
    private static double INTEREST_RATE_VALUE = 0.02;
    private static int idIncrement = 1;
    private   static double interestRate;

    private int id;
    private double balance;


   public BankAccount(){
       this.id = idIncrement++;
       this.balance = balance;
       interestRate = INTEREST_RATE_VALUE;
   }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public static double setInterestRate(double rate){
       return interestRate = rate;
   }

    public  double getInterestRate(int years) {
        return this.balance * interestRate *years;
    }

    public void deposit(double amount){
       this.balance += amount;
    }

    @Override
    public  String toString(){
        return "ID" + this.id;
    }

}
