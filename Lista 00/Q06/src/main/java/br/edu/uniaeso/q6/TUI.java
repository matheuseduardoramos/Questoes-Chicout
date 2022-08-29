/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q6;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class TUI {
    private double txtFunc;
    private double txtMin;
    private SalarioMin min;
    private SalarioFuncionario funcionario;
    private Comparador comparador;
    private Scanner leitor;

    public TUI() {
    leitor = new Scanner(System.in);
    }
    public void printTui(){
    
        System.out.println("Digite o salario minimo");
        setTxtMin(leitor.nextDouble());
        setMin(new SalarioMin(txtMin));
        System.out.println("Digite salario do funcionario");        
        setTxtFunc(leitor.nextDouble());
        setFuncionario(new SalarioFuncionario(txtFunc));
        setComparador(new Comparador(funcionario, min));
    }
    public void printResult(){
    System.out.println("o Funcionario recebe "+comparador.comparar()+"x o salario minimo");
    }
    public void tui(){
    printTui();
    printResult();
    }
    public double getTxtFunc() {
        return txtFunc;
    }

    public void setTxtFunc(double txtFunc) {
        this.txtFunc = txtFunc;
    }

    public double getTxtMin() {
        return txtMin;
    }

    public void setTxtMin(double txtMin) {
        this.txtMin = txtMin;
    }

    public SalarioMin getMin() {
        return min;
    }

    public void setMin(SalarioMin min) {
        this.min = min;
    }

    public SalarioFuncionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(SalarioFuncionario funcionario) {
        this.funcionario = funcionario;
    }

    public Comparador getComparador() {
        return comparador;
    }

    public void setComparador(Comparador comparador) {
        this.comparador = comparador;
    }
}
