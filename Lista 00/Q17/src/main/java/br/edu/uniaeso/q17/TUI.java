/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class TUI {

    private double txtSalario;
    private int quantidadeF;
    private Scanner leitor;
    private Funcionario funcionario;
    private List<Funcionario> f;
    private Calculator calculator;

    public Calculator getCalculator() {
        return calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public TUI() {
        leitor = new Scanner(System.in);
        f = new ArrayList<>();
    }

    public double getTxtSalario() {
        return txtSalario;
    }

    public void setTxtSalario(double txtSalario) {
        this.txtSalario = txtSalario;
    }

    public int getQuantidadeF() {
        return quantidadeF;
    }

    public void setQuantidadeF(int quantidadeF) {
        this.quantidadeF = quantidadeF;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public List<Funcionario> getF() {
        return f;
    }

    public void setF(List<Funcionario> f) {
        this.f = f;
    }

    public void printTUI() {
        System.out.println("Digite a quantidade de funcionários: ");
        setQuantidadeF(leitor.nextInt());
        for (int i = 0; i < getQuantidadeF(); i++) {
            System.out.println("SALARIO: ");
            setTxtSalario(leitor.nextDouble());
            setFuncionario(new Funcionario(getTxtSalario()));
            f.add(getFuncionario());
        }
    }

    public void printResult() {
    calculator = new Calculator(getF());
    calculator.mediaSalarial();
    }
    public void tui(){
    printTUI();
    printResult();
    }
}
