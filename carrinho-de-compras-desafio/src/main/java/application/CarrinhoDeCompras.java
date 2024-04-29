package application;

import entities.Item;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> item;

    public CarrinhoDeCompras(List<Item> item) {
        this.item = new ArrayList<>();
    }

    public void adicionarItem(String name, Double price, Integer quantity){
        item.add(new Item(name, price, quantity));
    }

}
