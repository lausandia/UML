// Prestamo.java
import java.util.List;

public class Prestamo {
    private static int contadorId = 1;
    private int numeroPrestamo;
    private Persona persona;
    private List<Equipo> equipos;
    private boolean activo;

    public Prestamo(Persona persona, List<Equipo> equipos) {
        if (equipos == null || equipos.isEmpty()) {
            throw new IllegalArgumentException("Un préstamo sin equipos no es válido.");
        }
        this.numeroPrestamo = contadorId++;
        this.persona = persona;
        this.equipos = equipos;
        this.activo = true;
    }

    public int getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public Persona getPersona() {
        return persona;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}