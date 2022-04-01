package factoryFabrica;

public class FactoryFabrica {

    public static void main(String[] args) {
        BoloFactory f = new BoloFactory();

        Bolo f1 = f.getBolo(BoloFactory.Tipo.ABACAXI);
        f1.sobreoBolo();
        f1.receita();
        Bolo f2 = f.getBolo(BoloFactory.Tipo.CHOCONINHO);
        f2.sobreoBolo();
        f2.receita();
        Bolo f3 = f.getBolo(BoloFactory.Tipo.FLORESTA);
        f3.sobreoBolo();
        f3.receita();
        Bolo f4 = f.getBolo(BoloFactory.Tipo.PRESTIGIO);
        f4.sobreoBolo();
        f4.receita();

    }
}
