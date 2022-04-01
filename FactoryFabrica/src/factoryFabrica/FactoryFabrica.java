package factoryFabrica;

public class FactoryFabrica {

    public static void main(String[] args) {
        FormaFactory f = new FormaFactory();

        Bolo f1 = f.getForma(FormaFactory.Tipo.ABACAXI);
        f1.sobreoBolo();
        f1.receita();
        Bolo f2 = f.getForma(FormaFactory.Tipo.CHOCONINHO);
        f2.sobreoBolo();
        f2.receita();
        Bolo f3 = f.getForma(FormaFactory.Tipo.FLORESTA);
        f3.sobreoBolo();
        f3.receita();
        Bolo f4 = f.getForma(FormaFactory.Tipo.PRESTIGIO);
        f4.sobreoBolo();
        f4.receita();

    }
}
