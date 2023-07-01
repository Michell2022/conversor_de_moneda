import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Temperatura {

	public static void conversionTemperatura(double cantidad) {
	    String[] opciones = {
	            "De Grados Celsius a Grados Fahrenheit",
	            "De Grados Celsius a Kelvin",
	            "De Grados Fahrenheit a Grados Celsius",
	            "De Kelvin a Grados Celsius",
	            "De Kelvin a Grados Fahrenheit"
	    };

	    String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione la opción a convertir", "Temperatura", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);

	    double resultado = 0;
	    String InputGrado = "";
	    String OutGrado = "";
	    DecimalFormat decimalFormat = new DecimalFormat("#.##");

	    switch (seleccion) {
	        case "De Grados Celsius a Grados Fahrenheit":
	        	InputGrado = " Grados Celsius";
	        	OutGrado = " Grados Fahrenheit";
	            resultado = (cantidad * 9 / 5) + 32;
	            break;
	        case "De Grados Celsius a Kelvin":
	        	InputGrado = " Grados Celsius";
	        	OutGrado = " Kelvin";
	            resultado = cantidad + 273.15;
	            break;
	        case "De Grados Fahrenheit a Grados Celsius":
	        	InputGrado = " Grados Fahrenheit";
	        	OutGrado = " Grados Celsius";
	            resultado = (cantidad - 32) * 5 / 9;
	            break;
	        case "De Kelvin a Grados Celsius":
	        	InputGrado = " Kelvin";
	        	OutGrado = " Grados Celsius";
	            resultado = cantidad - 273.15;
	            break;
	        case "De Kelvin a Grados Fahrenheit":
	        	InputGrado = " Kelvin";
	        	OutGrado = " Grados Fahrenheit";
	            resultado = (cantidad - 273.15) * 9 / 5 + 32;
	            break;
	        default:
	            JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
	            return;
	    }

	    String resultadoFormateado = decimalFormat.format(resultado);
	    JOptionPane.showMessageDialog(null, cantidad + InputGrado + " son " + resultadoFormateado + OutGrado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
}
