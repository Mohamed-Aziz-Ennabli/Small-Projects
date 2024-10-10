package bank;
public class currentAccount extends Account{
    private double limit;
    public currentAccount(int accnum , double balance, double limit){
        super(accnum, balance);
        this.limit = limit ; 
    }
    public double getlimit(){
        return limit;        
    }
    @Override
    public void withdraw(double amount){
        double balance = getBalance();
        if(amount > 0 && balance - amount >= limit ){
            balance -= amount;
            System.out.println("Auszahlung erfolgreich !");
        }else{
            System.out.println("Auszahlung Nicht Erfolgreich! ");
    }
}
}