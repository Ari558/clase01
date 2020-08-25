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
public class claseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //    System.out.println("Hola");
//        System.out.println(libro.toString());
//        System.out.println(ObjetoLibro2.getNumeroPaginas());


        Libros ObjetoLibro1 = new Libros(1, "PROGRAMACION JAVA", 100, "Deitel");
        Libros ObjetoLibro2 = new Libros(2, "PROGRAMACION PHP", 600, "Deitel");

        ObjetoLibro1.setNumeroPaginas(800);


        if (ObjetoLibro1.getNumeroPaginas() < ObjetoLibro2.getNumeroPaginas()) {
            System.out.println("El libro 2 tiene mayor numero de paginas que el libro 1, el libro 1 tiene un numero de paginas de "+ObjetoLibro2.getNumeroPaginas());
            System.out.println("La informacion de el liblro 2 es "+ObjetoLibro2.toString());
        } else {
            System.out.println("El libro 1 tiene mayor numero de paginas que el libro 2, el libro 2 tiene un numero de paginas de "+ObjetoLibro1.getNumeroPaginas());
            System.out.println("La informacion de el liblro 1 es "+ObjetoLibro1.toString());
        }

    }

}
