import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {

    private static Logger logger = configurarLogs();

    /* Inicio del programa */
    public static void main(String[] args) {

        // Descomentar una vez que se haya creado la clase Dueño
        Dueño dueñoRegistrado = new Dueño();

        int opcion;
        do {
            opcion = imprimirMenu();
            switch(opcion) {
                case 1:
                    dueñoRegistrado = new Dueño();
                    dueñoRegistrado.leerDatos();
                    break;
                case 2:
                    imprimirMenuMascotas();
                    break;
                case 3:
                case 4:
                default:
                    logger.log(Level.INFO, "Usuario seleccionó opción incorrecta: " + opcion);
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 4);
    }

    /* Menú de opciones para el usuario */
    public static int imprimirMenu() {
        Scanner s = new Scanner(System.in);

        System.out.println("Sistema de control de citas - El Borrego Viudo");
        System.out.println("Elija una opción:");
        System.out.println("1.- Registrar nuevo dueño");
        System.out.println("2.- Registrar mascota");
        System.out.println("3.- Registrar registrar cita");
        System.out.println("4.- Salir");

        return s.nextInt();
    }

    public static void imprimirMenuMascotas() {
        Scanner s = new Scanner(System.in);

        System.out.println("Qué tipo de mascota vas a reistrar?");
        System.out.println("1.- Gato");
        System.out.println("2.- Perro");
        System.out.println("3.- Tortuga");
        int opcion = s.nextInt();

        if(opcion == 1) {
            Gato g = new Gato();
            System.out.println("Cuál es el nombre del gato?");
            s.nextLine();
            g.setNombre(s.nextLine());

            // Registrar el evento que acaba de ocurrir
            // que es el registro de una nueva mascota de tipo gato
            logger.log(Level.INFO, "Se registró un nuevo gato: "+ g.getNombre());
        }
    }

    /* Configuración de los logs */
    private static Logger configurarLogs() {

        Logger logger = null;
        try {
            logger = Logger.getLogger(Main.class.getName());
            logger.setUseParentHandlers(false);
            FileHandler fh = new FileHandler("veterinaria.log");
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
        } catch (Exception ignored) { }
        return logger;
    }
}