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
        Dueño dueñoRegistrado = null;

        int opcion;
        do {
            opcion = imprimirMenu();
            switch(opcion) {
                case 1:
                    dueñoRegistrado = new Dueño();
                    dueñoRegistrado.leerDatos();
                    break;


                case 2:
                    Scanner s = new Scanner(System.in);
                    System.out.println("Que tipo de mascota quieres? 1.- Gato 2.- Perro");
                    int tipoElegido = s.nextInt();
                        //Generar una metrica
                    logger.log(Level.INFO, "Mascota registrada: " + tipoElegido);
                    if (tipoElegido == 1) {

                    //crear una mascota, leer los datos y asignar al dueño
                    Gato g = new Gato();
                    g.LeerDatos();

                    dueñoRegistrado.getListaMascotas().add(g);
                    }else if (tipoElegido == 2) {
                        Perro p = new Perro();
                        p.LeerDatos();
                        dueñoRegistrado.getListaMascotas().add(p);
                    } else {
                        logger.log(Level.WARNING, "Opcion invalidad");
                        System.out.println("Seleccione una opcion valida ");
                    }
                    break;

                case 3:
                case 4:
                    System.out.println("---------------------------");
                    System.out.println(dueñoRegistrado);
                case 5:
                    System.out.println("Gracias vuelva pronto");
                    break;
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
        System.out.println("4.- Imprimir Datos");
        System.out.println("5.- Salir");

        return s.nextInt();
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