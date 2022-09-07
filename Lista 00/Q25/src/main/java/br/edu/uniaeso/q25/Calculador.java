/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q25;

/**
 *
 * @author mathe
 */
public class Calculador {

    private Ponto p1;
    private Ponto p2;

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

    public Calculador(Ponto p1, Ponto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double distancia2Pontos() {
        return Math.sqrt(Math.pow((getP2().getI() - getP1().getI()), 2)
                + Math.pow((getP2().getJ() - getP1().getJ()), 2)
                + Math.pow((getP2().getK() - getP1().getK()), 2));

    }
}
