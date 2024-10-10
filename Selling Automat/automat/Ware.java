package automat;
public class Ware {
    private int id; 
    private String name ; 
    private int price ; 
    public Ware(int id, String name, int price){
        this.id = id ; 
        this.name = name; 
        this.price = price ; 
    }
    public String toString(){
        return getNameWare() + " mit id : "+ getWare() + "kostet "+ getPrice() +" euro ";
    }
    public int getWare(){
        return this.id;
    }
    public String getNameWare(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
}