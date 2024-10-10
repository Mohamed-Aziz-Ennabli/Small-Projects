package device;
public class Lamp implements Device{
    String name ; 
    public Lamp(String name){
        this.name = name ;
    }
    public String getName(){
        return name;
    }
    // Run Methode
    public void run(){
        System.out.println(" Lamp is On !");
    }
    // Stop Methode
    public void stop(){
        System.out.println(" Lamp is Off ! ");
    }
}