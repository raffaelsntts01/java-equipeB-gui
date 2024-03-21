package imobiliaria;

public class Cliente {
    private String nome, contato, cpf;

// Método para aparecer os dados;
    public Cliente(String nome, String contato, String cpf) {
        this.nome = nome;
        this.contato = contato;
        this.cpf = cpf;
    }
    // Gets e setters;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return nome;
    }
}
