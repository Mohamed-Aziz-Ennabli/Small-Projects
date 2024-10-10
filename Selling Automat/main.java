import automat.* ; 
class main{
    public static void main(String[] args) {
        int[] validCoins ={1, 2, 5, 10, 20, 50, 100, 200};
        Muenzsystem ms = new Muenzsystem(validCoins);
        Ware[] waren = new Ware[]{
            new Ware(1, "Schokolade", 60),
            new Ware(2, "Pepsi", 110),
            new Ware(3, "Bier", 200),
            new Ware(4, "Nussel", 90),
            new Ware(5, "Wasser", 160)
        };
        Automat automat = new Automat(ms, waren);

        automat.printWare(); // Waren ausgeben
        
        // Münzen einwerfen
        automat.insertCoin(10); // gültig
        automat.insertCoin(15); // ungültig
        automat.insertCoin(100); // gültig
        
        // Reset und Rückgabe der Münzen
        automat.abort();
        // Coins einwerfen:
        automat.insertCoin(100);
        automat.insertCoin(10);
        automat.insertCoin(50);

        boolean success = automat.select(5); // Wasser wählen
        if (success) {
            System.out.println("Danke Schön für Ihre Kauf.");
        } else {
            System.out.println("Nicht genug Münzen oder Ware nicht gefunden.");
        }
    }
}