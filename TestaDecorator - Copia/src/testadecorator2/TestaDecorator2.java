
package testadecorator2;

public class TestaDecorator2 {

    public static void main(String[] args) {
    Adicional basico = new Acai();
    System.out.println(basico.getDescricao());
    System.out.println(basico.custo());
    Adicional combo = new Morango(basico);
    combo = new Banana(combo);
    combo = new LeiteCondensado(combo);
    System.out.println(combo.getDescricao());
    System.out.println(combo.custo());
    }
    
}
