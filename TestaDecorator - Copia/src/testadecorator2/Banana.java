package testadecorator2;

public class Banana extends BaseDecorator {

    public Banana(Adicional c) {
        super(c);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", banana";
    }

    @Override
    public double custo() {
        double valor = 0;
        if (super.getTamanho() == "P") {
            valor = super.custo() + 1;
        } else if (super.getTamanho() == "M") {
            valor = super.custo() + 1.5;
        } else if (super.getTamanho() == "G") {
            valor = super.custo() + 2;
        }
        return valor;
    }
}
