package factoryFabrica;

public class FactoryFabrica {

    public static void main(String[] args) {
        FormaFactory f = new FormaFactory();

        Bolo f1 = f.getForma(FormaFactory.Tipo.ABACAXI);
        f1.sobreoBolo();
        Bolo f2 = f.getForma(FormaFactory.Tipo.CHOCONINHO);
        f2.sobreoBolo();
        Bolo f3 = f.getForma(FormaFactory.Tipo.FLORESTA);
        f3.sobreoBolo();
        Bolo f4 = f.getForma(FormaFactory.Tipo.PRESTIGIO);
        f4.sobreoBolo();

    }
}
