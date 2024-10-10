package temperature;
public class IncompatibleTemperatureException extends Exception{
    public IncompatibleTemperatureException(String message){
        super(message);
    }
}