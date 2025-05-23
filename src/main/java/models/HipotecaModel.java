package models;

public class HipotecaModel {
    private int importe;
    private int capital;
    private int duracion;

    public HipotecaModel(int importe, int capital, int duracion) {
        this.importe = importe;
        this.capital = capital;
        this.duracion = duracion;
    }

    public double getImporte() {
        return importe;
    }

    public double getCapital() {
        return capital;
    }

    public int getDuracion() {
        return duracion;
    }
}
