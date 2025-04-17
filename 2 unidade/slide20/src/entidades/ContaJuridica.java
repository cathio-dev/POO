package entidades;


public class ContaJuridica extends Conta{
    Double limiteCredito;

    public ContaJuridica(Integer numero, String titular, Double saldo, Double limiteCredito) {
        super(numero, titular, saldo);
        this.limiteCredito = limiteCredito;
    }

    public Double getlimiteCredito() {
        return limiteCredito;
    }

    public void setlimiteCredito(Double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void saque(Double valor){
        super.saque(valor);
        saldo -= 2.0; // Faz o saque do valor e ainda subtrai mais 2.
    }

    public void emprestimo(Double valor){
        if (valor <= limiteCredito){
            this.saldo = saldo + valor;
            limiteCredito = limiteCredito - valor;
        }
    }


}
