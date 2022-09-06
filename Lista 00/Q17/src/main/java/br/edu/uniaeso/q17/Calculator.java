/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q17;

import java.util.List;

/**
 *
 * @author mathe
 */
public class Calculator {

    private List<Funcionario> funcionario;

    public Calculator(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }

    public List<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }

    public void mediaSalarial() {
        double somaSalario = 0;
        for (int i = 0; i < funcionario.size(); i++) {
            somaSalario+= funcionario.get(i).getSalario();
        }
        System.out.println("A media salarial da empresa é de R$:"
                +(somaSalario/funcionario.size()));
    }
}
