/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q2;

/**
 *
 * @author mathe
 */
public class Calculador {
    Terreno terreno;

    public Calculador(Terreno terreno) {
        this.terreno = terreno;
    }

    public Terreno getTerreno() {
        return terreno;
    }

    public void setTerreno(Terreno terreno) {
        this.terreno = terreno;
    }
    
    public double area(){
    return terreno.getLado()*terreno.getAltura();
    }
}
