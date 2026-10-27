// Equipo.java
public abstract class Equipo {
    private String codigo;
    private String marca;
    private boolean disponible;

    public Equipo(String codigo, String marca) {
        this.codigo = codigo;
        this.marca = marca;
        this.disponible = true; // todo euquipo nace disponible 
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public abstract double getMultaPorDia();
    public abstract String getTipoEquipo();
}