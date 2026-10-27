public class Tablet extends Equipo {

    public Tablet(String codigo, String marca) {
        super(codigo, marca);
    }

    @Override
    public double getMultaPorDia() {
        return 8000;
    }

    @Override
    public String getTipoEquipo() {
        return "Tablet";
    }
}