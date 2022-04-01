package factoryFabrica;

public class Abacaxi extends Bolo {

    public Abacaxi() {
        setNome("Abacaxi");
        setTipo("Sem ovo");
        setPreco(30);
    }

    @Override
    public void receita() {
        System.out.println("Sobre a receita!");
    }
}
