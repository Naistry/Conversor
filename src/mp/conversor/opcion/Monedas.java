package mp.conversor.opcion;

public class Monedas {

	public Monedas() {
		
	}
	
	public double getDolar(double dinero){
		return dinero *0.0073;
	}
	
	public double getEuro(double dinero){
		return dinero *0.0073;
	}
	
	public double getLibras(double dinero){
		return dinero *0.0062;
	}
	
	public double getYen(double dinero){
		return dinero *1;
	}
	
	public double getWon(double dinero){
		return dinero *9.73;
	}
	
	public double getDolarToPesos(double dinero){
		return dinero *137.64;
	}
	public double getEuroToPesos(double dinero){
		return dinero *137.53;
	}
	public double getLibraToPesos(double dinero){
		return dinero *161.91;
	}
	public double getYenToPesos(double dinero){
		return dinero *1;
	}
	public double getWonToPesos(double dinero){
		return dinero *0.10;
	}
	
	
	
	
}
