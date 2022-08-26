package mp.conversor;

import javax.swing.JOptionPane;

import mp.conversor.opcion.Monedas;
import mp.conversor.opcion.Temperaturas;

public class App {

	public static void main(String[] args) {
	
		try {
	int respuesta = 0;
	while(respuesta == 0) {

	Object opcion = JOptionPane.showInputDialog(null,"Seleccione una opción de conversión",
				   "Menú", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { "Conversor de Moneda","Conversor de Temperatura" },"Seleccione");
		
	
	if(opcion.toString()=="Conversor de Moneda") {
		
		try {
		
		String cantidadString =JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desee convertir");
		
	if(cantidadString != "") {//inicio if de cantidadString
			
			float cantidad = Integer.parseInt(cantidadString);
			
			Object moneda = JOptionPane.showInputDialog(null,"Elija la moneda a que desea convetir su dinero",
					   "Monedas", JOptionPane.QUESTION_MESSAGE, null,
					  new Object[] { "Convertir Pesos a Dólar","Convertir Pesos a Euros"
							  ,"Convertir Pesos a Libras Esterlinas"
							  ,"Convertir Pesos a Yen Japonés"
							  ,"Convertir Pesos a Won sul-coreano"
							  ,"Convertir Dólar a Pesos"
							  ,"Convertir Euros a Pesos"
							  ,"Convertir Libras Esterlinas a Pesos"
							  ,"Convertir Yen Japonés a Pesos"
							  ,"Convertir Won sul-coreano a Pesos"},"Seleccione");
			
			
			Monedas tipoMoneda = new Monedas();
			
			switch (moneda.toString()) {
			case "Convertir Pesos a Dólar":
				JOptionPane.showMessageDialog(null,"Tienes "+ tipoMoneda.getDolar(cantidad)+ " dólares");
				break;
			case "Convertir Pesos a Euros":
				JOptionPane.showMessageDialog(null,"Tienes "+ tipoMoneda.getEuro(cantidad) + " Euros");
				break;
			case "Convertir Pesos a Libras Esterlinas":
				JOptionPane.showMessageDialog(null,"Tienes "+ tipoMoneda.getLibras(cantidad)+ " Libras");
				break;
			case "Convertir Pesos a Yen Japonés":
				JOptionPane.showMessageDialog(null,"Tienes "+ tipoMoneda.getYen(cantidad)+ " Yens");
				break;
			case "Convertir Pesos a Won sul-coreano":
				JOptionPane.showMessageDialog(null,"Tienes "+ tipoMoneda.getWon(cantidad)+ " Wons");
				break;
			case "Convertir Dólar a Pesos":
				JOptionPane.showMessageDialog(null,"Tienes "+ tipoMoneda.getDolarToPesos(cantidad)+ " Pesos");
				break;
			case "Convertir Euros a Pesos":
				JOptionPane.showMessageDialog(null,"Tienes "+ tipoMoneda.getEuroToPesos(cantidad)+ " Pesos");
				break;
			case "Convertir Libras Esterlinas a Pesos":
				JOptionPane.showMessageDialog(null,"Tienes "+ tipoMoneda.getLibraToPesos(cantidad)+ " Pesos");
				break;
			case "Convertir Yen Japonés a Pesos":
				JOptionPane.showMessageDialog(null,"Tienes "+ tipoMoneda.getYenToPesos(cantidad)+ " Pesos");
				break;
			case " Won sul-coreano a Pesos":
				JOptionPane.showMessageDialog(null,"Tienes "+ tipoMoneda.getWonToPesos(cantidad)+ " Pesos");
				break;
				

			default:
				break;
			}
	     }//cierre if cantidadString
	
	
	
		}catch(Exception e) {
			

			JOptionPane.showMessageDialog(null, "Dinero no válido",
					  "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
		}
	
	    
	}//cierre if conversor de monedas
	
	
	if(opcion.toString()=="Conversor de Temperatura") {
		try {
			String temperaturaString =JOptionPane.showInputDialog("Ingrese la temperaturaS");
			
			if(temperaturaString != "") {//inicio if de cantidadString
				
				float cantidad = Integer.parseInt(temperaturaString);
				
				Object temperatura = JOptionPane.showInputDialog(null,"Elija la temperatura que desea convetir",
						   "Monedas", JOptionPane.QUESTION_MESSAGE, null,
						  new Object[] { "Convertir Celsius a Kelvin",
								  "Convertir Celsius a Fahrenheit",
								  "Convertir Celsius a Reaumur", 
								  "Convertir Celsius a Rankine",
								  "Convertir Kelvin a Celsius",
								  "Convertir Fahrenheit a Celsius",
								  "Convertir Reaumur a Celsius",
								  "Convertir Rankine a Celsius"
								  },"Seleccione");
				Temperaturas tipoTemperatura= new Temperaturas ();
				
				switch (temperatura.toString()) {
				case "Convertir Celsius a Kelvin":
					JOptionPane.showMessageDialog(null, tipoTemperatura.getKelvin(cantidad)+"(K)");
					break;
				
				case "Convertir Celsius a Fahrenheit":
					JOptionPane.showMessageDialog(null, tipoTemperatura.getFahrenheit(cantidad)+"(F)");
					break;
					
				case "Convertir Celsius a Reaumur":
					JOptionPane.showMessageDialog(null, tipoTemperatura.getReaumur(cantidad)+"(R)");
					break;
					
				case "Convertir Celsius a Rankine":
					JOptionPane.showMessageDialog(null, tipoTemperatura.getRankine(cantidad)+" Rankine");
					break;
					
				case "Convertir Kelvin a Celsius":
					JOptionPane.showMessageDialog(null, tipoTemperatura.getKelvinToCelsius(cantidad)+" (C)");
					break;
					
				case "Convertir Fahrenheit a Celsius":
					JOptionPane.showMessageDialog(null, tipoTemperatura.getFahrenheitToCelsius(cantidad)+" (C)");
					break;
					
				case "Convertir Reaumur a Celsius":
					JOptionPane.showMessageDialog(null, tipoTemperatura.getReaumurToCelsius(cantidad)+" (C)");
					break;
					
				case "Convertir Rankine a Celsius":
					JOptionPane.showMessageDialog(null, tipoTemperatura.getRankineToCelsius(cantidad)+" (C)");
					break;

				default:
					break;
				}
			
			}
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Temperatura no válida",
					  "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
			
		}
	}
	
	
	int resp=JOptionPane.showConfirmDialog(null,"Desea continuar?");
      if (JOptionPane.OK_OPTION == resp){
    	 respuesta = resp;
      } else{
    	 respuesta = resp;
      }
	 

	}
	}catch(Exception e) {
			
		}
	
	
	  JOptionPane.showMessageDialog(null,"Programa finalizado");

	}
	
}
