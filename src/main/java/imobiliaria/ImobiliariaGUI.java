package imobiliaria;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ImobiliariaGUI extends JFrame {
    // Criamos listas para cada classe
    private ArrayList<Imovel> imoveis;
    private ArrayList<Cliente> clientes;
    private ArrayList<Funcionario> funcionarios;

    // Método para criar as listas
    public ImobiliariaGUI() {
        imoveis = new ArrayList<>();
        clientes = new ArrayList<>();
        funcionarios = new ArrayList<>();

        // Aqui setamos o tamanho da janela;
        setTitle("Sistema Imobiliário");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(new GridLayout(4, 1));

        // Botão de cadastrar Imóvel
        JButton btnCadastrarImovel = new JButton("Cadastrar Imovel");
        btnCadastrarImovel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarImovel();
            }
        });
        panel.add(btnCadastrarImovel);

        // Botão de cadastrar Funcionário
        JButton btnCadastrarFuncionario = new JButton("Cadastrar Funcionário");
        btnCadastrarFuncionario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarFuncionario();
            }
        });
        panel.add(btnCadastrarFuncionario);

        // Botão de cadastrar Cliente;
        JButton btnCadastrarCliente = new JButton("Cadastrar Cliente");
        btnCadastrarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarCliente();
            }
        });
        panel.add(btnCadastrarCliente);

        // Botão de cadastrar Imóvel;
        JButton btnConsultarImovel = new JButton("Consultar Imóvel");
        btnConsultarImovel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consultarImovelDisponivel();
            }
        });
        panel.add(btnConsultarImovel);

        // Botão de sair;
        JButton btnSair = new JButton("Sair");
        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sairDoPrograma();
            }
        });
        panel.add(btnSair);
        setVisible(true);
    }

    // Método sem retorno para cadastrar cliente;
    private void cadastrarCliente() {
        String nome = JOptionPane.showInputDialog(this, "Nome do Cliente:");
        String contato = JOptionPane.showInputDialog(this, "Contato do Cliente:");
        String cpf = JOptionPane.showInputDialog(this, "CPF do Cliente:");
        Cliente cliente = new Cliente(nome, contato, cpf);
        clientes.add(cliente);
        JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
    }

    // Método sem retorno para cadastrar funcionário;
    private void cadastrarFuncionario() {
        int registro = Integer.parseInt(JOptionPane.showInputDialog(this, "Registro do Funcionário:"));
        String nome = JOptionPane.showInputDialog(this, "Nome do Funcionário:");
        String funcao = JOptionPane.showInputDialog(this, "Função do Funcionário:");
        Funcionario funcionario = new Funcionario(registro, funcao, nome);
        funcionarios.add(funcionario);
    }

    // Método sem retorno para cadastrar imóvel;
    private void cadastrarImovel() {
        String endereco = JOptionPane.showInputDialog(this, "Endereço do Imóvel: ");
        String complemento = JOptionPane.showInputDialog(this, "Complemento(casa, apartamento): ");
        double preco = Double.parseDouble(JOptionPane.showInputDialog(this, "Preço: "));
        Imovel imovel = new Imovel(endereco, complemento, preco);
        imoveis.add(imovel);
    }

    // Método de consultar os Imóveis disponíveis;
    private void consultarImovelDisponivel() {
        StringBuilder sb = new StringBuilder("Imóveis Disponíveis:\n");
        for (Imovel imovel : imoveis) {
            if (imovel.isDisponibilidade()) {
                sb.append(imovel).append("\n");
            }
        }
        JOptionPane.showMessageDialog(this, sb.toString());
    }

    // Método de sair do programa;
    private void sairDoPrograma() {
        int option = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja sair?", "Sair", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}