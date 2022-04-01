package factoryFabrica;

public class FlorestaNegra extends Bolo {

    public FlorestaNegra() {
        setNome("Floresta negra");
        setTipo("Com ovo");
        setPreco(44);
    }

    @Override
    public void receita() {
        System.out.println("Sobre a receita!");
    }
}
