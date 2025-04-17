package entidades;

public class ContaPoupanca extends Conta {
    Double taxaJuro;

    public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaJuro) {
        super(numero, titular, saldo);
        this.taxaJuro = taxaJuro;
    }

    public Double getTaxaJuro() {
        return taxaJuro;
    }

    public void setTaxaJuro(Double taxaJuro) {
        this.taxaJuro = taxaJuro;
    }

    @Override
    public void saque(Double valor) {
        this.saldo = this.saldo - valor;
    }

    public void atualizarSaldo(){
        this.saldo = this.saldo + (this.saldo * (taxaJuro/100));
    }
}
