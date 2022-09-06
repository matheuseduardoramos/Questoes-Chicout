/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q16;

import java.util.List;

/**
 *
 * @author mathe
 */
public class Calculator {

    private List<Pessoa> pessoa;

    public Calculator(List<Pessoa> pessoa) {
        this.pessoa = pessoa;
    }

    public List<Pessoa> getPessoa() {
        return pessoa;
    }

    public void setPessoa(List<Pessoa> pessoa) {
        this.pessoa = pessoa;
    }

    public void maiorEMenor() {
        double maior = 0;
        double menor = 3;
        for (int i = 0; i < 10; i++) {
            if (pessoa.get(i).getAltura() < menor) {
                menor = pessoa.get(i).getAltura();
            }
            if (pessoa.get(i).getAltura() > maior) {
                maior = pessoa.get(i).getAltura();
            }
        }
        System.out.println("MAIOR: " + maior + "\nMENOR: " + menor);
    }

    public void mediaAlturaHomem() {
        double somaAltura = 0;
        int cHomem = 0;
        for (int i = 0; i < 10; i++) {
            if (pessoa.get(i).isSexo() == true) {
                cHomem += 1;
                somaAltura += pessoa.get(i).getAltura();
            }
        }
        System.out.println("A media de altura dos homens é "
                + "de " + (somaAltura / cHomem) + "m");
    }

    public void cMulher() {
        int cMulher = 0;
        for (int i = 0; i < 10; i++) {
            if (pessoa.get(i).isSexo() == false) {
                cMulher += 1;
            }
        }
        System.out.println("A quantidade de mulheres cadastradas é de " + cMulher);
    }
}
