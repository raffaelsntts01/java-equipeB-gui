package imobiliaria;

public class Apartamento extends Imovel{
    public Apartamento(String endereco, String complemento, double preco) {
        super(endereco, "Apartamento", preco);
    }

    @Override
    public double calcularPrecoVenda() {
        return super.calcularPrecoVenda();
    }
}
