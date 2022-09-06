/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q18;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class TUI {

    private int txtDia;
    private int txtMes;
    private int txtAno;
    private float txtAltura;
    private String txtNome;
    private Scanner leitor;
    private Data data;
    private Pessoa pessoa;

    public TUI() {
        leitor = new Scanner(System.in);
    }

    public int getTxtDia() {
        return txtDia;
    }

    public void setTxtDia(int txtDia) {
        this.txtDia = txtDia;
    }

    public int getTxtMes() {
        return txtMes;
    }

    public void setTxtMes(int txtMes) {
        this.txtMes = txtMes;
    }

    public int getTxtAno() {
        return txtAno;
    }

    public void setTxtAno(int txtAno) {
        this.txtAno = txtAno;
    }

    public float getTxtAltura() {
        return txtAltura;
    }

    public void setTxtAltura(float txtAltura) {
        this.txtAltura = txtAltura;
    }

    public String getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(String txtNome) {
        this.txtNome = txtNome;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void printTUI() {
        System.out.println("NOME: ");
        setTxtNome(leitor.nextLine());
        System.out.println("ALTURA: ");
        setTxtAltura(leitor.nextFloat());
        System.out.println("DIA DE NASCIMENTO: ");
        setTxtDia(leitor.nextInt());
        System.out.println("MES DE NASCIMENTO: ");
        setTxtMes(leitor.nextInt());
        System.out.println("ANO de NASCIMENTO: ");
        setTxtAno(leitor.nextInt());
        setData(new Data(getTxtDia(), getTxtMes(), getTxtAno()));
        setPessoa(new Pessoa(getTxtNome(), getData(), getTxtAltura()));
    }

    public void printResult() {
        System.out.println(pessoa);
    }

    public void tui() {
        printTUI();
        printResult();
    }
}
