import java.util.Scanner;

public class Perro extends Mascota {
    private String raza;

    public void leerDatos() {
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea el nombre del perro");
        setNombre(s.nextLine());
        setTipo("Perro");
        System.out.println("Teclea la raza del perro");
        raza = s.nextLine();
    }

    public String toString(){
        return getTipo() + "- Nombre: " + getNombre() + " raza: " + raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
