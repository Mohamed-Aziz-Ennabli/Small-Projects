import device.Device;
import device.Lamp;
import device.Heater;
import device.CoffeMaschine;

public class main{
    public static void main(String[] args){
        //Erstellung von Devices 
        Device schlafzimmerlicht = new Lamp("Schlafzimmer"); 
        Device badzimmerlicht = new Lamp("Badzimmer");
        Device heater = new Heater("Heater");
        Device Kaffeemaschine = new CoffeMaschine();
        // Erstellung von PowerDevices-Array 
        PowerDevice[] devices = {
            new Switsch(schlafzimmerlicht), 
            new Switsch(badzimmerlicht),
            new Switsch(heater),
            new Button(Kaffeemaschine)
        };
        // Running PowerDevices
        for (PowerDevice device : devices) {
            device.poll();
        }
        
        // Aktivieren Sie alle Systeme
        for (PowerDevice device : devices) {
            device.poll();
        }
    }
}   