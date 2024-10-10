package temperature; 
public class Temperature{
    private double val ; 
    private String type; 
    public Temperature(double val, String type) throws IncompatibleTemperatureException{
        if(!type.equals("C") && !type.equals("K")){
            throw new IncompatibleTemperatureException("Ungültig typ  ");
        }
        this.val= val; 
        this.type = type;
    }
    public String getType(){
        return type; 
    }
    public double getVal(){
        return val;
    }
    public void convertToCelsius() throws IncompatibleTemperatureException{
        if(type.equals("K")){
            this.val = val - 273.15 ; 
        }else{
            throw new IncompatibleTemperatureException("Temperature ist bereits Kelvin ");
        }
    }
    public void convertToKelvin() throws IncompatibleTemperatureException{
         
        if(this.type.equals("K")){
            this.val = val + 273.15 ; 
        }else{
            throw new IncompatibleTemperatureException("Temperature ist bereits Celsius ");
        }
    }
    public void increaseTemperature(Temperature diff) throws IncompatibleTemperatureException {
        if (this.type.equals(diff.getType())) {
            this.val += diff.getVal();
        } else {
            throw new IncompatibleTemperatureException("Temperaturtypen stimmen nicht überein");
    
        }
    }
    public void reduceTemperature(Temperature diff) throws IncompatibleTemperatureException, InvalidTemperatureException {
        if (this.type.equals(diff.getType())) {
            double newValue = val - diff.getVal();
            if ((type.equals("C") && newValue < -273.15) || (type.equals("K") && newValue < 0)) {
                throw new InvalidTemperatureException("Resultierende Temperatur ist unterhalb des absoluten Nullpunkts");                
            } else {
                throw new IncompatibleTemperatureException("Temperaturtypen stimmen nicht überein");
            }
        }
    }        
    public void printtoString(){
        System.out.println("Value =  "+ this.val +" "+ this.type ); 
    }

}