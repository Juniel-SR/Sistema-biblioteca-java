/*
 * Sistema de Biblioteca
 * Autor: Juniel
 * Projeto para prática de Java e POO
 */
package com.mycompany.biblioteca;
   import java.util.ArrayList;
   import java.util.Scanner;
public class Biblioteca {

    public static void main(String[] args) { 
        ArrayList<Livro> livros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        livros.add(new Livro("Os Três Mosqueteiros", "Alexandre Dumas", 1844));
        livros.add(new Livro("A Arte da Guerra", "Nicolau Maquiave", 1521));
        livros.add(new Livro("O Nome da Rosa", "Umberto Eco", 1327));
        
        System.out.println("Livros da biblioteca:");
         for (Livro l : livros){
         l.mostrarInformacoes();
         System.out.println();
         }
         
        livros.get(0).emprestarLivro();
        System.out.println("O livro foi emprestado.");
        
        livros.get(0).mostrarInformacoes();
        livros.get(1).mostrarInformacoes();
        
        livros.get(0).devolverLivro();
        
        livros.get(0).mostrarInformacoes();
        livros.get(1).mostrarInformacoes();
   
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();
        
        System.out.println("Digite o autor do livro:");
        String autor = scanner.nextLine();
        
        System.out.println("Digite o ano do livro:");
        int ano = scanner.nextInt();
        
        Livro livro = new Livro(titulo, autor, ano);
        livros.add(livro);
    }
}
