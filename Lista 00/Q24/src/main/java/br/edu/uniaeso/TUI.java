package br.edu.uniaeso;

import java.util.Scanner;

public class TUI {
    private String txtNome;
    private int txtIdade;
    private double txtValor;
    private Apolice apolice;
    private Scanner leitor;
    private String txtCidade;

    public TUI() {
        leitor = new Scanner(System.in);
    }

    public String getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(String txtNome) {
        this.txtNome = txtNome;
    }

    public int getTxtIdade() {
        return txtIdade;
    }

    public void setTxtIdade(int txtIdade) {
        this.txtIdade = txtIdade;
    }

    public double getTxtValor() {
        return txtValor;
    }

    public void setTxtValor(double txtValor) {
        this.txtValor = txtValor;
    }

    public Apolice getApolice() {
        return apolice;
    }

    public void setApolice(Apolice apolice) {
        this.apolice = apolice;
    }

    public String getTxtCidade() {
        return txtCidade;
    }

    public void setTxtCidade(String txtCidade) {
        this.txtCidade = txtCidade;
    }
    public void printTUI(){
        System.out.println("Nome: ");
        setTxtNome(leitor.nextLine());
        System.out.println("Idade: ");
        setTxtIdade(leitor.nextInt());
        System.out.println("Valor da police: ");
        setTxtValor(leitor.nextFloat());
        setApolice(new Apolice(getTxtNome(),getTxtValor(),getTxtIdade()));
        System.out.println("Digite sua cidade: ");
        leitor.nextLine();
        setTxtCidade(leitor.nextLine());
        apolice.desconto(getTxtCidade());
    }
    public void printResult(){
        System.out.println(apolice);
    }
    public void tui(){
        printTUI();
        printResult();
    }

}
