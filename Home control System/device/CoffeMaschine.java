package device;
public class CoffeMaschine implements Device {
    public CoffeMaschine(){}
    // Run Methode
    public void run(){
        System.out.println(" Coeffe is Cooking  !");
    }
    // Stop Methode
    public void stop(){
        System.out.println(" Heater is Ready ! ");
    }
}