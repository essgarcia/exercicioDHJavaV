import model.*;

public class Main {
    public static void main(String[] args) {
        Corrida corridaMaluca = new Corrida("Corrida Maluca", 2.5, 7000, 3);
        ViaturaCarro viaturaCarro = new ViaturaCarro();
        ViaturaMoto viaturaMoto = new ViaturaMoto();

        Carro gol = new Carro();
        gol.setPlaca("GOL 1234");
        gol.setAceleracao(70);
        gol.setVelocidade(80);
        gol.setAnguloGiro(20);

        Carro ferrari = new Carro();
        ferrari.setPlaca("FER 0001");
        ferrari.setAceleracao(100);
        ferrari.setVelocidade(200);
        ferrari.setAnguloGiro(30);

        Carro uninhoPedreiro = new Carro();
        uninhoPedreiro.setPlaca("UNO 7890");
        uninhoPedreiro.setAceleracao(100);
        uninhoPedreiro.setVelocidade(200);
        uninhoPedreiro.setAnguloGiro(40);

        corridaMaluca.addCarro(gol);
        corridaMaluca.addCarro(ferrari);
        corridaMaluca.addCarro(uninhoPedreiro);
        corridaMaluca.todosVeiculos();

        corridaMaluca.delVeiculoPorPlaca("GOL 1234");
        System.out.println("\n");
        corridaMaluca.todosVeiculos();

        System.out.println("\n");
        corridaMaluca.socorrerCarro("FER 0001");
        corridaMaluca.delVeiculoPorPlaca("FER 0001");

        System.out.println("\n");
        corridaMaluca.todosVeiculos();

        Veiculo veiculo = corridaMaluca.ganhadorCorrida();
        System.out.println("\n O vencedor da Corrida Maluca é " + veiculo.getPlaca() + " e leva o premio de " + corridaMaluca.getPremio());

    }
}
