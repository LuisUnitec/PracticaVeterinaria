import java.util.Scanner;

public class Gato extends Mascota {
    private boolean estaEsterilizado;

    public void LeerDatos(){
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea el nombre de el Gato: ");
        setNombre(s.nextLine());
        System.out.println("Teclea el no de identificacion de el Gato: ");
        setNoIdentificacion(s.nextLine());
        setTipo ("Gato");
        System.out.println("Esta Esterilizado?  true/false");
        setEstaEsterilizado(s.nextBoolean());

    }


    public String toString (){
        return getTipo() + " - Nombre:  " + getNombre() + " esterilizado: " + estaEsterilizado;
    }
    public boolean isEstaEsterilizado() {
        return estaEsterilizado;
    }

    public void setEstaEsterilizado(boolean estaEsterilizado) {
        this.estaEsterilizado = estaEsterilizado;
    }
}
