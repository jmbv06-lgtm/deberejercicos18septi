
import java.util.Scanner;

public class PruebaFactura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero de pieza: ");
        String numero = entrada.nextLine();

        System.out.print("Ingrese la descripcion: ");
        String descripcion = entrada.nextLine();

        System.out.print("Ingrese la cantidad: ");
        int cantidad = entrada.nextInt();

        System.out.print("Ingrese el precio por articulo: ");
        double precio = entrada.nextDouble();

        Factura factura = new Factura(numero, descripcion, cantidad, precio);

        System.out.println("\n--- DATOS DE LA FACTURA ---");
        System.out.println("Numero de pieza: " + factura.obtenerNumeroPieza());
        System.out.println("Descripcion: " + factura.obtenerDescripcionPieza());
        System.out.println("Cantidad: " + factura.obtenerCantidad());
        System.out.println("Precio por articulo: $" + factura.obtenerPrecioPorArticulo());
        System.out.println("Monto total: $" + factura.obtenerMontoFactura());

        entrada.close();
    }
}
