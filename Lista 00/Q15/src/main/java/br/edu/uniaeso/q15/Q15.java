/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.uniaeso.q15;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Q15 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Termometro termo = new Termometro();
        System.out.println("Digite a temperatura em Celsius");
        termo.setCelsius(leitor.nextInt());
        System.out.println(termo.toString());
    }
}
