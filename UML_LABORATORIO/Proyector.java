// Proyector.java
public class Proyector extends Equipo {
    private int lúmenes;

    public Proyector(String codigo, String marca, int lúmenes) {
        super(codigo, marca);
        this.lúmenes = lúmenes;
    }

    @Override
    public double getMultaPorDia() {
        return 20000.0;
    }

    @Override
    public String getTipoEquipo() {
        return "Proyector";
    }
}