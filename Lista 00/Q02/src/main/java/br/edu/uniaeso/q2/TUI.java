/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q2;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class TUI {
    private Scanner leitor;
    private Terreno terreno;
    private Calculador calculador;
    private double txtLado;
    private double txtAltura;

    public TUI() {
        leitor = new Scanner(System.in);
    }
    public void printTui(){
        System.out.println("Digite a Altura do terreno: ");
        setTxtAltura(leitor.nextDouble());
        System.out.println("Digite o Lado do terreno: ");
        setTxtLado(leitor.nextDouble());
        setTerreno(new Terreno(getTxtAltura(),getTxtLado()));
        setCalculador(new Calculador(getTerreno()));
       }

    public Calculador getCalculador() {
        return calculador;
    }

    public void setCalculador(Calculador calculador) {
        this.calculador = calculador;
    }

    public double getTxtLado() {
        return txtLado;
    }

    public void setTxtLado(double txtLado) {
        this.txtLado = txtLado;
    }

    public double getTxtAltura() {
        return txtAltura;
    }

    public void setTxtAltura(double txtAltura) {
        this.txtAltura = txtAltura;
    }

    public Terreno getTerreno() {
        return terreno;
    }

    public void setTerreno(Terreno terreno) {
        this.terreno = terreno;
    }
    public void printResult(){
     System.out.println("A area do terro é: "+ calculador.area()+ "m²");
    }
    public void tui(){
    printTui();
    printResult();
    }
}
