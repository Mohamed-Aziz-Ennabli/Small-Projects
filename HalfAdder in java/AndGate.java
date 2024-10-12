/**
 * This class represents a The AndGate.
 * This is SubClass von Gate 
 * it Makes the Logical State AND &&  
 * 
 * @author Mohamed Aziz Ennabli
 * @version 30/04/2023
 */
public class AndGate extends Gate {

    // Konstruktor
    public AndGate(String symbol) {
        super(symbol);
    }

    // Überschriebene Methode zur Auswertung des NOT-Gates
    @Override
    public boolean evaluate(boolean a, boolean b) {
        if((a==false)||(b==false)){         // falls ein wert false ist dann bekommen wir einen false sonst falls eine wahr alle andere wahr 
            return false;
        
        }else{
            return true;
        }
        
    }

}
