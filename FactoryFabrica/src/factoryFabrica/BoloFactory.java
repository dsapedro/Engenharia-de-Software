package factoryFabrica;

public class BoloFactory implements BoloInterface{

    public enum Tipo {
        ABACAXI, CHOCONINHO, FLORESTA, PRESTIGIO;
    }

    public Bolo getBolo(Tipo t) {
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
