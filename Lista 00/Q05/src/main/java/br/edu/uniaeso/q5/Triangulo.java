/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q5;

/**
 *
 * @author mathe
 */
public class Triangulo {
    private double catetoA;
    private double catetoO;

    public Triangulo() {
    }

    public Triangulo(double catetoA, double catetoO) {
        this.catetoA = catetoA;
        this.catetoO = catetoO;
    }

    public double getCatetoA() {
        return catetoA;
    }

    public void setCatetoA(double catetoA) {
        this.catetoA = catetoA;
    }

    public double getCatetoO() {
        return catetoO;
    }

    public void setCatetoO(double catetoO) {
        this.catetoO = catetoO;
    }
    public double hipotenusa()
    {
        return Math.sqrt((Math.pow(catetoA, 2)+(Math.pow(catetoO, 2))));
    }
}
        