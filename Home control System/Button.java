import device.Device;

class Button extends PowerDevice{
    public Button(Device device){
        this.device = device ;    
    }
    @Override
    public void poll(){
        device.run();
        device.stop();
    }
}