package patoadapter;

public class PeruAdapter implements Pato {

    Peru peru;

    public PeruAdapter(Peru p) {
        this.peru = p;
    }

    @Override
    public void voar() {
        /*Como o peru voa curto, chama o método várias vezes*/
        for (int i = 0; i < 5; i++) {
            peru.voar();
        }
    }

    @Override
    public void grasnar() {
        peru.gorgolejar();
    }

}
