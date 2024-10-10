package bank;
public class Account{
    protected int accnum  ; //die Subclasses müssen Zugriff zu dieser Variable Haben
    protected double balance; 
    public Account(int accnum , double balance){
        this.accnum = accnum;
        this.balance = balance;
    }
    public int getAccnum(){
        return this.accnum;
    }
    public double getBalance(){
        return this.balance;
    }
    public void deposit(double wert){
        if(wert > 0 ){
            balance += wert;
            System.out.println("Einzahlung erfolgreich !");
        }else{
            System.out.println("Nicht Erfolgreich! ");
        }
    }
    public void withdraw(double wert){
        if(wert > 0 && balance >= wert ){
            balance -= wert;
            System.out.println("Auszahlung erfolgreich !");
        }else{
            System.out.println("Auszahlung Nicht Erfolgreich! ");
        }
    }
}