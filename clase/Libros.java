/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ari.Clase2;

/**
 *
 * @author diosc
 */
public class Libros {
    
    private int Id;
    private String NombreLibro;
    private int NumeroPaginas;
    private String Autor;
    
    public Libros(int pId,String pNombreLibro, int pNumeroPaginas,String pAutor){
        
    Id = pId;
    NombreLibro = pNombreLibro;
    NumeroPaginas = pNumeroPaginas;
    Autor = pAutor;
    
        
    }
// get se utiliza para recuperar información
    public int getId() {
        return Id;
    }
// set se utiliza para modificar información
    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombreLibro() {
        return NombreLibro;
    }

    public void setNombreLibro(String NombreLibro) {
        this.NombreLibro = NombreLibro;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int NumeroPaginas) {
        this.NumeroPaginas = NumeroPaginas;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "Libros{" + "Id=" + Id + ", NombreLibro=" + NombreLibro + ", NumeroPaginas=" + NumeroPaginas + ", Autor=" + Autor + '}';
    }
    
    
    
    
}
