/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q3;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class TUI {

    private Scanner leitor;
    private Cavalos cavalos;
    private Haras haras;
    private CalculadorFerraduras calculadorFerraduras;
    private int txtNCavalos;

    public Cavalos getCavalos() {
        return cavalos;
    }

    public int getTxtNCavalos() {
        return txtNCavalos;
    }

    public void setTxtNCavalos(int txtNCavalos) {
        this.txtNCavalos = txtNCavalos;
    }

    public void setCavalos(Cavalos cavalos) {
        this.cavalos = cavalos;
    }

    public Haras getHaras() {
        return haras;
    }

    public void setHaras(Haras haras) {
        this.haras = haras;
    }

    public CalculadorFerraduras getCalculadorFerraduras() {
        return calculadorFerraduras;
    }

    public void setCalculadorFerraduras(CalculadorFerraduras calculadorFerraduras) {
        this.calculadorFerraduras = calculadorFerraduras;
    }

    public TUI() {
        leitor = new Scanner(System.in);
    }

    public void printTui() {
        System.out.println("Digite o total de cavalos: ");
        setTxtNCavalos(leitor.nextInt());
        setHaras(new Haras(txtNCavalos));
        cavalos = new Cavalos();

    }

    public void solve() {
        calculadorFerraduras = new CalculadorFerraduras(getCavalos(),getHaras());
        calculadorFerraduras.setFerradura();
    }

    public void printResult() {
        System.out.println("Você vai precisar comprar " + calculadorFerraduras.getFerradura() + " Ferraduras");
    }

    public void tui() {
        printTui();
        solve();
        printResult();
    }

}
