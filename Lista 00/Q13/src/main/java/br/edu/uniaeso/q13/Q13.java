/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package br.edu.uniaeso.q13;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Q13 {

    public static void main(String[] args) {
        Intervalo intervalo = new Intervalo();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Começo");
        intervalo.setInferior(leitor.nextInt());
        System.out.println("Fim");
        intervalo.setSuperior(leitor.nextInt());
        if (intervalo.getInferior() > intervalo.getSuperior()) {
            System.out.println("Erro no intervalo!");
        } else {
            System.out.println(intervalo.somaIntervalo());
            System.out.println(intervalo.nIntervalo());
            System.out.println(intervalo.nImpar());
            intervalo.imparPar();
        }
    }
}
