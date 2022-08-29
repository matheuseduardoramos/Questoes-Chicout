/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q9;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class TUI {

    private double txtLadoA;
    private double txtLadoB;
    private double txtLadoC;
    private Triangulo triangulo;
    private TipoTriangulo tipoTriangulo;
    private Scanner leitor;

    public TUI() {
        leitor = new Scanner(System.in);
    }

    public double getTxtLadoA() {
        return txtLadoA;
    }

    public void setTxtLadoA(double txtLadoA) {
        this.txtLadoA = txtLadoA;
    }

    public double getTxtLadoB() {
        return txtLadoB;
    }

    public void setTxtLadoB(double txtLadoB) {
        this.txtLadoB = txtLadoB;
    }

    public double getTxtLadoC() {
        return txtLadoC;
    }

    public void setTxtLadoC(double txtLadoC) {
        this.txtLadoC = txtLadoC;
    }

    public Triangulo getTriangulo() {
        return triangulo;
    }

    public void setTriangulo(Triangulo triangulo) {
        this.triangulo = triangulo;
    }

    public TipoTriangulo getTipoTriangulo() {
        return tipoTriangulo;
    }

    public void setTipoTriangulo(TipoTriangulo tipoTriangulo) {
        this.tipoTriangulo = tipoTriangulo;
    }

    public void printTUI() {
        System.out.println("Digite o lado A");
        setTxtLadoA(leitor.nextDouble());
        System.out.println("Digite o lado B");
        setTxtLadoB(leitor.nextDouble());
        System.out.println("Digite o lado C");
        setTxtLadoC(leitor.nextDouble());
        setTriangulo(new Triangulo(getTxtLadoA(), getTxtLadoB(), getTxtLadoC()));
        setTipoTriangulo(new TipoTriangulo(getTriangulo()));
    }

    public void printResult() {
        tipoTriangulo.tipo();
    }

    public void tui() {
        printTUI();
        printResult();
    }
}
