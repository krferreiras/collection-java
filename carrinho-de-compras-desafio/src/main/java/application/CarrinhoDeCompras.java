package application;

import entities.Item;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> items;
    private Double totalValue = 0.0;

    public CarrinhoDeCompras() {
        this.items = new ArrayList<>();
    }

    public void adicionarItem(String name, Double price, Integer quantity){
        items.add(new Item(name, price, quantity));
    }

    public void removerItem(String name){
        List<Item> removeItems = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)){
                removeItems.add(item);
            }
        }
        items.removeAll(removeItems);
    }

    public void calcularValorTotal(){
        for (Item item : items) {
            totalValue += (item.getPrice()*item.getQuantity());
        }
    }

    public int quantityItems(){
        return items.size();
    }

    public void exibirItens(){
        System.out.println("Itens atuais: "+ items+"\n");
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        if (carrinhoDeCompras.quantityItems() == 0){
            System.out.println("Seu carrinho de compras está vazio. Continue Comprando!");
        }

        carrinhoDeCompras.adicionarItem("produto 1",15.0,2);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.adicionarItem("produto 1",15.0,4);
        carrinhoDeCompras.adicionarItem("produto 3",14.0,3);
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("produto 1");
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.calcularValorTotal();
        System.out.println("Valor total: R$ " + carrinhoDeCompras.totalValue);
    }

}
