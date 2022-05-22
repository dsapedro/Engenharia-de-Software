package pinos;

public class TestaPinos {

    public static void main(String[] args) {
        BuracoRedondo buraco = new BuracoRedondo(50);
        PinoQuadrado pinoQ = new PinoQuadrado(10);
        System.out.println("Largura do Pino Quadrado: " + pinoQ.getLargura());
        System.out.println("O seu quadrado equivale a: " + pinoQ.getQuadrado());
        PinoQuadradoAdapter pinoR = new PinoQuadradoAdapter(pinoQ);
        System.out.println("\nRaio do pino redondo: " + pinoR.getRaio());
        System.out.println("\nO pino redondo encaixa? " + buraco.Encaixa(pinoR));

    }

}
