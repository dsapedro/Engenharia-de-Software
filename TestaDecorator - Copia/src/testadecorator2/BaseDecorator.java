package testadecorator2;

public class BaseDecorator implements Adicional {

    Adicional wrapper;

    public BaseDecorator(Adicional c) {
        this.wrapper = c;
    }

    @Override
    public String getDescricao() {
        return wrapper.getDescricao();
    }

    @Override
    public double custo() {
        return wrapper.custo();
    }

    @Override
    public String getTamanho() {
        return wrapper.getTamanho();
    }

    @Override
    public void setTamanho(String tamanho) {
        }

}
