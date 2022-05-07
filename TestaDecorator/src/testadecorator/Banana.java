
package testadecorator;

public class Banana extends BaseDecorator{
    public Banana(Adicional c) {
        super(c);
    }
    
    @Override
    public String getDescricao() {
        return super.getDescricao() +", banana";
        }
    @Override
    public double custo() {
        return super.custo() +1;
        }
}
