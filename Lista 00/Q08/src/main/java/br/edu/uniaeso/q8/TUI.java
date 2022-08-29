package br.edu.uniaeso.q8;

import java.util.Scanner;

public class TUI {
    private double txtXCoord;
    private double txtYCoord;
    private Scanner leitor;
    private Ponto p1,p2;


    private double distancia;

    public TUI() {
        this.leitor = new Scanner(System.in);
    }
    public void tui(){
        printTUI();
        solve();
        printResult();
    }
    private void printTUI(){
        System.out.println("P1 x:");
        setTxtXCoord(leitor.nextDouble());
        System.out.println("P1 Y:");
        setTxtYCoord(leitor.nextDouble());
        setP1(new Ponto(getTxtXCoord(),getTxtXCoord()));
        System.out.println("P2 x:");
        setTxtXCoord(leitor.nextDouble());
        System.out.println("P2 Y:");
        setTxtYCoord(leitor.nextDouble());
        setP2(new Ponto(getTxtXCoord(),getTxtYCoord()));
    }
    public void solve(){
       setDistancia(GeometryUtils.distancia(getP1(),getP2()));
    }
    public void printResult(){
        System.out.println("A distancia entre os pontos p1"+getP1()+"p2 "+getP2());
        System.out.println(getDistancia());
    }
    public double getTxtXCoord() {
        return txtXCoord;
    }

    public void setTxtXCoord(double txtXCoord) {
        this.txtXCoord = txtXCoord;
    }

    public double getTxtYCoord() {
        return txtYCoord;
    }

    public void setTxtYCoord(double txtYCoord) {
        this.txtYCoord = txtYCoord;
    }

    public Scanner getLeitor() {
        return leitor;
    }

    public void setLeitor(Scanner leitor) {
        this.leitor = leitor;
    }

    public Ponto getP1() {
        return p1;
    }

    public void setP1(Ponto p1) {
        this.p1 = p1;
    }

    public Ponto getP2() {
        return p2;
    }

    public void setP2(Ponto p2) {
        this.p2 = p2;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
}
