public class Cargador {
    private String serial;
    private int vatios;

    public Cargador(String serial, int vatios) {
        this.serial = serial;
        this.vatios = vatios;
    }

    public String getSerial() {
        return serial;
    }

    public int getVatios() {
        return vatios;
    }
}