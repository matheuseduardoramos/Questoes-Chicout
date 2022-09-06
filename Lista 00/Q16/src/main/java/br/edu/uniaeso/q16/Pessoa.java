/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q16;

/**
 *
 * @author mathe
 */
public class Pessoa {

    private double altura;
    private boolean sexo;

    public Pessoa(double altura, char sexo) {
        setAltura(altura);
        setSexo(sexo);
    }

    public Pessoa() {
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if ((sexo == 'm') || (sexo == 'M')) {
            this.sexo = true;
        } else {
            if ((sexo == 'f') || (sexo == 'F')) {
                this.sexo = false;
            } else {
                System.out.println("opcao invalida!");
            }
        }
    }

    @Override
    public String toString() {
        if (isSexo() == true) {
            return "altura: " + altura + "\nsexo: Masculino";
        } else {
            return "altura: " + altura + "\nsexo: Feminino";
        }
    }

}
