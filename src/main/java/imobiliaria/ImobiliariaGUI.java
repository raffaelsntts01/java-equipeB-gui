package imobiliaria;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ImobiliariaGUI extends JFrame {
 private ArrayList<Imovel> imoveis;
 private ArrayList<Cliente> clientes;
 private ArrayList<Funcionario> funcionarios;

 public ImobiliariaGUI(){
     imoveis = new ArrayList<>();
     clientes = new ArrayList<>();
     funcionarios = new ArrayList<>();

     setTitle("Sistema Imobiliário");
     setSize(500,200);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setLocationRelativeTo(null);

     JPanel panel = new JPanel();
     getContentPane().add(panel);
     panel.setLayout(new GridLayout(4,1));

     JButton btnCadastrarImovel = new JButton("Cadastrar Imovel");
     btnCadastrarImovel.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             cadastrarImovel();
         }
     });
     panel.add(btnCadastrarImovel);


     JButton btnCadastrarFuncionario = new JButton("Cadastrar Funcionário");
     btnCadastrarFuncionario.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             cadastrarFuncionario();
         }
     });
     panel.add(btnCadastrarFuncionario);
     JButton btnCadastrarCliente = new JButton("Cadastrar Cliente");
     btnCadastrarCliente.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             cadastrarCliente();
         }
     });
     panel.add(btnCadastrarCliente);

     JButton btnConsultarImovel = new JButton("Consultar Imóvel");
     btnConsultarImovel.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             consultarImovelDisponivel();
         }
     });
     panel.add(btnConsultarImovel);

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

    private void cadastrarCliente() {
        String nome = JOptionPane.showInputDialog(this, "Nome do Cliente:");
        String contato = JOptionPane.showInputDialog(this, "Contato do Cliente:");
        String cpf = JOptionPane.showInputDialog(this, "CPF do Cliente:");
        Cliente cliente = new Cliente(nome, contato, cpf);
        clientes.add(cliente);
        JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
    }

    private void cadastrarFuncionario() {
        int registro = Integer.parseInt(JOptionPane.showInputDialog(this, "Registro do Funcionário:"));
        String nome = JOptionPane.showInputDialog(this, "Nome do Funcionário:");
        String funcao = JOptionPane.showInputDialog(this, "Função do Funcionário:");
        Funcionario funcionario = new Funcionario(registro, funcao, nome);
        funcionarios.add(funcionario);
    }

    private void cadastrarImovel() {
     String endereco = JOptionPane.showInputDialog(this, "Endereço do Imóvel: ");
     String complemento = JOptionPane.showInputDialog(this,"Complemento(casa, apartamento): ");
     double preco = Double.parseDouble(JOptionPane.showInputDialog(this, "Preço: "));
     Imovel imovel = new Imovel(endereco, complemento,preco);
     imoveis.add(imovel);
    }

    private void consultarImovelDisponivel() {
        StringBuilder sb = new StringBuilder("Imóveis Disponíveis:\n");
        for (Imovel imovel : imoveis) {
            if (imovel.isDisponibilidade()) {
                sb.append(imovel).append("\n");
            }
        }
        JOptionPane.showMessageDialog(this, sb.toString());
    }
    private void sairDoPrograma() {
        int option = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja sair?", "Sair", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}