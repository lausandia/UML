// Docente.java
public class Docente extends Persona {
    private String dependencia;

    public Docente(String documento, String nombre, String dependencia) {
        super(documento, nombre);
        this.dependencia = dependencia;
    }

    @Override
    public int getDiasMaximosPrestamo() {
        return 10;
    }

    @Override
    public int getMaxEquiposPermitidos() {
        return 3;
    }

    @Override
    public String getTipo() {
        return "Docente";
    }
}