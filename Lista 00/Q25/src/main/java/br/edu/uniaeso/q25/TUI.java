/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q25;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class TUI {

    private Scanner leitor;
    private double txtI;
    private double txtJ;
    private double txtK;
    private Ponto p1;
    private Ponto p2;
    private Calculador calculador;
    private double distancia;

    public TUI() {
        leitor = new Scanner(System.in);
    }

    public double getTxtI() {
        return txtI;
    }

    public void setTxtI(double txtI) {
        this.txtI = txtI;
    }

    public double getTxtJ() {
        return txtJ;
    }

    public void setTxtJ(double txtJ) {
        this.txtJ = txtJ;
    }

    public double getTxtK() {
        return txtK;
    }

    public void setTxtK(double txtK) {
        this.txtK = txtK;
    }

    public Ponto getP1() {
        return p1;
    }

    public void setP1(Ponto p1) {
        this.p1 = p1;
    }

    public Ponto getP2() {
        return p2;
    }

    public void setP2(Ponto p2) {
        this.p2 = p2;
    }

    public Calculador getCalculador() {
        return calculador;
    }

    public void setCalculador(Calculador calculador) {
        this.calculador = calculador;
    }

    public void printTUI() {
        System.out.println("P1 i: ");
        setTxtI(leitor.nextDouble());
        System.out.println("P1 j: ");
        setTxtJ(leitor.nextDouble());
        System.out.println("P1 k: ");
        setTxtK(leitor.nextDouble());
        setP1(new Ponto(getTxtI(), getTxtJ(), getTxtK()));
        System.out.println("P2 i: ");
        setTxtI(leitor.nextDouble());
        System.out.println("P2 j: ");
        setTxtJ(leitor.nextDouble());
        System.out.println("P2 k: ");
        setTxtK(leitor.nextDouble());
        setP2(new Ponto(getTxtI(), getTxtJ(), getTxtK()));
        setCalculador(new Calculador(getP1(), getP2()));
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void solve() {
        setDistancia(calculador.distancia2Pontos());
    }

    public void printResult() {
        System.out.println("P1: " + getP1() + "\n------");
        System.out.println("P2: " + getP2() + "\n------");
        System.out.println("A distancia de P1 e P2 é de: " + getDistancia());

    }

    public void tui() {
        printTUI();
        solve();
        printResult();
    }
}
