/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q15;

/**
 *
 * @author mathe
 */
public class Termometro {
    private double celsius;
    private double kelvin = celsius + 273.15;
    private double reaumur = celsius * 0.8;
    private double rankine = celsius * 1.8 + 32 + 459.67;
    private double fahrenheit = celsius * 1.8+32;

    public Termometro() {
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    @Override
    public String toString() {
        return "Termometro{" + "celsius=" + celsius + ", kelvin=" + kelvin + ", reaumur=" + reaumur + ", rankine=" + rankine + ", fahrenheit=" + fahrenheit + '}';
    }
    
    
    
}
