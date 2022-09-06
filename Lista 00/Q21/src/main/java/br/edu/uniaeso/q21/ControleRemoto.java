/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q21;

/**
 *
 * @author mathe
 */
public class ControleRemoto {

    private int volume;
    private int canalAtual;
    private int totalCanais;

    public int getCanalAtual() {
        return canalAtual;
    }

    public void setCanalAtual(int canalAtual) {
        if (canalAtual > 1) {
            this.canalAtual = canalAtual;
        } else {
            if (this.canalAtual + canalAtual > getTotalCanais()) {
                this.canalAtual = 1;
            } else {
                if (this.canalAtual + canalAtual <= 0) {
                    this.canalAtual = getTotalCanais();
                } else {
                    this.canalAtual += canalAtual;
                }

            }
        }
    }

    public int getTotalCanais() {
        return totalCanais;
    }

    public void setTotalCanais(int totalCanais) {
        this.totalCanais = totalCanais;
    }

    public ControleRemoto(int totalCanais) {
        this.totalCanais = totalCanais;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (this.volume + volume > 10) {
            System.out.println("VOLUME MAXIMO");
        } else {
            if (this.volume + volume < 0) {
                System.out.println("JA ESTA SEM SOM");

            } else {
                this.volume += volume;
            }
        }

    }

    public void aumentar() {
        setVolume(1);
        System.out.println("VOLUME: " + getVolume());
    }

    public void diminuir() {
        setVolume(-1);
        System.out.println("VOLUME: " + getVolume());
    }

    public void proxCanal() {
        setCanalAtual(1);
        System.out.println("CANAL: " + getCanalAtual());
    }

    public void voltaCanal() {
        setCanalAtual(-1);
        System.out.println("CANAL: " + getCanalAtual());
    }

    public void irParaCanal(int canal) {
        setCanalAtual(canal);
        System.out.println("CANAL: " + getCanalAtual());
    }
}
