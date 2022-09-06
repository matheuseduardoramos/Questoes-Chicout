/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q18;


/**
 *
 * @author mathe
 */
public class Pessoa {

    private String nome;
    private Data nasc;
    private float altura;

    public Pessoa(String nome, Data nasc, float altura) {
        this.nome = nome;
        this.nasc = nasc;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNasc() {
        return nasc;
    }

    public void setNasc(Data nasc) {
        this.nasc = nasc;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int idade() {
        if (getNasc().getNow().getDayOfMonth() - getNasc().getDia()<= 0 && 
                (getNasc().getNow().getMonthValue() - getNasc().getMes() >= 0))  {
            return getNasc().getNow().getYear() - getNasc().getAno();
        }else{
        return (getNasc().getNow().getYear() - getNasc().getAno()) - 1;
        }
    }

    @Override
    public String toString() {
        return   "nome: " + nome + "\naltura: " + altura+"m\nidade: "+idade();
    }
    
}
