package classroom;

public class Persona {
    private final long cedula;
    private final String nombre;

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public long getCedula() {
        return cedula;
    }
}
