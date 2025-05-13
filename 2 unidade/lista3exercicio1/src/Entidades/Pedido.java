package Entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private String nome;
    private Double preco;

    private Date momento;
    private StatusPedido status;

    private List<ItensPedido> itens = new ArrayList<>();

    public Pedido(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void addItem(ItensPedido item) {
        itens.add(item);
    }

    public void removeItem(ItensPedido item) {
        itens.remove(item);
    }

    public Double total() {
        Double total = 0.0;

        for (ItensPedido item : itens) {
            total = total + item.subtotal();
        }

        return total; // Fazer frase: Valor Total: 
    }

    public void ResumoDoPedido(){
        //
        //
        //
        //
        System.out.println("Itens do Pedido: ");
        System.out.println();

        for (ItensPedido item : itens) {
            item.toString();
        }

        System.out.println();

        System.out.printf("Valor Total: R$ %.2f", total());
    }

}
