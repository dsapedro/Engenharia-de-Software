package testadecorator;

public class Acai implements Adicional {

    @Override
    public String getDescricao() {
        return "Creme de açai";
    }

    @Override
    public double custo() {
        return 10;
    }

}
