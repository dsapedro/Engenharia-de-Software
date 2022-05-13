package testadecorator2;

public class LeiteCondensado extends BaseDecorator {

    public LeiteCondensado(Adicional c) {
        super(c);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", leite condensado";
    }

    @Override
    public double custo() {
        double valor = 0;
        if (super.getTamanho() == "P") {
            valor = super.custo() + 1.5;
        } else if (super.getTamanho() == "M") {
            valor = super.custo() + 2.5;
        } else if (super.getTamanho() == "G") {
            valor = super.custo() + 3;
        }
        return valor;
    }
}

