/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.uniaeso.q12;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Q12 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Peso peso = new Peso();
        
        System.out.println("Seu Peso na terra: ");
        peso.setPesoTerra(leitor.nextDouble());
        System.out.println("[1] Mercurio\n[2] Venus\n[3] Marte\n[4] Jupiter\n[5] Saturno\n[6] Urano\nEscolha o Planta: ");
        peso.setGplaneta(leitor.nextInt());
        System.out.println(peso.pesoPlaneta());
        
        
    }
}
