/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q25;

/**
 *
 * @author mathe
 */
public class Ponto {
    private double i;
    private double j;
    private double k;

    public Ponto(double i, double j, double k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }

    public Ponto() {
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public double getJ() {
        return j;
    }

    public void setJ(double j) {
        this.j = j;
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    @Override
    public String toString() {
        return "{" + "i = " + i + ", j = " + j + ", k = " + k + '}';
    }
    
}
