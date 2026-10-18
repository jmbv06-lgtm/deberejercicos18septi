
import javax.swing.JOptionPane;
import java.time.DateTimeException;
import java.time.LocalDate;

public class PruebaFrecuenciasCardiacas {
    public static void main(String[] args) {
        try {
            String nombre = JOptionPane.showInputDialog(
                    "Ingrese su nombre:"
            );

            String apellido = JOptionPane.showInputDialog(
                    "Ingrese su apellido:"
            );

            int mes = Integer.parseInt(
                    JOptionPane.showInputDialog("Mes de nacimiento:")
            );

            int dia = Integer.parseInt(
                    JOptionPane.showInputDialog("Dia de nacimiento:")
            );

            int anio = Integer.parseInt(
                    JOptionPane.showInputDialog("Anio de nacimiento:")
            );

            LocalDate.of(anio, mes, dia);

            FrecuenciasCardiacas persona = new FrecuenciasCardiacas(
                    nombre, apellido, mes, dia, anio
            );

            String resultado = "PERFIL CARDIACO\n\n";
            resultado += "Nombre: " + persona.obtenerNombre()
                    + " " + persona.obtenerApellido() + "\n";
            resultado += "Edad: " + persona.calcularEdad() + " anios\n";
            resultado += "Frecuencia cardiaca maxima: "
                    + persona.calcularFrecuenciaMaxima() + " lpm\n";
            resultado += "Rango objetivo: "
                    + String.format("%.1f", persona.calcularFrecuenciaObjetivoMinima())
                    + " - "
                    + String.format("%.1f", persona.calcularFrecuenciaObjetivoMaxima())
                    + " lpm";

            JOptionPane.showMessageDialog(null, resultado);

        } catch (NumberFormatException | DateTimeException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: ingrese numeros validos y una fecha correcta."
            );
        }
    }
}
