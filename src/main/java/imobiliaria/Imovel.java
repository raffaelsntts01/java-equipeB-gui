package imobiliaria;

public class Imovel {
    private String endereco, complemento;
    private double precoBase;
    private boolean disponibiliadade;

// getters e seters
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public double getPreco() {
        return precoBase;
    }

    public void setPreco(double preco) {
        this.precoBase = preco;
    }

    public void setDisponibiliadade(boolean disponibiliadade) {
        this.disponibiliadade = disponibiliadade;
    }

    public Imovel(String endereco, String complemento, double preco){
        this.endereco = endereco;
        this.complemento = complemento;
        this.precoBase = preco;
        this.disponibiliadade = true;
    }
    
    public String toString(){
        return endereco;
    }
    public void reservar(){
        this.disponibiliadade = false;
    }
    public void liberar(){
        this.disponibiliadade = true;
    }

    public boolean isDisponibilidade(){
        return disponibiliadade;

    }
    public double calcularPrecoVenda(){
        // o preço de venda é o preço base
        return precoBase;
    }
}
