package model;

import java.util.ArrayList;
import java.util.List;

public class Corrida extends Veiculo{
    private String nome;
    private double distancia;
    private double premio;
    private int quantVeiculoPermitido;
    private List<Veiculo> veiculosList = new ArrayList<>();

    private ViaturaCarro viaturaCarro = new ViaturaCarro();
    private ViaturaMoto viaturaMoto = new ViaturaMoto();



    public Corrida(String nome, double distancia, double premio, int quantVeiculoPermitido) {
        this.nome = nome;
        this.distancia = distancia;
        this.premio = premio;
        this.quantVeiculoPermitido = quantVeiculoPermitido;
    }

    public void todosVeiculos(){
        System.out.println("Lista de Veiculos: ");
        for (Veiculo v : veiculosList){
            System.out.println(v.getPlaca());
        }
    }
    public void addCarro(Carro carro){
        veiculosList.add(carro);
    }

    public void addMoto(Moto moto){
        veiculosList.add(moto);
    }

    public void delVeiculo(Veiculo v){
        veiculosList.remove(v);
    }

    public void delVeiculoPorPlaca(String placa){
        for (Veiculo veiculo : veiculosList){

            if (veiculo.getPlaca().equals(placa)){
                veiculosList.remove(veiculo);
                System.out.println("Veiculo " + veiculo.getPlaca() + " deletado!");
                return;
            }
        }
        System.out.println("Placa não localizada");
    }

    public Veiculo ganhadorCorrida(){
        Veiculo ganhador = null;
        double pontuacaoAtual = 0.0;
        double pontuacaoMax = Double.MIN_VALUE;

        for (Veiculo v : veiculosList) {
            pontuacaoAtual = v.getVelocidade() * (v.getAceleracao() / 2) / (v.getAnguloGiro() * (v.getPeso() - v.getRodas() * 100));
            if (pontuacaoAtual > pontuacaoMax ){
                pontuacaoMax = pontuacaoAtual;
                ganhador = v;
            }
        }
        return ganhador;
    }

    public void socorrerCarro(String placa){
        for (Veiculo veiculo : veiculosList){

            if (veiculo.getPlaca().equals(placa)){
                viaturaCarro.socorrer((Carro) veiculo);
                //colocando esse return mata o metodo, senao ele continua normalmente.
                return;
            }
        }
        System.out.println("Placa não localizada");
    }

    public void socorrerMoto(String placa){
        for (Veiculo veiculo : veiculosList){

            if (veiculo.getPlaca().equals(placa)){
                viaturaMoto.socorrerMoto((Moto) veiculo);

            }
            System.out.println("Placa não localizada");
        }
    }

    //Getters and Setters

    public ViaturaCarro getViaturaCarro() {
        return viaturaCarro;
    }

    public void setViaturaCarro(ViaturaCarro viaturaCarro) {
        this.viaturaCarro = viaturaCarro;
    }

    public ViaturaMoto getViaturaMoto() {
        return viaturaMoto;
    }

    public void setViaturaMoto(ViaturaMoto viaturaMoto) {
        this.viaturaMoto = viaturaMoto;
    }

    public double getDistancia() {
        return distancia;
    }

    public double getPremio() {
        return premio;
    }

    public int getQuantVeiculoPermitido() {
        return quantVeiculoPermitido;
    }

    public String getNome() {
        return nome;
    }

    public List<Veiculo> getVeiculosList() {
        return veiculosList;
    }
}
