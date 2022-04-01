package factoryFabrica;

public class Prestigio extends Bolo {

    public Prestigio() {
        setNome("Prestigio");
        setTipo("Com ovo");
        setPreco(40);
    }

    @Override
    public void receita() {
        System.out.println("Sobre a receita!");
    }
}
