// Portatil.java
public class Portatil extends Equipo {
    private int memoriaRamGb;
    private Cargador cargador; 

    public Portatil(String codigo, String marca, int memoriaRamGb, String serialCargador, int vatiosCargador) {
        super(codigo, marca);
        this.memoriaRamGb = memoriaRamGb;
        this.cargador = new Cargador(serialCargador, vatiosCargador); //se crea junto con el portatil
    }

    @Override
    public double getMultaPorDia() {
        return 15000.0;
    }

    @Override
    public String getTipoEquipo() {
        return "Portátil";
    }

    public Cargador getCargador() {
        return cargador;
    }
}