package factoryFabrica;

public class Choconinho extends Bolo {

    public Choconinho() {
        setNome("Choconinho");
        setTipo("Sem ovo");
        setPreco(35);
    }
    @Override
    public void receita() {
        System.out.println("Sobre a receita!");
    }
}
