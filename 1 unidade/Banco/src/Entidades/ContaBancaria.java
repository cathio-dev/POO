package Entidades;

public class ContaBancaria {
    private int numConta;
    private String nomeTitular;
    private float saldo;
    private float valDeposito;
    private float valSaque;
    
    public ContaBancaria(int numConta, String nomeTitular, float saldo) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getValDeposito() {
        return valDeposito;
    }

    public void setValDeposito(float valDeposito) {
        this.valDeposito = valDeposito;
    }

    public float getValSaque() {
        return valSaque;
    }

    public void setValSaque(float valSaque) {
        this.valSaque = valSaque;
    }

    public void Deposito(){
        this.saldo = this.saldo + this.valDeposito;
    }

    public void Saque(){
        this.saldo -= this.valSaque + 5;
    }


}
