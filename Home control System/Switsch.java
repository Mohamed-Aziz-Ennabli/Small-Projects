import device.Device;
class Switsch extends PowerDevice {
    boolean isOn;
    Device device ; 
    public Switsch(Device device){
        this.device = device;
        this.isOn = false ;  
    }
    @Override
    public void poll(){
        if(isOn){ // Open Function 
            device.run();
            isOn = false;
        }else{ // Ausschaltung Methode
            device.stop();
            isOn = true;
        }
    }
}