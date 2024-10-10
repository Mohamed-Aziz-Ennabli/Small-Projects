import bank.* ;
public class main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        // Eröffnung einer Konten
        for (int i = 0; i < 20; i++) {
            double rand = Math.random();
            bank.open(rand <0.5 ); // Random Savings und Current Accounts if rand <0.5 == true d.h Eröffnung von Sparkonto sonst Girokonto
        }

        // Konten aktualisieren
        bank.update();

        // Zufällige Transaktionen durchführen
        
        for (Account acc : bank.getAccounts()) {
            double rand =  Math.random();
            double rand2 =  Math.random();
            if(acc instanceof savingsAccount){                
                bank.deposit(acc.getAccnum(),rand *100 ); // Zufälliger Betrag einzahlen
                bank.withdraw(acc.getAccnum(),rand2*100); // Zufälliger Betrag abheben
                bank.close(acc.getAccnum());
            }else{
                bank.deposit(acc.getAccnum(),rand *1000 ); // Zufälliger Betrag einzahlen
                bank.withdraw(acc.getAccnum(),rand2*1000); // Zufälliger Betrag abheben
                bank.close(acc.getAccnum());
            }
            
        }

        
    }
}