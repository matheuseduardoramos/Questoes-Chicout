/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q13;

/**
 *
 * @author mathe
 */
public class Intervalo {

    private int inferior;
    private int superior;

    public int getInferior() {
        return inferior;
    }

    public void setInferior(int inferior) {
        this.inferior = inferior;
    }

    public int getSuperior() {
        return superior;
    }

    public void setSuperior(int superior) {
        this.superior = superior;
    }

    public Intervalo() {
    }

    public int somaIntervalo() {
        int soma = 0;
        for (int i = inferior; i <= superior; i++) {
            soma += i;
        }
        return soma;
    }

    public int nIntervalo() {
        int n = 0;
        for (int i = inferior; i <= superior; i++) {
            n++;
        }
        return n;
    }

    public int nImpar() {
        int impar = 0;
        for (int i = inferior; i <= superior; i++) {
            if (i % 2 != 0) {
                impar++;
            }
        }
        return impar;
    }

    public void imparPar() {
        for (int i = inferior; i <= superior; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " Par");
            } else {
                System.out.println(i + " Impar");
            }
        }
    }
}
