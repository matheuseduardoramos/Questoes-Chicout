/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q11;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class TUI {

    private float txtN1;
    private float txtN2;
    private Scanner leitor;
    private Calculador calculador;
    private Notas notas;

    public TUI() {
        leitor = new Scanner(System.in);

    }

    public float getTxtN1() {
        return txtN1;
    }

    public void setTxtN1(float txtN1) {
        this.txtN1 = txtN1;
    }

    public float getTxtN2() {
        return txtN2;
    }

    public void setTxtN2(float txtN2) {
        this.txtN2 = txtN2;
    }

    public Calculador getCalculador() {
        return calculador;
    }

    public void setCalculador(Calculador calculador) {
        this.calculador = calculador;
    }

    public Notas getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }

    public void printTUI() {
        System.out.println("N1:");
        setTxtN1(leitor.nextFloat());
        System.out.println("N2:");
        setTxtN2(leitor.nextFloat());
        setNotas(new Notas(getTxtN1(), getTxtN2()));
        setCalculador(new Calculador(getNotas()));
    }

    public void printResult() {
        System.out.println(calculador.media());
    }

    public void tui() {
        printTUI();
        printResult();
    }
}
