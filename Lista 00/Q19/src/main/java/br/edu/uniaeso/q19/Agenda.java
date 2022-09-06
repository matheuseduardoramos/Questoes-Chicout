/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q19;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mathe
 */
public class Agenda {

    private List<Pessoa> agenda;

    /*private Pessoa pessoa;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }*/
    public Agenda() {
        agenda = new ArrayList<>();
    }

    public List<Pessoa> getAgenda() {
        return agenda;
    }

    public void setAgenda(List<Pessoa> agenda) {
        this.agenda = agenda;
    }

    public void armazenarPessoa(Pessoa pessoa) {
        agenda.add(pessoa);
        System.out.println("PESSOA CADASTRADA COM SUCESSO!");
    }

    public void removePessoa(String nome) {
        int find = 0;
        for (int i = 0; i < agenda.size(); i++) {
            if (agenda.get(i).getNome().equals(nome)) {
                agenda.remove(i);
                System.out.println("PESSOA REMOVIDA COM SUCESSO!");
                find = 1;
                break;
            }
        }
        if (find == 0) {
            System.out.println("PESSOA NÃO ENCONTRADA!");
        }
    }

    public int buscaPessoa(String nome) {
        for (int i = 0; i < agenda.size(); i++) {
            if (agenda.get(i).getNome().equals(nome)) {
                return i;
            }
        }
        return -1;
    }

    public void imprimeAgenda() {
        for (int i = 0; i < agenda.size(); i++) {
            System.out.println(agenda.get(i));
        }
    }

    public void imprimePessoa(int index) {
        System.out.println(agenda.get(index));
    }
}
