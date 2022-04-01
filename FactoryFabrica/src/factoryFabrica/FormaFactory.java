package factoryFabrica;

public class FormaFactory {

    public enum Tipo {
        ABACAXI, CHOCONINHO, FLORESTA, PRESTIGIO;
    }

    public Bolo getForma(Tipo t) {
        Bolo f = null;
        switch (t) {
            case ABACAXI:
                f = new Abacaxi();
                break;
            case CHOCONINHO:
                f = new Choconinho();
                break;
            case FLORESTA:
                f = new FlorestaNegra();
                break;
            case PRESTIGIO:
                f = new Prestigio();
        }
        return f;
    }
}
