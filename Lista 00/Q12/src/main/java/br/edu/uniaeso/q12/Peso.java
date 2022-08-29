/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q12;

public class Peso {

    private double pesoTerra;
    private double gRelativa;

    public Peso() {
    }

    public double getPesoTerra() {
        return pesoTerra;
    }

    public void setPesoTerra(double pesoTerra) {
        this.pesoTerra = pesoTerra;
    }

    public double getGplaneta() {
        return gRelativa;
    }

    public void setGplaneta(int op) {
        switch (op) {
            case 1:
                gRelativa = 0.37;
                break;
            case 2:
                gRelativa = 0.88;
                break;
            case 3:
                gRelativa = 0.38;
                break;
            case 4:
                gRelativa = 2.64;
                break;
            case 5:
                gRelativa = 1.15;
                break;
            case 7:
                gRelativa = 1.17;
                break;
            default:

        }
    }

    public String pesoPlaneta() {
        return "Seu Peso seria: " + (pesoTerra / 10) * gRelativa + "Kg";
    }
}
