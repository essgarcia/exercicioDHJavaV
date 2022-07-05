package model;

public class ViaturaMoto extends Veiculo{

    public void socorrerMoto(Moto moto){
        System.out.println("Socorrendo a moto de placa: " + moto.getPlaca());
    }
}
