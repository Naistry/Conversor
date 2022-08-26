package mp.conversor.opcion;

public class Temperaturas {
	
	public Temperaturas() {
		
	}
	
	public double getKelvin(double temperatura){
		return temperatura + 273.15;
	}
	
	public double getFahrenheit (double temperatura){
		return (temperatura * 1.8) + 32;
	}
	
	public double getReaumur(double temperatura){
		return temperatura * 0.8;
	}
	
	public double getRankine(double temperatura){
		return (temperatura + 273.15)* 9/5;
	}
	
	public double getKelvinToCelsius(double temperatura){
		return temperatura - 273.15;
	}
	public double getFahrenheitToCelsius(double temperatura){
		return (temperatura -32)*5/9;
	}
	public double getReaumurToCelsius(double temperatura){
		return temperatura * 1.25;
	}
	public double getRankineToCelsius(double temperatura){
		return (temperatura - 491.68) / 1.8;
	}
	
}
