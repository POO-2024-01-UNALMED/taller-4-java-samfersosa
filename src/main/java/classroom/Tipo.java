package classroom;

public enum Tipo {
    FUNDAMENTACION(20, "Fundamentación"),
    DISCIPLINAR(21, "Disciplinar"),
    ELECTIVA(22, "Electiva");

    private final int codigo;
    private final String descripcion;

    Tipo(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Tipo: " + descripcion + " (Código: " + codigo + ")";
    }
}
