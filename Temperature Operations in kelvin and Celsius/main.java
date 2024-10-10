import temperature.Temperature;
import temperature.IncompatibleTemperatureException;
import temperature.InvalidTemperatureException;
class main{
    public static void main(String[] args){
        try {
            Temperature tempC = new Temperature(0, "C");
            Temperature tempK = new Temperature(273.15, "K");
            tempC.convertToKelvin();
            tempC.printtoString(); 
            tempK.convertToCelsius();
            tempK.printtoString(); 
            tempC.increaseTemperature(new Temperature(10, "K"));
            tempC.printtoString(); 
            tempC.reduceTemperature(new Temperature(5, "K"));
            tempC.printtoString(); 
        } catch (IncompatibleTemperatureException e) {
            e.printStackTrace();
            e.getMessage();
        } catch ( InvalidTemperatureException e){
            e.printStackTrace();
            e.getMessage();
        }
        
        
    }
}