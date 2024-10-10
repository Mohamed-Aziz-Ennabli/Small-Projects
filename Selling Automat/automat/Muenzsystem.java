package automat;
public class Muenzsystem {
    private int[] validCoins ={1, 2, 5, 10, 20, 50, 100, 200}; 
    private int[] insertedCoins  ; 
    private int[] currentCoins ; 
    public Muenzsystem(int[] validCoins){
        this.validCoins = validCoins; // final 
        this.insertedCoins = new int[validCoins.length];
        this.currentCoins = new int[validCoins.length];

    }
    public int[] getValidcoins(){
        return validCoins;
    }
    public int[] getInsertedCoins(){
        return insertedCoins;
    }
    public int[] getCurrentCoins(){
        return currentCoins;
    }
    public Boolean insert(int x){
        boolean check = false ; 
        for(int i= 0; i<validCoins.length; i++){ //überprüfen wir dass die eingewerfene Coin gültig ist.    
            if (validCoins[i]== x){
                insertedCoins[i]++;
                check = true ;
                System.out.println("Coin gültig !");
            } 
        }
        if(check == false){
            System.out.println("Ihre Muenzen ist nicht gültig in unsere System !");
        }
        return check;
    }
    public boolean buy(int wert){
        boolean check = false;
        int sum = 0; 
        for(int i=0 ; i<insertedCoins.length ; i++){
            sum += insertedCoins[i];            
        }
        if (sum >= wert){                                 
            check = true ;
            for(int i=0 ; i<insertedCoins.length ; i++){
                currentCoins[i]+= insertedCoins[i];
            }
        }
        return check; 

    }
    public void reset(){
        insertedCoins = new int[validCoins.length]; 
        System.out.println("Ihre Geld wird zurückgegeben.");
    }
}