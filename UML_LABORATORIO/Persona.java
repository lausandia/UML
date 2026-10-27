public abstract class Persona {
    private String documento;
    private String nombre;

    public Persona(String documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract int getDiasMaximosPrestamo();
    public abstract int getMaxEquiposPermitidos();
    public abstract String getTipo();
}

