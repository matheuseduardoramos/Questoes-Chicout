/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q22;

/**
 *
 * @author mathe
 */
public class Caneta {
    private String Marca;
    private String Cor;
    private double tamanho;

    public Caneta(String Marca, String Cor, double tamanho) {
        this.Marca = Marca;
        this.Cor = Cor;
        this.tamanho = tamanho;
    }

    public Caneta() {
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Caneta:\nMarca: " + Marca + "\nCor: " + Cor
                + "\ntamanho: " + tamanho +"cm";
    }
}
