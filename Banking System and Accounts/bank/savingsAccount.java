package bank;
public class savingsAccount extends Account {
        private double interestRate; 
        public savingsAccount(int accnum , double balance, double interestRate){
            super(accnum, balance);
            this.interestRate = interestRate;
        } 
        public double getRate(){
            return interestRate;
        }
        public void interest(){ //Rechnen die Geldbetrag nach Zinsen
            double betrag = getBalance();
            if(betrag >= 100 ){
                betrag += betrag*(getRate());
                System.out.println("Your new Balance : "+ betrag) ;
                balance = betrag;
            }
        }
        @Override  //Override weil die Methode withdraw bereits existiert 
        public void withdraw(double amount) {
            double balance = getBalance();
            if (amount > 0 && balance >= amount + 100) {
                balance -= amount;
                System.out.println("Auszahlung erfolgreich !");
            }else{
                System.out.println("Auszahlung Nicht Erfolgreich! ");
            
        }

}
}