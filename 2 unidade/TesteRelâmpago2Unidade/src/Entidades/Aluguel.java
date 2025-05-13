package Entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aluguel {
    private LocalDate entrada, saida;
    private Imovel imovel;
    private Boleto boleto;

    public Aluguel(LocalDate entrada, LocalDate saida) {
        this.entrada = entrada;
        this.saida = saida;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public Boleto getBoleto() {
        return boleto;
    }

    public void setBoleto(Boleto boleto) {
        this.boleto = boleto;
    }

    public LocalDate getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDate entrada) {
        this.entrada = entrada;
    }

    public LocalDate getSaida() {
        return saida;
    }

    public void setSaida(LocalDate saida) {
        this.saida = saida;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return "Aluguel [Entrada=" + entrada.format(fmt) + ", Saida=" + saida.format(fmt) + "]";
    }
}
