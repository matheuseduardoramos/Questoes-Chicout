/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q7;

import java.util.Scanner;


public class TUI {
private double txtDMaior;
private double txtDMenor;
private Losango losango;
private Calculador calculador;
private Scanner leitor;

    public TUI() {
        leitor = new Scanner(System.in);
    }
    public void printTui(){
    
        System.out.println("Digite o Diagonal maior");
        setTxtDMaior(leitor.nextDouble());
        System.out.println("Digite o Diagonal menor");        
        setTxtDMenor(leitor.nextDouble());
        setLosango(new Losango(getTxtDMaior(),getTxtDMenor()));
        setCalculador(new Calculador(getLosango()));
    }
    public void printResult(){
        System.out.println("A AREA DO LOSANGO É: "+calculador.area());
    }
    public void tui(){
    printTui();
    printResult();
    }
    public double getTxtDMaior() {
        return txtDMaior;
    }

    public void setTxtDMaior(double txtDMaior) {
        this.txtDMaior = txtDMaior;
    }

    public double getTxtDMenor() {
        return txtDMenor;
    }

    public void setTxtDMenor(double txtDMenor) {
        this.txtDMenor = txtDMenor;
    }

    public Losango getLosango() {
        return losango;
    }

    public void setLosango(Losango losango) {
        this.losango = losango;
    }

    public Calculador getCalculador() {
        return calculador;
    }

    public void setCalculador(Calculador calculador) {
        this.calculador = calculador;
    }

}
