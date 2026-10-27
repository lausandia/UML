public class Proyector extends Equipo {
    private int lumenes;

    public Proyector(String codigo, String marca, int lumenes) {
        super(codigo, marca);
        this.lumenes = lumenes;
    }

    public int getLumenes() {
        return lumenes;
    }

    @Override
    public double getMultaPorDia() {
        return 20000;
    }

    @Override
    public String getTipoEquipo() {
        return "Proyector";
    }
}