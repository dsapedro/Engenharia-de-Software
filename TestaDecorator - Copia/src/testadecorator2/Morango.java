
package testadecorator2;

public class Morango extends BaseDecorator{

    public Morango(Adicional c) {
        super(c);
    }
    
    @Override
    public String getDescricao() {
        return super.getDescricao() +", morango";
        }
    @Override
    public double custo() {
        return super.custo() +2;
        }
}
