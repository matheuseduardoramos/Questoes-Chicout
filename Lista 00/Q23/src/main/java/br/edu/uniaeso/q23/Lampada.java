/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q23;

/**
 *
 * @author mathe
 */
public class Lampada {

    private int voltagem;
    private String cor;
    private String marca;
    private float preco;
    private int potencia;
    private boolean status;

    public Lampada(int voltagem, String cor, String marca, float preco, int potencia) {
        this.voltagem = voltagem;
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
        this.potencia = potencia;
        
    }

    public Lampada() {
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isStatus() {
        return status;
    }

    public void acender() {
        if (isStatus() == true) {
            System.out.println("Lampada já está ligada!");
        } else {
            this.status = true;
            System.out.println("A lampada foi ligada!");
        }
    }

    public void apagar() {
        if (isStatus() == false) {
            System.out.println("Lampada já está desligada!");
        } else {
            this.status = false;
            System.out.println("A lampada foi apagada!");
        }
    }

    @Override
    public String toString() {
        return "Marca: " + this.marca + "\nCor: " + this.cor + "\nPreço: "
                + this.preco + "\nVoltagem: " + this.voltagem + "\nPotência: "
                + this.potencia;
    }

}
