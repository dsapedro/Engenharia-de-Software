
package testadecorator;

public class LeiteCondensado extends BaseDecorator{
    public LeiteCondensado(Adicional c) {
        super(c);
    }
    
    @Override
    public String getDescricao() {
        return super.getDescricao() +", leite condensado";
        }
    @Override
    public double custo() {
        return super.custo() +1.5;
        }
}
