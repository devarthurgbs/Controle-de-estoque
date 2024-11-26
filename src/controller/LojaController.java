package controller;

import model.Product;
import view.VisaoLoja;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class LojaController {
    private VisaoLoja view;
    private List<Product> productList;

    public LojaController(VisaoLoja view) {
        this.view = view;
        this.productList = new ArrayList<>();
        this.view.addAddButtonListener(new AddProductListener());
    }

    class AddProductListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = view.getProductName();
            int quantity = view.getProductQuantity();

            Product product = new Product(name, quantity);
            productList.add(product);
            view.addProductToList("Produto: " + product.getName() + ", Quantidade: " + product.getQuantity());
        }
    }
}