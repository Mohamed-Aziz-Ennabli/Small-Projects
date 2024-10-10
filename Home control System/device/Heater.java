package device;
public class Heater implements Device{
    String name ; 
    public Heater(String name){
        this.name = name ; 
    }
    public String getName(){
        return name; 
    }
    // Running Methode
    public void run(){
        System.out.println(" Heater is running !");
    }
    // Stop Methode
    public void stop(){
        System.out.println(" Heater is stopping ! ");
    }
}