/**
 * This class represents a The XorGate.
 * This is SubClass von Gate 
 * this represents the logical state XOR "^"  
 * 
 * @author Mohamed Aziz Ennabli
 * @version 30/04/2023
 */
public class XorGate extends Gate {
    private Gate and;
    private Gate or;
    private Gate not;

    // Konstruktor
    public XorGate(String symbol, Gate andGate, Gate orGate,Gate notGate) {
        super(symbol);
        this.and = andGate;
        this.or = orGate;
        this.not = notGate;
    }
    @Override
    public boolean evaluate(boolean a, boolean b) {
        boolean notB = not.evaluate(b, a);
        //  NOT B
        boolean notA = not.evaluate(a, b);
        // NOT A
        boolean term1 = and.evaluate(a, notB);
        //  A AND (NOT B)
        boolean term2 = and.evaluate(notA, b);
        // (NOT A) AND B
        return or.evaluate(term1, term2); // (A AND (NOT B)) OR ((NOT A) AND B)
    }

    
}