/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q20;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class TUI {

    private Pessoa pessoa;
    private Elevador elevador;
    private int txtAndares;
    private float txtPesoMax;
    private int txtMaxPesoa;
    private Scanner leitor;

    public TUI() {
        leitor = new Scanner(System.in);
        pessoa = new Pessoa();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public int getTxtAndares() {
        return txtAndares;
    }

    public void setTxtAndares(int txtAndares) {
        this.txtAndares = txtAndares;
    }

    public float getTxtPesoMax() {
        return txtPesoMax;
    }

    public void setTxtPesoMax(float txtPesoMax) {
        this.txtPesoMax = txtPesoMax;
    }

    public int getTxtMaxPesoa() {
        return txtMaxPesoa;
    }

    public void setTxtMaxPesoa(int txtMaxPesoa) {
        this.txtMaxPesoa = txtMaxPesoa;
    }

    public void printTUI() {
        System.out.println("Numero de andares: ");
        setTxtAndares(leitor.nextInt());
        System.out.println("Max de pessoas: ");
        setTxtMaxPesoa(leitor.nextInt());
        System.out.println("Peso maximo: ");
        setTxtPesoMax(leitor.nextFloat());
        elevador = new Elevador(getTxtAndares(), getTxtPesoMax(), getTxtMaxPesoa());
        int op;
        do {
            System.out.println("[1]ENTRAR: \n[2]SAIR: \n[3]SUBIR: \n[4]DESCER: "
                    + "\n[0]MANUTENCAO: ");
            op = leitor.nextInt();
            switch (op) {
                case 1:
                    System.out.println("PESO DA PESSOA: ");
                    pessoa.setPeso(leitor.nextFloat());
                    elevador.entra(pessoa);
                    break;
                case 2:
                    System.out.println("PESO DA PESSOA: ");
                    pessoa.setPeso(leitor.nextFloat());
                    elevador.sai(pessoa);
                    break;
                case 3:
                    elevador.sobe();
                    break;
                case 4:
                    elevador.desce();
                    break;
                case 0:
                    System.out.println("ELEVADOR ENTRARA EM MANUTENCAO");
                    elevador.setNumPessoa(- elevador.getNumPessoa());
                    elevador.setAndarAtual(- elevador.getAndarAtual());
                    break;
                default:
                    System.out.println("OPCAO INVALIDA!");
            }
        } while (op != 0);
    }
}
