/*  
 * 
 * Ejercicio: Pedir la fecha y verificar si el dia, mes y año son validos
 * Al final mostrar la fecha completa.
 * 
 * 
 */

// Importamos la clase JOptionPane del paquete javax.swing para usarla en la entrada/salida.
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        // Declaramos tres variables para almacenar el día, mes y año de la fecha.
        int dia, mes, year;
        
        // Pedimos al usuario que ingrese el día, mes y año, y convertimos las entradas en enteros.
        dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su día"));
        mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el número del mes"));
        year = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su año"));

        // Verificamos si el día ingresado es válido (menos o igual a 30).
        if (dia > 30) {
            JOptionPane.showConfirmDialog(null, "Día inválido");
        } else {
            JOptionPane.showConfirmDialog(null, "Día válido");
        }

        // Verificamos si el mes ingresado es válido (menos o igual a 12).
        if (mes > 12) {
            JOptionPane.showConfirmDialog(null, "Mes inválido");
        } else {
            JOptionPane.showConfirmDialog(null, "Mes válido");
        }

        // Verificamos si el año ingresado es válido (menos o igual a 2023).
        if (year > 2023) {
            JOptionPane.showConfirmDialog(null, "Año inválido");
        } else {
            JOptionPane.showConfirmDialog(null, "Año válido");
        }

        // Mostramos la fecha completa al usuario, concatenando las variables.
        JOptionPane.showConfirmDialog(null, "Fecha: " + dia + "/" + mes + "/" + year);
    }
}
