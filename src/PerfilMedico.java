
import java.time.LocalDate;
import java.time.Period;

public class PerfilMedico {
    private String nombre;
    private String apellido;
    private String sexo;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private double altura;
    private double peso;

    public PerfilMedico(String nombre, String apellido, String sexo,
                        int diaNacimiento, int mesNacimiento,
                        int anioNacimiento, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.altura = altura;
        this.peso = peso;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }

    public String obtenerSexo() {
        return sexo;
    }

    public void establecerSexo(String sexo) {
        this.sexo = sexo;
    }

    public int obtenerDiaNacimiento() {
        return diaNacimiento;
    }

    public void establecerDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int obtenerMesNacimiento() {
        return mesNacimiento;
    }

    public void establecerMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int obtenerAnioNacimiento() {
        return anioNacimiento;
    }

    public void establecerAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public double obtenerAltura() {
        return altura;
    }

    public void establecerAltura(double altura) {
        this.altura = altura;
    }

    public double obtenerPeso() {
        return peso;
    }

    public void establecerPeso(double peso) {
        this.peso = peso;
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

    public double calcularIMC() {
        double alturaMetros = altura / 100.0;
        return peso / (alturaMetros * alturaMetros);
    }

    public String obtenerCategoriaIMC() {
        double imc = calcularIMC();

        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc < 25.0) {
            return "Normal";
        } else if (imc < 30.0) {
            return "Sobrepeso";
        } else {
            return "Obeso";
        }
    }
}
