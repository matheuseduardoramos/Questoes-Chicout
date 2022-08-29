/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q1;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class TUI {

    private Scanner leitor;
    private String palavraVelha;
    private String palavraNova;
    private Frase frase;
    private Substituidor sub;

    public TUI() {
        leitor = new Scanner(System.in);
    }
    public void tui(){
    printTUI();
    printResult();
    }
    public void printTUI() {

        System.out.println("Digite uma Frase: ");
        setFrase(new Frase(leitor.nextLine()));
        System.out.println("digite a palavra que deseja alterar da frase anterior");
        setPalavraVelha(leitor.nextLine());
        System.out.println("digite a nova palavra");
        setPalavraNova(leitor.nextLine());
        setSub(new Substituidor(frase));
        
    }
    public void printResult(){
        System.out.println(sub.alterarFrase( 
                this.palavraNova,this.palavraVelha));
        
    }

    public Substituidor getSub() {
        return sub;
    }

    public void setSub(Substituidor sub) {
        this.sub = sub;
    }
    public String getPalavraVelha() {
        return palavraVelha;
    }

    public void setPalavraVelha(String palavraVelha) {
        this.palavraVelha = palavraVelha;
    }

    public String getPalavraNova() {
        return palavraNova;
    }

    public void setPalavraNova(String palavraNova) {
        this.palavraNova = palavraNova;
    }

    public Frase getFrase() {
        return frase;
    }

    public void setFrase(Frase frase) {
        this.frase = frase;
    }
}
