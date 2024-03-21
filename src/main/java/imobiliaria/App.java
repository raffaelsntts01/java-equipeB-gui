package imobiliaria;

import javax.swing.*;
public class App {
    // Método Main
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Criamos um var chamado tela onde vai criar a Classe ImobiliariaGUI;
            var tela = new ImobiliariaGUI();
            // setVisible = setamos a var como verdadeiro para que apareça no sistema;
            tela.setVisible(true);
        });
    }
}