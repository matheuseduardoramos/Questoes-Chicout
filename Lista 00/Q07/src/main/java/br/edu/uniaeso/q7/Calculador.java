/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q7;

/**
 *
 * @author mathe
 */
public class Calculador {
    private Losango losango;

    public Calculador(Losango losango) {
        this.losango = losango;
    }
    public double area() {
        return (losango.getDiagonalMaior()*losango.getDiagonalMenor())/2;
    }
}
