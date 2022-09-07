/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.q27;

/**
 *
 * @author mathe
 */
public class Livro {

    private String titulo;
    private String autor;
    private int nPags;
    private int idLivro;

    public Livro(String titulo, String autor, int nPags, int idLivro) {
        this.titulo = titulo;
        this.autor = autor;
        this.nPags = nPags;
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getnPags() {
        return nPags;
    }

    public void setnPags(int nPags) {
        this.nPags = nPags;
    }

    @Override
    public String toString() {
        return "\nLivro {" + "titulo = " + titulo + ", autor = " + autor
                + ", nPags = " + nPags + "Id: " + idLivro
                + '}';
    }
}
