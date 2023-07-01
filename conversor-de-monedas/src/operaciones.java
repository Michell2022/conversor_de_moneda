import javax.swing.JOptionPane;

public class operaciones {
    
   public static class OperacionesIniciar {
	   
    	public void ejecutar() {
    		
            boolean continuar = true;

            do {
                String[] tipoConversion = {
                        "Convertir a Temperatura",
                        "Convertir a Moneda",
                };

                String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione la opción de conversión", "Menu", JOptionPane.DEFAULT_OPTION, null, tipoConversion, tipoConversion[0]);

                if (seleccion != null) {
                    switch (seleccion) {
                        case "Convertir a Moneda":
                            double cantidadDinero = Input.obtenerDinero("moneda");
                            Conversiones.conversionMoneda(cantidadDinero);
                            break;
                        case "Convertir a Temperatura":
                            double cantidadTemperatura = Input.obtenerDinero("temperatura");
                            Temperatura.conversionTemperatura(cantidadTemperatura);
                            break;
                        default:
                            System.exit(0);
                            break;
                    }
                } else {
                    System.exit(0);
                }

                int opcion = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?", "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION);
                if (opcion == JOptionPane.NO_OPTION) {
                    continuar = false;
                } else if (opcion == JOptionPane.CANCEL_OPTION) {
                	System.exit(0);
                }
            } while (continuar);

            JOptionPane.showMessageDialog(null, "Fin del programa", "Finalizado", JOptionPane.INFORMATION_MESSAGE);
    	}
    }
    
    
        
    // INICIA LA EJECUCIÓN DE MI PROGRAMA
    
    public static void main(String[] args) {
    	OperacionesIniciar iniciar = new OperacionesIniciar();
    	iniciar.ejecutar();
    }
    
}





