import javax.swing.JOptionPane;

public class Input {

	   public static double obtenerDinero(String tipoConversion) {
		   
		   String mensaje = "";

	        if (tipoConversion.equals("moneda")) {
	            mensaje = "Ingrese la cantidad de dinero que desea convertir";
	        } else if (tipoConversion.equals("temperatura")) {
	            mensaje = "Ingrese la temperatura que desea convertir";
	        }
		   
		   
		   
	        double cantidad = 0;
	        boolean entradaValida = false;

	        while (!entradaValida) {
	        	String respuestaDos = JOptionPane.showInputDialog(null, mensaje, "Input", JOptionPane.QUESTION_MESSAGE);

	            if (respuestaDos == null) {
	                System.exit(0); // Sale del programa si se presiona cancelar o se cierra la ventana
	            }

	            try {
	                cantidad = Double.parseDouble(respuestaDos);
	                entradaValida = true;
	            } catch (NumberFormatException e) {
	                JOptionPane.showMessageDialog(null, "La cantidad ingresada no es válida", "Error", JOptionPane.ERROR_MESSAGE);
	            }
	        }

	        return cantidad;
	    }
}
