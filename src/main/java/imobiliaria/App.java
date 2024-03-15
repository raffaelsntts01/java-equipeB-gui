package imobiliaria;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            var tela = new ImobiliariaGUI();
            tela.setVisible(true);
        });
    }
}