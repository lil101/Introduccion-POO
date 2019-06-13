/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora;

/**
 *
 * @author ISTLOJAV
 */
public class Cuaderno {
    private Double tamaño;
    private String color;
    //métodos
    public void Escribir(){
        System.out.println("Sirvo para almacenar escritura");
    }
    public void Dibujar(){
        System.out.println(" Pueden plasmar su imagicaion al dibujar en mi");
    }
    public void Colorear(){
        System.out.println("Y también colorear");
    }
    public static void main(String[] args) {
        Cuaderno objeto=new Cuaderno();
        objeto.Escribir();
        objeto.Dibujar();
        objeto.Colorear();
    }
}
