package model;

public class Carro extends Veiculo {

    private int rodas = 4;
    private double peso = 1000;

    @Override
    public int getRodas() {
        return rodas;
    }

    @Override
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
