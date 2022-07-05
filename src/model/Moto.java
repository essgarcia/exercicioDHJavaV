package model;

public class Moto extends Veiculo{
    public int rodas = 2;
    public double peso = 300;

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
