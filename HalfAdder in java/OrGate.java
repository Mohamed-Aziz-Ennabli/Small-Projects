/**
 * This class represents a The OrGate.
 * This is SubClass von Gate
 * it makes the logical state Or ||   
 * 
 * @author Mohamed Aziz Ennabli
 * @version 30/04/2023
 */
public class OrGate extends Gate {

    // Konstruktor
    public OrGate(String symbol) {
        super(symbol);
    }

    @Override
    public boolean evaluate(boolean a, boolean b) {
        
        if(a==true||b==true){         // falls ein wert true ist dann bekommen wir immer True sonst falls beide false dann ergibt 0  
            return true;
        
        }else{
            return false;
        }
        
    } 
}

    

