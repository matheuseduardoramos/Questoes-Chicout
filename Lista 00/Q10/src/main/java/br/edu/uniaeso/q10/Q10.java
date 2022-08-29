/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.uniaeso.q10;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Q10 {

    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        Scanner leitor = new Scanner(System.in);
        System.out.println("[0]: Pedra\n[1]: Papel\n[2]: Tesoura\nDigite sua escolha:");
        jogo.setPessoa(leitor.nextInt());
        jogo.jogar();
    }
}
