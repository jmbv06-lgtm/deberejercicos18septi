public class Factura {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String numeroPieza, String descripcionPieza,
                   int cantidad, double precioPorArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        establecerCantidad(cantidad);
        establecerPrecioPorArticulo(precioPorArticulo);
    }

    public void establecerNumeroPieza(String numero) {
        numeroPieza = numero;
    }

    public String obtenerNumeroPieza() {
        return numeroPieza;
    }

    public void establecerDescripcionPieza(String descripcion) {
        descripcionPieza = descripcion;
    }

    public String obtenerDescripcionPieza() {
        return descripcionPieza;
    }

    public void establecerCantidad(int cantidad) {
        this.cantidad = cantidad > 0 ? cantidad : 0;
    }
