/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q6;

/**
 *
 * @author mathe
 */
public class Comparador {
    private SalarioFuncionario funcionario;
    private SalarioMin minimo;

    public Comparador(SalarioFuncionario funcionario, SalarioMin minimo) {
        this.funcionario = funcionario;
        this.minimo = minimo;
    }

    public SalarioFuncionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(SalarioFuncionario funcionario) {
        this.funcionario = funcionario;
    }

    public SalarioMin getMinimo() {
        return minimo;
    }

    public void setMinimo(SalarioMin minimo) {
        this.minimo = minimo;
    }
    public double comparar(){
    return (this.funcionario.getSalarioFunc()/this.minimo.getSalarioMin());
    }
}
