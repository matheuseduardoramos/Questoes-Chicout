/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q20;

/**
 *
 * @author mathe
 */
public class Elevador {

    private int andares;
    private float pesoMax;
    private int maxPessoa;
    private int numPessoa;
    private int andarAtual;
    private float pesoAtual;

    public float getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(float pesoAtual) {
        if (this.pesoAtual + pesoAtual >= 0) {
            this.pesoAtual += pesoAtual;
        }

    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual += andarAtual;
    }

    public Elevador(int andares, float pesoMax, int maxPessoa) {
        this.andares = andares;
        this.pesoMax = pesoMax;
        this.maxPessoa = maxPessoa;
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    public float getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(float pesoMax) {
        this.pesoMax = pesoMax;
    }

    public int getMaxPessoa() {
        return maxPessoa;
    }

    public void setMaxPessoa(int maxPessoa) {
        this.maxPessoa = maxPessoa;
    }

    public int getNumPessoa() {
        return numPessoa;
    }

    public void setNumPessoa(int numPessoa) {
        this.numPessoa += numPessoa;
    }

    public void entra(Pessoa pessoa) {
        if (getNumPessoa() == getMaxPessoa()) {
            System.out.println("ELEVADOR LOTADO!");
        } else {
            if (getPesoAtual() + pessoa.getPeso() <= getPesoMax()) {
                setNumPessoa(1);
                setPesoAtual(pessoa.getPeso());
            } else {
                System.out.println("ELEVADOR NAO SUPORTARA O PESO!");
            }
        }
    }

    public void sai(Pessoa pessoa) {
        if (getNumPessoa() > 0) {
            setNumPessoa(-1);
            setPesoAtual(-pessoa.getPeso());
        } else {
            System.out.println("ELEVADOR VAZIO!");
        }
    }

    public void sobe() {
        if (getAndarAtual() + 1 > getAndares()) {
            System.out.println("NAO E POSSIVEL SUBIR MAIS!");
        } else {
            setAndarAtual(1);
            System.out.println(getAndarAtual() + " ANDAR");
        }
    }

    public void desce() {
        if (getAndarAtual() - 1 < 0) {
            System.out.println("ESTAMOS NO TERREO");
        } else {
            setAndarAtual(-1);
            if (getAndarAtual() == 0) {
                System.out.println("TERREO");
            } else {
                System.out.println(getAndarAtual() + " ANDAR");

            }

        }
    }
}
