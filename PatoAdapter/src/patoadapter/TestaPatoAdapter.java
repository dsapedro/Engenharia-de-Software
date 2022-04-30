package patoadapter;

public class TestaPatoAdapter {

    public static void main(String[] args) {
        PatoReal patoR = new PatoReal();
        System.out.println("O pato diz...");
        patoR.grasnar();
        patoR.voar();
        PeruSelvagem peruS = new PeruSelvagem();
        System.out.println("O peru diz...");
        peruS.gorgolejar();
        peruS.voar();

        PeruAdapter peruA = new PeruAdapter(peruS);
        testaPato(peruA);
    }

    public static void testaPato(Pato p) {
        p.grasnar();
        p.voar();
    }
}
