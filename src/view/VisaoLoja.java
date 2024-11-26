package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VisaoLoja {
    private JFrame frame;
    private JTextField productNameField;
    private JTextField productQuantityField;
    private JTextArea productListArea;
    private JButton addButton;

    public VisaoLoja() {
        frame = new JFrame("Loja de Eletrônicos - Controle de Estoque");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        productNameField = new JTextField(15);
        productQuantityField = new JTextField(5);
        addButton = new JButton("Adicionar Produto");
        productListArea = new JTextArea(10, 30);
        productListArea.setEditable(false);

        frame.add(new JLabel("Nome do Produto:"));
        frame.add(productNameField);
        frame.add(new JLabel("Quantidade:"));
        frame.add(productQuantityField);
        frame.add(addButton);
        frame.add(new JScrollPane(productListArea));

        frame.setVisible(true);
    }

    public String getProductName() {
        return productNameField.getText();
    }

    public int getProductQuantity() {
        return Integer.parseInt(productQuantityField.getText());
    }

    public void addProductToList(String productInfo) {
        productListArea.append(productInfo + "\n");
    }

    public void addAddButtonListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }
}