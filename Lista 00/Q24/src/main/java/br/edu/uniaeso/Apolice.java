package br.edu.uniaeso;

public class Apolice {
    private String nome;
    private double valor;
    private int idade;

    public Apolice(String nome, double valor, int idade) {
        this.nome = nome;
        this.valor = valor;
        this.idade = idade;
        calcularPremioApolice();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nIdade: " + this.idade + "\nValor da apolice: R$:" + this.valor;
    }

    public void calcularPremioApolice() {
        if ((getIdade() >= 18) && (getIdade() <= 25)) {
            this.valor += (this.valor * 20) / 100;
        } else {
            if ((getIdade() > 25) && (getIdade() <= 26)) {
                this.valor += (this.valor * 15) / 100;
            }else{
                if(getIdade()>36){
                    this.valor+= (this.valor*10)/100;
                }
            }
        }
    }
    public void desconto(String cidade){
        switch (cidade){
            case "curitiba":
                setValor(getValor()*0.8);
                break;
            case "rio de janeiro":
                setValor(getValor()*0.85);
                break;
            case "são paulo":
                setValor(getValor()*0.9);
                break;
            case "belo horizonte":
                setValor(getValor()*0.95);
                break;
            default:
                System.out.println("sem desconto para esta cidade!");
        }
    }
}
