/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q9;

/**
 *
 * @author mathe
 */
public class TipoTriangulo {
    private Triangulo triangulo;

    public TipoTriangulo(Triangulo triangulo) {
        this.triangulo = triangulo;
    }

    public Triangulo getTriangulo() {
        return triangulo;
    }

    public void setTriangulo(Triangulo triangulo) {
        this.triangulo = triangulo;
    }
        public void tipo() {

        if (getTriangulo().getLadoA() != getTriangulo().getLadoB() 
                && getTriangulo().getLadoA() != getTriangulo().getLadoC()) {
            System.out.println("Triangulo Escaleno!");
        } else {
            if (getTriangulo().getLadoA() == getTriangulo().getLadoB() 
                    && getTriangulo().getLadoA() == getTriangulo().getLadoC()) {
                System.out.println("Triangulo Equilatero!");
            }else{
                System.out.println("Triangulo Isosceles!");
            }
        }

    }
}
