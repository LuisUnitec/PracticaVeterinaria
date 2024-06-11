import java.util.Scanner;

public class Perro extends Mascota {
    private String raza;

    public void  LeerDatos(){
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea el nombre de el perro");
        setNombre(s.nextLine());
        setTipo("Perro");
        System.out.println("Teclea la raza de el perro");
        raza = s.nextLine();
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
