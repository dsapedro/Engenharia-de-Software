package testadecorator2;

public class Acai implements Adicional {
    String tamanho;
    
    @Override
    public String getDescricao() {
        return "Creme de açai";
    }

    @Override
    public double custo() {
        return 10;
    }

    @Override
    public String getTamanho() {
        return this.tamanho;
        }

    @Override
    public String setTamanho() {
        
        }

}
