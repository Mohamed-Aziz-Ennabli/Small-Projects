/**
 * This class represents a Hallfadder.
 * This uses all  SubClasses von Gate   
 * to creat A halfadder that adds 2 boolean 
 * @author Mohamed Aziz Ennabli
 * @version 30/04/2023
 */
public class HalfAdder {
    private Gate[] Array;

    public HalfAdder() {
        Array = new Gate[4];
        Array[0] = new AndGate("AND");
        Array[1] = new OrGate("OR");
        Array[2] = new NotGate("NOT");
        Array[3] = new XorGate("XOR",Array[0],Array[1],Array[2]);
    }

    public boolean[] add(boolean a, boolean b) {
        boolean[] result = new boolean[2];

        boolean s = Array[3].evaluate(a, b); // XOR fals unterschiedliche booelische wert ergibt 1 dh wir haben 1und 0
        boolean c = Array[0].evaluate(a, b); // AND weil falls wir haben 2 einsen dann haben ein carry
        
        result[0] = s;
        result[1] = c;

        return result;
    }

    // give all the logical Tables of all Gates 
    public void info(){
        for(Gate GG :Array){
            GG.Table();
        }

    }

    public static void main(String[] args ){
        System.out.println("Geben Sie den ersten boolean Wert an:");
        boolean a = new java.util.Scanner( System.in ).nextBoolean();
        
        System.out.println("Geben Sie den zweiten boolean Wert an:");
        boolean b = new java.util.Scanner( System.in ).nextBoolean();    
        
        HalfAdder halfAdder = new HalfAdder();
    
        // Führe die Addition durch
        boolean[] result = halfAdder.add(a, b);
        boolean sum = result[0];
        boolean carry = result[1];
        String ResSum="";
        String ResCarry="";
        if(sum==false){
            ResSum="0";
        }else{
            ResSum="1";
        }
        if(carry==false){

            ResCarry="0";
        }else{
            ResCarry="1";
        }
        System.out.println("Summe ist   "+ResSum+" the übertrag ist "+ResCarry);  
    
        halfAdder.info();
        }
    
}


