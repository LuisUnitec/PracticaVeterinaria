import java.util.Scanner;

public class Gato extends Mascota {
    private boolean estaEsterilizado;

    public void leerDatos(){
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea el nombre");
        setNombre(s.nextLine());
        System.out.println("Teclea el número de indentificación");
        setNoIdentificacion(s.nextLine());
        setTipo("Gato");
        System.out.println("¿Está esterilizado? true/false");
        estaEsterilizado = s.nextBoolean();
    }

    public String toString() {
        return getTipo() + " - Nombre: " + getNombre() + " - Esterilizado: " + estaEsterilizado;
    }

    public boolean isEstaEsterilizado() {
        return estaEsterilizado;
    }

    public void setEstaEsterilizado(boolean estaEsterilizado) {
        this.estaEsterilizado = estaEsterilizado;
    }
}
