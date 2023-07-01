import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Conversiones {
	
	public static void conversionMoneda(double cantidad) {

        String[] opciones = {
                "De Soles a Dólar",
                "De Soles a Euros",
                "De Soles a Libras Esterlinas",
                "De Soles a Yen Japonés",
                "De Soles a Won sul-coreano",
                "De Dólar a Soles",
                "De Euros a Soles",
                "De Libras Esterlinas a Soles",
                "De Yen Japonés a Soles",
                "De Won sul-coreano a Soles", 
        };

        String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione la opción a convertir", "Moneda", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);

        double resultado = 0;
        String cambio = "";

        switch (seleccion) {
            case "De Soles a Dólar":
                cambio = " Dólares";
                resultado = cantidad * 0.2762;
                break;
            case "De Soles a Euros":
            	cambio = " Euros";
                resultado = cantidad * 0.25;
                break;
            case "De Soles a Libras Esterlinas":
            	cambio = " Libras Esterlinas";
                resultado = cantidad * 0.21;
                break;
            case "De Soles a Yen Japonés":
            	 cambio = " Yen Japonés";
                resultado = cantidad * 32.14;
                break;
            case "De Soles a Won sul-coreano":
            	 cambio = " Won sul-coreano";
                resultado = cantidad * 337.44;
                break;    
            case "De Dólar a Soles":
            	 cambio = " Soles";
            	resultado = cantidad / 0.28;
            	break;
            case "De Euros a Soles":
            	cambio = " Soles";
            	resultado = cantidad / 0.25;
            	break;
            case "De Libras Esterlinas a Soles":
            	cambio = " Soles";
            	resultado = cantidad / 0.21;
            	break;
            case "De Yen Japonés a Soles":
            	cambio = " Soles";
            	resultado = cantidad / 32.14;
            	break;
            case "De Won sul-coreano a Soles":
            	cambio = " Soles";
            	resultado = cantidad / 337.44;
            	break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
                return;
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String resultadoFormateado = decimalFormat.format(resultado);
        
        JOptionPane.showMessageDialog(null, "Tienes : " + resultadoFormateado + cambio , "Resultado", JOptionPane.INFORMATION_MESSAGE);

    }
	
	
}
