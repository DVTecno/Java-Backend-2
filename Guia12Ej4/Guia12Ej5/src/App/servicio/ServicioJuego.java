package App.servicio;
import App.entidades.Juego;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ServicioJuego {

    private static int countJuego;
    private static Scanner leer;
    List<Juego> juegos;

    public ServicioJuego() {
        leer = new Scanner(System.in).useDelimiter("\n");
        generarNumero();
        this.juegos = new ArrayList<>();
        countJuego = 1;
    }

    public int generarNumero() {
        Random ran = new Random();
        return ran.nextInt(1, 500) + 1;
    }

    public void menu() {
        boolean salir = true;
        do {
            try {
                System.out.println("""
                               ********BIENVENIDO********
                           1. Iniciar Juego
                           2. Estaditicas del Juego
                           3. Salir
                           
                           Ingrese una opcion: 
                           """);
                switch (leer.nextInt()) {
                    case 1:
                        IniciarJuego();
                        break;
                    case 2:
                    try {
                        mostrarEstadistica();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                    case 3:
                        System.out.println("Gracias por participar.");
                        salir = false;
                        break;
                    default:
                        throw new AssertionError("El numero ingresado no es el esperado");
                }
            } catch (AssertionError e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException ex) {
                System.out.println(" Se espera un numero");
                leer.next(); // limpia el bufer del caracter insertado por error de esa manera se puede evitar el bucle infinito y tomar el nuevo valor correcto
            }

        } while (salir);

    }

    private void IniciarJuego() {
        Juego juego = new Juego();
        //ingresar datos
        juego.setNumeroAdinar(generarNumero());
        //logica del juego
        boolean terminado = false;
        System.out.println("Numero a encontrar: " + juego.getNumeroAdinar());// test
        do {
            juego.setCountIntento(juego.getCountIntento() + 1);
            juego.setNumerojugador(ingresarDatos());
            if (juego.getNumeroAdinar() == juego.getNumerojugador()) {
                System.out.println("Ingresaste: " + juego.getNumerojugador());
                System.out.println("Ganaste!. " + juego.getNumeroAdinar());
                juego.setCountIntento(juego.getCountIntento());
                juego.setEncontrado(true);
                juegos.add(juego);
                terminado = true;
            } else if (juego.getNumeroAdinar() < juego.getNumerojugador()) {
                System.out.println("Intenta con un numero mas chico.");
            } else if (juego.getNumeroAdinar() > juego.getNumerojugador()) {
                System.out.println("Intenta con un numero mas grande.");
            }
        } while (!terminado);

        //regresar al menu
    }

    private void mostrarEstadistica() throws ArrayIndexOutOfBoundsException {
        System.out.println("===================================================");
        if (juegos.isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("La lista esta vacia");
        }

        for (Juego juego : juegos) {
            System.out.println("Estadisticas del juego: ");
            System.out.println("Juego " + countJuego);
            System.out.println("Intento realizados durante el Juego: " + juego.getCountIntento());
            System.out.println("Numero a encontrar: " + juego.getNumeroAdinar());
            countJuego++;
            if (juego.isEncontrado()) {
                System.out.println("Numero encontrado!.");
            } else {
                System.out.println("Numero no encontrado, intenta nuevamente.");
            }
            System.out.println("===================================================");
        }
    }

    private int ingresarDatos() {
        int numero;
        System.out.print("Ingrese el numero: ");
        do {
            try {
                numero = leer.nextInt();
                if (numero < 1 || numero > 500) {
                    throw new IllegalArgumentException("El numero debe estar entre 1 y 500.");
                }
            } catch (InputMismatchException e) {
                System.out.print("Debe ingresar un numero entero: ");
                numero = -1;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                numero = -1;
            }

        } while (numero == -1);
        return numero;
    }
}
