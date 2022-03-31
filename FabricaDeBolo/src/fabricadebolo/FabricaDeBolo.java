package fabricadebolo;

public class FabricaDeBolo {

    public static void main(String[] args) {
        FlorestaNegra f = new FlorestaNegra();
        Abacaxi a = new Abacaxi();
        Choconinho c = new Choconinho();
        Prestigio p = new Prestigio();
        f.sobreoBolo();
        f.receita();
        a.sobreoBolo();
        a.receita();
        c.sobreoBolo();
        c.receita();
        p.sobreoBolo();
        p.receita();
    }

}
