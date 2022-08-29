/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q1;

/**
 *
 * @author mathe
 */
public class Substituidor {
    private Frase frase;

    public Substituidor(Frase frase) {
        this.frase = frase;
    }
    
    public String alterarFrase( String novapalavra,String palavraAntiga)
{ 
   return frase.toString().replace(palavraAntiga, novapalavra);
}


}
