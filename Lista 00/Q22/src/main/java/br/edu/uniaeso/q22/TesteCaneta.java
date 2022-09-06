/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q22;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class TesteCaneta {

    private Scanner leitor;
    private Caneta caneta;
    private String txtMarca;
    private String txtCor;
    private double txtTamanho;

    public TesteCaneta() {
        leitor = new Scanner(System.in);
    }

    public Caneta getCaneta() {
        return caneta;
    }

    public void setCaneta(Caneta caneta) {
        this.caneta = caneta;
    }

    public String getTxtMarca() {
        return txtMarca;
    }

    public void setTxtMarca(String txtMarca) {
        this.txtMarca = txtMarca;
    }

    public String getTxtCor() {
        return txtCor;
    }

    public void setTxtCor(String txtCor) {
        this.txtCor = txtCor;
    }

    public double getTxtTamanho() {
        return txtTamanho;
    }

    public void setTxtTamanho(double txtTamanho) {
        this.txtTamanho = txtTamanho;
    }

    public void cadastrarCaneta() {
        System.out.println("Marca:");
        setTxtMarca(leitor.nextLine());
        System.out.println("Cor: ");
        setTxtCor(leitor.nextLine());
        System.out.println("Tamanho:");
        setTxtTamanho(leitor.nextFloat());
        setCaneta(new Caneta(getTxtMarca(), getTxtCor(), getTxtTamanho()));
    }

    public void mostarCaneta() {
        System.out.println(getCaneta());
    }
    
}
