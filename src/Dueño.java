import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dueño {
    private String nombre;
    private int edad;
    private String telefono;
    private String direccion;

    private List<Mascota> ListaMascotas = new ArrayList<>();

    public List<Mascota> getListaMascotas() {
        return ListaMascotas;
    }

    public void setListaMascotas(List<Mascota> listaMascotas) {
        ListaMascotas = listaMascotas;
    }

    public void leerDatos()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea el nombre del dueño");
        nombre = s.nextLine();
        System.out.println("Teclea el telefono del dueño");
        telefono = s.nextLine();
        System.out.println("Teclea la dirección del dueño");
        direccion = s.nextLine();
        System.out.println("Teclea la edad del dueño");
        edad = s.nextInt();
    }

        //toString especifica  el formato de impresion de un objeto

    public String toString(){
        return "Nombre: " + nombre + "\n"
                + "Direccion: " + direccion + "\n"
                + "Mascotas: " + ListaMascotas + "\n"
                + ListaMascotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
