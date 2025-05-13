package Servicos;

import java.time.Duration;

import Entidades.Aluguel;
import Entidades.Boleto;

public class ServicoGerarBoleto {
    private ServicoTaxa servicoTaxa;
    private Double valorDiaria;

    public ServicoGerarBoleto(ServicoTaxa servicoTaxa, Double valorDiaria) {
        this.servicoTaxa = servicoTaxa;
        this.valorDiaria = valorDiaria;
    }

    public void processarBoleto(Aluguel aluguel){
        Duration tempo = Duration.between(aluguel.getEntrada().atStartOfDay(), aluguel.getSaida().atStartOfDay());
        Long dias = tempo.toDays();
        double taxaTotal = servicoTaxa.calculaTaxa(valorDiaria);
        double valorTotal = (valorDiaria*dias) + taxaTotal;
        aluguel.setBoleto(new Boleto(taxaTotal, valorTotal));   // Criando boleto
    }

    public ServicoTaxa getServicoTaxa() {
        return servicoTaxa;
    }

    public void setServicoTaxa(ServicoTaxa servicoTaxa) {
        this.servicoTaxa = servicoTaxa;
    }

    public Double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

}
