package Entidades;

public class Conta {
    private Integer numeroConta;
    private String nomeTitular;
    private Double depositoInicial;
    private Double saldo;
    
    public Conta(Integer numeroConta, String nomeTitular, Double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.depositoInicial = depositoInicial;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Double getDepositoInicial() {
        return depositoInicial;
    }

    public void setDepositoInicial(Double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }

    @Override
    public String toString() {
        return "Conta [numeroConta=" + numeroConta + ", nomeTitular=" + nomeTitular + ", Saldo=" + saldo + "]";
    }
    
    
}
