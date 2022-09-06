/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class TUI {

    private String txtNome;
    private int txtIdade;
    private float txtAltura;
    private Scanner leitor;
    private Pessoa pessoa;
    private Agenda agenda;

    public TUI() {
        leitor = new Scanner(System.in);
        agenda = new Agenda();
    }

    public String getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(String txtNome) {
        this.txtNome = txtNome;
    }

    public int getTxtIdade() {
        return txtIdade;
    }

    public void setTxtIdade(int txtIdade) {
        this.txtIdade = txtIdade;
    }

    public float getTxtAltura() {
        return txtAltura;
    }

    public void setTxtAltura(float txtAltura) {
        this.txtAltura = txtAltura;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void printTUI() {
        int op;
        do {
            System.out.println("[1] ARMAZENAR PESSOA\n[2] REMOVER PESSOA");
            System.out.println("[3] BUSCAR PESSOA\n[4] IMPRIMIR AGENDA"
                    + "\n[5] IMPRIMIR PESSOA\n[0] SAIR");
            op = leitor.nextInt();
            leitor.nextLine();
            switch (op) {
                case 1:
                    System.out.println("NOME: ");
                    setTxtNome(leitor.nextLine());
                    System.out.println("Altura: ");
                    setTxtAltura(leitor.nextFloat());
                    System.out.println("IDADE: ");
                    setTxtIdade(leitor.nextInt());
                    setPessoa(new Pessoa(getTxtNome(), getTxtIdade(), getTxtAltura()));
                    agenda.armazenarPessoa(getPessoa());
                    break;
                case 2:
                    System.out.println("NOME: ");
                    setTxtNome(leitor.nextLine());
                    agenda.removePessoa(getTxtNome());
                    break;
                case 3:
                    System.out.println("NOME: ");
                    setTxtNome(leitor.nextLine());
                    int posicao = agenda.buscaPessoa(getTxtNome());
                    if (posicao == -1) {
                        System.out.println("PESSOA NÃO ENCONTRADA!");

                    } else {
                        System.out.println("POSiÇÃO: "+posicao);
                    }
                    break;
                case 4:
                    agenda.imprimeAgenda();
                    break;
                case 5:
                    int index;
                    System.out.println("INDEX DA PESSOA: ");
                    index = leitor.nextInt();
                    agenda.imprimePessoa(index);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("OPCAO INVALIDA!");
                    ;
            }
        } while (op != 0);
    }

}
