/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q2;

public class Terreno {

    private double altura;
    private double lado;

    public double getAltura() {
        return altura;
    }

    public Terreno(double altura, double lado) {
        this.altura = altura;
        this.lado = lado;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

}
