
import java.util.Scanner;
import java.time.LocalDate;
import java.time.DateTimeException;

public class PruebaPerfilMedico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese su nombre: ");
            String nombre = entrada.nextLine();

            System.out.print("Ingrese su apellido: ");
            String apellido = entrada.nextLine();

            System.out.print("Ingrese su sexo: ");
            String sexo = entrada.nextLine();

            System.out.print("Ingrese el dia de nacimiento: ");
            int dia = entrada.nextInt();

            System.out.print("Ingrese el mes de nacimiento: ");
            int mes = entrada.nextInt();

            System.out.print("Ingrese el anio de nacimiento: ");
            int anio = entrada.nextInt();

            LocalDate nacimiento = LocalDate.of(anio, mes, dia);

            if (nacimiento.isAfter(LocalDate.now())) {
                System.out.println(
                        "Error: la fecha de nacimiento no puede ser futura."
                );
                return;
            }

            System.out.print("Ingrese su altura en centimetros: ");
            double altura = entrada.nextDouble();

            System.out.print("Ingrese su peso en kilogramos: ");
            double peso = entrada.nextDouble();

            if (altura <= 0 || peso <= 0) {
                System.out.println(
                        "Error: la altura y el peso deben ser positivos."
                );
                return;
            }

            PerfilMedico persona = new PerfilMedico(
                    nombre, apellido, sexo,
                    dia, mes, anio, altura, peso
            );

            System.out.println("\n========== PERFIL MEDICO ==========");
            System.out.println("Nombre: " + persona.obtenerNombre());
            System.out.println("Apellido: " + persona.obtenerApellido());
            System.out.println("Sexo: " + persona.obtenerSexo());

            System.out.println("Fecha de nacimiento: "
                    + persona.obtenerDiaNacimiento() + "/"
                    + persona.obtenerMesNacimiento() + "/"
                    + persona.obtenerAnioNacimiento());

            System.out.println("Altura: "
                    + persona.obtenerAltura() + " cm");

            System.out.println("Peso: "
                    + persona.obtenerPeso() + " kg");

            System.out.println("Edad: "
                    + persona.calcularEdad() + " anios");

            System.out.printf("IMC: %.2f%n", persona.calcularIMC());

            System.out.println("Categoria del IMC: "
                    + persona.obtenerCategoriaIMC());

            System.out.println("Frecuencia cardiaca maxima: "
                    + persona.calcularFrecuenciaMaxima() + " lpm");

            System.out.printf(
                    "Rango de frecuencia cardiaca esperada: %.1f - %.1f lpm%n",
                    persona.calcularFrecuenciaObjetivoMinima(),
                    persona.calcularFrecuenciaObjetivoMaxima()
            );

            System.out.println("\n====== TABLA DE VALORES DEL IMC ======");
            System.out.println("Bajo peso: menos de 18.5");
            System.out.println("Normal: entre 18.5 y 24.9");
            System.out.println("Sobrepeso: entre 25 y 29.9");
            System.out.println("Obeso: 30 o mas");

        } catch (DateTimeException e) {
            System.out.println(
                    "Error: ingrese una fecha de nacimiento valida."
            );
        } catch (java.util.InputMismatchException e) {
            System.out.println(
                    "Error: ingrese numeros validos para los datos numericos."
            );
        } finally {
            entrada.close();
        }
    }
}
