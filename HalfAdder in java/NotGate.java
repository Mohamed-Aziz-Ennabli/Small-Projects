/**
 * This class represents a The NotGate.
 * This is SubClass von Gate   
 * it makes the logical state NOT !
 * 
 * @author Mohamed Aziz Ennabli
 * @version 30/04/2023
 */

public class NotGate extends Gate {

    // Konstruktor
    public NotGate(String symbol) {
        super(symbol);
    }

    @Override
    public boolean evaluate(boolean a, boolean b) {
        // Der Wert von 'b' wird ignoriert,
        if(a==true){
            return false;
        }else{
            return true;
        }
    }
    
        
    

    
}
