/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q10;

public class Jogo {

    private int pessoa;
    private int pc;

    public Jogo() {
    }

    public static int randInt(int min, int max) {
        java.util.Random rand = new java.util.Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public int getPessoa() {
        return pessoa;
    }

    public void setPessoa(int pessoa) {
        this.pessoa = pessoa;
    }

    public int getPc() {
        return pc;
    }

    public void setPc() {
        pc = randInt(0, 2);
    }

    public void jogar() {
        setPc();
        if (pc == pessoa) {
            System.out.println("PC: " + jogada(getPc()) + "\nVocê: " + jogada(getPessoa()) + "\nEMPATE!");
        } else {
            if ((pc == 0 && pessoa == 2) || (pc == 1 && pessoa == 0) || (pc == 2 && pessoa == 1)) {
                System.out.println("PC: " + jogada(getPc()) + "\nVocê: " + jogada(getPessoa()) + "\nPC venceu!");
            } else {
                System.out.println("PC: " + jogada(getPc()) + "\nVocê: " + jogada(getPessoa()) + "\nVocê venceu!");
            }
        }

    }

    public String jogada(int op) {
        switch (op) {
            case 0:
                return "pedra ";
            case 1:
                return "papel ";
            case 2:
                return "tesoura ";
            default:

        }
        return null;
    }
}
