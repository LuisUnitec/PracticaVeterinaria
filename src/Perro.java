import java.util.Scanner;

public class Perro extends Mascota {
    private String raza;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void leerDatos() {
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea el nombre del perro");
        setNombre(s.nextLine());
        System.out.println("Teclea el no de Identificación");
        setNoIdentificacion(s.nextLine());
        setTipo("Perro");
        System.out.println("¿Cuál es su raza?");
        setRaza(s.nextLine());

    }

    ;

    public String toString() {
        return getTipo() + " - Nombre: " + getNombre() + " Raza: " + raza;
    }
}