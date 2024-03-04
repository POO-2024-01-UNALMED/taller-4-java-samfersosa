package classroom;

public class Persona {
    private long cedula;
    private String nombre;

    public Persona() {
        this(0L, "");
    }

    public Persona(String nombre) {
        this(1L, nombre);
    }

    public Persona(long cedula) {
        this(cedula, "");
    }

    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }
}
