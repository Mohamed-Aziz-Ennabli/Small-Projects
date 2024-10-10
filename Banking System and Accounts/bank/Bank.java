package bank;
public class Bank{
    private Account[] accounts;
    public Bank(){
        this.accounts = new Account[30];
    }
    public Account[] getAccounts(){
        return accounts;
    }
    public static int size = 0; // Global variable 
    public int open(boolean AccTyp){ // Account Type : True  für Savings und false für CurrentAccount
        if(AccTyp == true ){
            Account account = new savingsAccount(size, 100.0,3.0);
            accounts[size]= account;
            size++ ;
        }else {
            Account account = new currentAccount(size, 0.0,-1000.0);
            accounts[size]= account;
            size++;
        }
        return size ;
    }
    public boolean close(int accnum){
        if(accnum >= 0 && accnum<= size && accounts[accnum].getBalance() >= 0){
            for(int i=accnum; i<size-1; i++){
                accounts[i] = accounts[i+1];}
            size--;
            return true;
        }else{
            System.out.println("Konto existiert nicht oder Ihre Betrag ist kleiner als 0.0 euro");
            return false;
        }
    }
    
    public void deposit(int accnum , double geldbetrag){
        Account konto= accounts[accnum];
        konto.deposit(geldbetrag);
    }
    public void withdraw(int accnum , double geldbetrag){
        Account konto= accounts[accnum];
        konto.withdraw(geldbetrag);
    }
    public void update() {
        for (Account acc : accounts) {
            if (acc instanceof savingsAccount) {
                ((savingsAccount) acc).interest();
            }else if( acc instanceof currentAccount){
                if(acc.getBalance() < 0 ){
                    System.out.println("Ihre Geldbetrag kleiner al 0.00 euro.");
                }
            }
        }
    }
}