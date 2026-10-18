
import java.time.LocalDate;
import java.time.Period;

public class FrecuenciasCardiacas {
    private String nombre;
    private String apellido;
    private int mesNacimiento;
    private int diaNacimiento;
    private int anioNacimiento;

    public FrecuenciasCardiacas(String nombre, String apellido,
                                int mesNacimiento, int diaNacimiento,
                                int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.anioNacimiento = anioNacimiento;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerMesNacimiento(int mes) {
        mesNacimiento = mes;
    }

    public int obtenerMesNacimiento() {
        return mesNacimiento;
    }

    public void establecerDiaNacimiento(int dia) {
        diaNacimiento = dia;
    }

    public int obtenerDiaNacimiento() {
        return diaNacimiento;
    }

    public void establecerAnioNacimiento(int anio) {
        anioNacimiento = anio;
    }

    public int obtenerAnioNacimiento() {
        return anioNacimiento;
    }

    public int calcularEdad() {
        LocalDate nacimiento = LocalDate.of(
                anioNacimiento, mesNacimiento, diaNacimiento
        );
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    public int calcularFrecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    public double calcularFrecuenciaObjetivoMinima() {
        return calcularFrecuenciaMaxima() * 0.50;
    }

    public double calcularFrecuenciaObjetivoMaxima() {
        return calcularFrecuenciaMaxima() * 0.85;
    }
}
