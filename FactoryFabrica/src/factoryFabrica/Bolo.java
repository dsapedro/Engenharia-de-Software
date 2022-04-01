package factoryFabrica;

public abstract class Bolo {

    private String nome, tipo;
    private float preco;

    public void sobreoBolo() {
        System.out.println("Nome do bolo: " + getNome());
        System.out.println("Tipo do bolo: " + getTipo());
        System.out.println("Preço do bolo: " + getPreco());
    }

    public void receita() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

}
