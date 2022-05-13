package testadecorator2;

public class Acai implements Adicional {

    String tamanho;

    public Acai(String t) {
        this.tamanho = t;
    }

    @Override
    public String getDescricao() {
        String descricao = "";
        if (tamanho == "P") {
            descricao = "Açaí Pequeno";
        } else if (tamanho == "M") {
            descricao = "Açaí Médio";
        } else if (tamanho == "G") {
            descricao = "Açaí Grande";
        }
        return descricao;
    }

    @Override
    public double custo() {
        double valor = 0;
        if (tamanho == "P") {
            valor = 8;
        } else if (tamanho == "M") {
            valor = 11;
        } else if (tamanho == "G") {
            valor = 14;
        }
        return valor;
    }

    @Override
    public String getTamanho() {
        return this.tamanho;
    }

    @Override
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

}
