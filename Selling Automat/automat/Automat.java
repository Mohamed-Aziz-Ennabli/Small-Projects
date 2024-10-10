package automat;
public class Automat{
    private Muenzsystem ms;
    private Ware[] waren ;
    public Automat(Muenzsystem ms, Ware[] waren){
        this.ms= ms  ;
        this.waren = waren;
    }
    public void printWare(){ //Gibt alle Waren aus.
        for(int i = 0; i<waren.length; i++ ){
            waren[i].toString();
        }
    }
    public boolean insertCoin(int coinValue) {
        return ms.insert(coinValue);
    }
    public boolean select(int x){
        boolean check = false;
        for(int i = 0; i<waren.length;i++ ){
            if(waren[i].getWare()== x){
                ms.buy(waren[i].getPrice());
                check = true;
            }
        }
        return check; 

    }

    public void abort() {
        ms.reset();
    }
}