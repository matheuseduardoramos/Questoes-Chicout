/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q23;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class LampadaTeste {

    private Lampada lampadaA;
    private Lampada lampadaB;
    private Scanner leitor;
    private int txtVoltagem;
    private String txtCor;
    private String txtMarca;
    private float txtPreco;
    private int txtPotencia;

    public int getTxtVoltagem() {
        return txtVoltagem;
    }

    public void setTxtVoltagem(int txtVoltagem) {
        this.txtVoltagem = txtVoltagem;
    }

    public String getTxtCor() {
        return txtCor;
    }

    public void setTxtCor(String txtCor) {
        this.txtCor = txtCor;
    }

    public String getTxtMarca() {
        return txtMarca;
    }

    public void setTxtMarca(String txtMarca) {
        this.txtMarca = txtMarca;
    }

    public float getTxtPreco() {
        return txtPreco;
    }

    public void setTxtPreco(float txtPreco) {
        this.txtPreco = txtPreco;
    }

    public int getTxtPotencia() {
        return txtPotencia;
    }

    public void setTxtPotencia(int txtPotencia) {
        this.txtPotencia = txtPotencia;
    }

    public LampadaTeste() {
        leitor = new Scanner(System.in);

    }

    public Lampada getLampadaA() {
        return lampadaA;
    }

    public void setLampadaA(Lampada lampadaA) {
        this.lampadaA = lampadaA;
    }

    public Lampada getLampadaB() {
        return lampadaB;
    }

    public void setLampadaB(Lampada lampadaB) {
        this.lampadaB = lampadaB;
    }

    public void cadastrarLampada() {
        System.out.println("Marca Lampada A: ");
        setTxtMarca(leitor.nextLine());
        System.out.println("Cor Lampada A: ");
        setTxtCor(leitor.nextLine());
        System.out.println("Preço Lampada A:");
        setTxtPreco(leitor.nextFloat());
        System.out.println("Voltagem Lampada A: ");
        setTxtVoltagem(leitor.nextInt());
        System.out.println("Potência Lampada A: ");
        setTxtPotencia(leitor.nextInt());
        leitor.nextLine();
        setLampadaA(new Lampada(getTxtVoltagem(), getTxtCor(), getTxtMarca(),
                getTxtPreco(), getTxtPotencia()));

        System.out.println("Marca Lampada B: ");
        setTxtMarca(leitor.nextLine());
        System.out.println("Cor Lampada B: ");
        setTxtCor(leitor.nextLine());
        System.out.println("Preço Lampada B:");
        setTxtPreco(leitor.nextFloat());
        System.out.println("Voltagem Lampada B: ");
        setTxtVoltagem(leitor.nextInt());
        System.out.println("Potência Lampada B: ");
        setTxtPotencia(leitor.nextInt());
        leitor.nextLine();
        setLampadaB(new Lampada(getTxtVoltagem(), getTxtCor(), getTxtMarca(),
                getTxtPreco(), getTxtPotencia()));
    }

    public void comparacao() {
        System.out.println("Lampada A:");
        System.out.println(getLampadaA());
        System.out.println("Lampada B:");
        System.out.println(getLampadaB());
        if (getLampadaA().getPotencia() == getLampadaB().getPotencia()) {
            System.out.println("As duas lampadas possuem a mesma potencia!");
        } else {
            if (getLampadaA().getPotencia() > getLampadaB().getPotencia()) {
                System.out.println("A lampada A é mais Potente!");
            } else {
                System.out.println("A lampada B é mais Potente!");
            }
        }

        if (getLampadaA().getPreco() == getLampadaB().getPreco()) {
            System.out.println("As duas lampadas possuem o mesmo preço!");
        } else {
            if (getLampadaA().getPreco() > getLampadaB().getPreco()) {
                System.out.println("A lampada A é mais cara!");
            } else {
                System.out.println("A lampada B é mais cara!");
            }
        }
    }

    public void lampadaTeste() {
        cadastrarLampada();
        comparacao();
    }
}
