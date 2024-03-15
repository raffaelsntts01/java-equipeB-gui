package imobiliaria;

public class Casa extends Imovel{
    public Casa(String endereco, String complemento, double preco) {
        super(endereco, "Casa", preco);
    }

    @Override
    public double calcularPrecoVenda() {
        return super.calcularPrecoVenda();
    }
}
