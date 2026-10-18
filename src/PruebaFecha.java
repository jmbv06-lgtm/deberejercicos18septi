
import java.util.Scanner;

public class PruebaFecha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el mes: ");
        int mes = entrada.nextInt();

        System.out.print("Ingrese el dia: ");
        int dia = entrada.nextInt();

        System.out.print("Ingrese el anio: ");
        int anio = entrada.nextInt();

        Fecha fecha = new Fecha(mes, dia, anio);

        System.out.print("La fecha es: ");
        fecha.mostrarFecha();

        entrada.close();
    }
}
