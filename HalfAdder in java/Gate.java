/**
 * This class represents a The Gate.
 * This is the Basis Class of all gates 
 * 
 * @author Mohamed Aziz Ennabli
 * @version 30/04/2023
 */


public class Gate {
    protected String symbol;

    // Konstruktor
    public Gate(String symbol) {
        this.symbol = symbol;
    }

    
    public boolean evaluate(boolean a, boolean b) {
        return false; // erste ergebnis von Gate 
    }

    /**
     * Returns a representation of the Logical states with 2 Variables 
     * 
     * @author Mohamed Aziz Ennabli.
     */


    public void Table(){
        String result="";
        result="A "+" | "+"B "+" | "+"A  "+symbol+"  B =";
        result+="\n\n";
        boolean[] ii={false,true};
        boolean[] jj={false,true};
        for(boolean i:ii){
            for(boolean j:jj){
                if(evaluate(i, j)){
                    if(i==true){
                        if(j==true){
                            result+="1 "+" | "+"1 "+" | "+"1";
                            result+="\n\n";
                        }else{
                            result+="1 "+" | "+"0 "+" | "+"1";
                            result+="\n\n";
                        }
                    }else{
                        if(j==true){
                            result+="0 "+" | "+"1 "+" | "+"1";
                            result+="\n\n";
                        }else{
                            result+="0 "+" | "+"0 "+" | "+"1";
                            result+="\n\n";
                        }
                    }
                }else{
                    if(i==true){
                        if(j==true){
                            result+="1 "+" | "+"1 "+" | "+"0";
                            result+="\n\n";
                        }else{
                            result+="1 "+" | "+"0 "+" | "+"0";
                            result+="\n\n";
                        }
                    }else{
                        if(j==true){
                            result+="0 "+" | "+"1 "+" | "+"0";
                            result+="\n\n";
                        }else{
                            result+="0 "+" | "+"0 "+" | "+"0";
                            result+="\n\n";
                        }
                    }

                }
                

            }



        }
        System.err.println(result);

    }  


} 