package classroom;

public enum Tipo {
    FUNDAMENTACION(20, "Fundamentación");

    private final int codigo;
    private final String descripcion;

    Tipo(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tipo: " + descripcion + " (Código: " + codigo + ")";
    }
}
