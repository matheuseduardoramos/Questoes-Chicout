/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q5;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class TUI {
    private double txtCatetoA;
    private double txtCatetoO;
    private Triangulo triangulo;
    private Scanner leitor;

    public TUI() {
        this.leitor = new Scanner(System.in);
    }
    
    public void printTUI(){
        System.out.println("Digite o Cateto Adjacente");
        setTxtCatetoA(leitor.nextDouble());
        System.out.println("Digite o Cateto Oposto");        
        setTxtCatetoO(leitor.nextDouble());
        setTriangulo(new Triangulo(txtCatetoA,txtCatetoO));
        
    }
    public void printResult(){
        System.out.println("O valor da hipotenusa é: "+ triangulo.hipotenusa());
    }
    public void tui(){
    printTUI();
    printResult();
    }
    public double getTxtCatetoA() {
        return txtCatetoA;
    }

    public void setTxtCatetoA(double txtCatetoA) {
        this.txtCatetoA = txtCatetoA;
    }

    public double getTxtCatetoO() {
        return txtCatetoO;
    }

    public void setTxtCatetoO(double txtCatetoO) {
        this.txtCatetoO = txtCatetoO;
    }

    public Triangulo getTriangulo() {
        return triangulo;
    }

    public void setTriangulo(Triangulo triangulo) {
        this.triangulo = triangulo;
    }
    
}
