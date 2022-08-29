package br.edu.uniaeso.q4;

public class CalculadorDeDias {
    private final int diasAno = 365;
    private Pessoa pessoa;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public String totalDias(){
        return pessoa.getNome() + ", Você viveu um total de " + (pessoa.getIdade() * 365) + " dias";
    }
}
