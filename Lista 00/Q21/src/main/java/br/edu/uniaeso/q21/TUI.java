/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q21;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class TUI {

    private Scanner leitor;
    private ControleRemoto controle;
    
    private int txtTotalCanal;

    public ControleRemoto getControle() {
        return controle;
    }

    public void setControle(ControleRemoto controle) {
        this.controle = controle;
    }


    public int getTxtTotalCanal() {
        return txtTotalCanal;
    }

    public void setTxtTotalCanal(int txtTotalCanal) {
        this.txtTotalCanal = txtTotalCanal;
    }

    public TUI() {
        leitor = new Scanner(System.in);
    }

    public void printTUI() {
        System.out.println("TOTAL DE CANAIS DA SUA TV: ");
        setTxtTotalCanal(leitor.nextInt());
        controle = new ControleRemoto(getTxtTotalCanal());
    int op;
        do {
            System.out.println("[1]AUMENTAR VOLUME: \n[2]DIMINUIR VOLUME: "
                    + "\n[3]PROXIMO CANAL: \n[4]VOLTAR CANAL: "
                    + "\n[5]ESCOLHER O CANAL: \n[0]DESLIGAR: ");
            op = leitor.nextInt();
            switch (op) {
                case 1:
                    controle.aumentar();
                    break;
                case 2:
                    controle.diminuir();
                    break;
                case 3:
                    controle.proxCanal();
                    break;
                case 4:
                    controle.voltaCanal();
                    break;
                case 5:
                    System.out.println("DESEJA IR PARA QUAL CANAL: ");
                    controle.irParaCanal(leitor.nextInt());
                    break;
                case 0:
                    System.out.println("TELEVISAO DESLIGADA");
                    break;
                default:
                    System.out.println("OPCAO INVALIDA!");
            }
        } while (op != 0);
    }
}
