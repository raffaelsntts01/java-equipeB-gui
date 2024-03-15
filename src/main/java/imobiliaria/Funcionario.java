package imobiliaria;

public class Funcionario {
    private int registro;
    private String nome, funcao;


    public Funcionario(int registro, String nome, String funcao) {
        this.registro = registro;
        this.nome = nome;
        this.funcao = funcao;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return nome;
    }
}

