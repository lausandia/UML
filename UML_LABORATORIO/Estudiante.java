public class Estudiante extends Persona {
    private String programaAcademico;

    public Estudiante(String documento, String nombre, String programaAcademico) {
        super(documento, nombre);
        this.programaAcademico = programaAcademico;
    }

    @Override
    public int getDiasMaximosPrestamo() {
        return 3;
    }

    @Override
    public int getMaxEquiposPermitidos() {
        return 1;
    }

    @Override
    public String getTipo() {
        return "Estudiante";
    }
}