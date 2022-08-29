/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q3;


public class CalculadorFerraduras {
private int ferradura;
private Cavalos cavalos;
private Haras haras;

    public Cavalos getCavalos() {
        return cavalos;
    }

    public CalculadorFerraduras(Cavalos cavalos, Haras haras) {
        this.cavalos = cavalos;
        this.haras = haras;
    }

    public void setCavalos(Cavalos cavalos) {
        this.cavalos = cavalos;
    }

    public CalculadorFerraduras() {
    }

    public int getFerradura() {
        return ferradura;
    }

    public void setFerradura() {
        this.ferradura = cavalos.getPatas()*haras.getTotalcavalos();
    }
    

}
