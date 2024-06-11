import java.util.Scanner;

public class Perro extends Mascota {
    private String raza;

    public void leerDatos(){
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea el nombre");
        setNombre(s.nextLine());
        System.out.println("Teclea el número de indentificación");
        setNoIdentificacion(s.nextLine());
        setTipo("Perro");
        System.out.println("Teclea la raza del perro");
        raza = s.nextLine();
    }

    public String toString() {
        return getTipo() + " - Nombre: " + getNombre() + " - Raza: " + raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
