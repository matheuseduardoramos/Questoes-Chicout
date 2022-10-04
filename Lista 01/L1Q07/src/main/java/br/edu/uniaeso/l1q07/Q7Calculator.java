/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.l1q07;

import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class Q7Calculator {

    private ArrayList<Integer> numeros;

    public Q7Calculator() {
        numeros = new ArrayList<>();

    }

    public void adicionarNum(int num) {
        getNumeros().add(num);
    }

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

}
