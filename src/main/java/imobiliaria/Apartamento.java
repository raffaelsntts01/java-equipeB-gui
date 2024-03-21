package imobiliaria;

// Criando a Classe onde vai ter o método da Classe Imóvel pelo meio da Herança;
public class Apartamento extends Imovel{
    public Apartamento(String endereco, String complemento, double preco) {
        super(endereco, "Apartamento", preco);
    }

    @Override
    public double calcularPrecoVenda() {
        return super.calcularPrecoVenda();
    }
}
