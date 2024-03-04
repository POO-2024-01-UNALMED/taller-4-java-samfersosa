package classroom;

public class Asignatura {
    public String nombre;
    public Tipo tipo;
    public int codigoExterno;

    public Asignatura() {
        this("Sin nombre", Tipo.FUNDAMENTACION);
    }

    public Asignatura(String nombre, Tipo tipo) {
        this(nombre, tipo, 0);
    }

    public Asignatura(int codigoExterno, Tipo tipo) {
        this("Sin nombre", tipo, codigoExterno);
    }

    public Asignatura(String nombre, Tipo tipo, int codigoExterno) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.codigoExterno = codigoExterno;
    }

    public void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }
}
