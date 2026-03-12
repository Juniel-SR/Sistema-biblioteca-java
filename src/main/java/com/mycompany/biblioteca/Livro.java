/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author juniel
 */
public class Livro {
    String titulo;
    String autor;
    int ano;
    boolean disponivel;
    
    public Livro(String titulo, String autor, int ano){
    
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = true;
        
    }
    public void emprestarLivro(){
        if(disponivel){
         disponivel = false;
         System.out.println("O livro foi emprestado com sucesso.");
    }
        else{
         System.out.println("O livro está indisponivel no momento.");
    }}
    public void devolverLivro(){
        disponivel = true;
        System.out.println("Devolução do livro realizada.");
    }
    public void mostrarInformacoes(){
        System.out.println("Título:" + titulo);
        System.out.println("Autor:" + autor);
        System.out.println("Ano:" + ano);
        System.out.println("Disponivel:" + disponivel);
    }
}
