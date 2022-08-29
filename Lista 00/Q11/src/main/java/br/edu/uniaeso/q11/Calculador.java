/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q11;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Calculador {
    private Notas notas;

    public Calculador(Notas notas) {
        this.notas = notas;
    }

    public Notas getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }
    public String media() {
        float media = (getNotas().getN1() + getNotas().getN2()) / 2;
        if ((media >= 5) && ((getNotas().getN1() >= 3) || (getNotas().getN2() >= 3))) {
            return "MEDIA: " + media + "\nAprovado";

        } else {
            Scanner leitor = new Scanner(System.in);
            System.out.println("MEDIA INSUFICIENTE");
            System.out.println("N3: ");
            this.notas.setN3(leitor.nextFloat());
            if (getNotas().getN1() > getNotas().getN2()) {
                media = (getNotas().getN1() + getNotas().getN3()) / 2;
                if (media >= 5) {
                    return "MEDIA FINAL: " + media + "\nAprovado";
                } else {
                    return "MEDIA FINAL: " + media + "\nReprovado";
                }
            } else {
                media = (getNotas().getN2() + getNotas().getN3()) / 2;
                if (media >= 5) {
                    return "MEDIA FINAL: " + media + "\nAprovado";
                } else {
                    return "MEDIA FINAL: " + media + "\nReprovado";
                }
            }
        }

    }
    
}
