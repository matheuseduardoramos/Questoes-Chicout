/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class TUI {

    private List<Pessoa> pessoa;
    private Scanner leitor;
    private double txtAltura;
    private char txtSexo;
    private Pessoa p;
    private Calculator calculator;

    public Calculator getCalculator() {
        return calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public Pessoa getP() {
        return p;
    }

    public void setP(Pessoa p) {
        this.p = p;
    }

    public List<Pessoa> getPessoa() {
        return pessoa;
    }

    public void setPessoa( Pessoa p) {
        pessoa.add(p);
    }

    public double getTxtAltura() {
        return txtAltura;
    }

    public void setTxtAltura(double txtAltura) {
        this.txtAltura = txtAltura;
    }

    public char getTxtSexo() {
        return txtSexo;
    }

    public void setTxtSexo(char txtSexo) {
        this.txtSexo = txtSexo;
    }

    public TUI() {
        leitor = new Scanner(System.in);
        pessoa = new ArrayList<>();
    }

    public void printTUI() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ALTURA: ");
            setTxtAltura(leitor.nextDouble());
            System.out.println("SEXO[M/F]: ");
            setTxtSexo(leitor.next().charAt(0));
            setP(new Pessoa(getTxtAltura(), getTxtSexo()));
            setPessoa((getP()));
        }
    }

    public void printResult() {
        setCalculator(new Calculator(getPessoa()));
        calculator.maiorEMenor();
        calculator.mediaAlturaHomem();
        calculator.cMulher();
    }

    public void tui() {
        printTUI();
        printResult();
    }
}
