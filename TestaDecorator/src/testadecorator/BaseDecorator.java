
package testadecorator;

public class BaseDecorator implements Adicional {
    Adicional wrapper;
    
    public BaseDecorator(Adicional c){
    this.wrapper=c;
    }
    
    @Override
    public String getDescricao() {
        return wrapper.getDescricao();
        }

    @Override
    public double custo() {
        return wrapper.custo();
        }
    
}
