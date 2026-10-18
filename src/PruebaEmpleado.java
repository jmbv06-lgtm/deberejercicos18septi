
import javax.swing.JOptionPane;

public class PruebaEmpleado {
    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre del primer empleado:");
        String apellido1 = JOptionPane.showInputDialog("Ingrese el apellido del primer empleado:");
        double salario1 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el salario mensual del primer empleado:")
        );

        String nombre2 = JOptionPane.showInputDialog("Ingrese el nombre del segundo empleado:");
        String apellido2 = JOptionPane.showInputDialog("Ingrese el apellido del segundo empleado:");
        double salario2 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el salario mensual del segundo empleado:")
        );

        Empleado empleado1 = new Empleado(nombre1, apellido1, salario1);
        Empleado empleado2 = new Empleado(nombre2, apellido2, salario2);

        String resultado = "--- SALARIOS ANUALES ---\n";

        resultado += empleado1.obtenerNombre() + " " + empleado1.obtenerApellido()
                + ": $" + (empleado1.obtenerSalarioMensual() * 12) + "\n";

        resultado += empleado2.obtenerNombre() + " " + empleado2.obtenerApellido()
                + ": $" + (empleado2.obtenerSalarioMensual() * 12) + "\n";

        empleado1.establecerSalarioMensual(
                empleado1.obtenerSalarioMensual() * 1.10
        );

        empleado2.establecerSalarioMensual(
                empleado2.obtenerSalarioMensual() * 1.10
        );

        resultado += "\n--- SALARIOS ANUALES CON AUMENTO DEL 10% ---\n";

        resultado += empleado1.obtenerNombre() + " " + empleado1.obtenerApellido()
                + ": $" + (empleado1.obtenerSalarioMensual() * 12) + "\n";

        resultado += empleado2.obtenerNombre() + " " + empleado2.obtenerApellido()
                + ": $" + (empleado2.obtenerSalarioMensual() * 12);

        JOptionPane.showMessageDialog(null, resultado);
    }
}
