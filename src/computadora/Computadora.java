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
public class Computadora {

//declaro los atributos 
    private int año;
    private String modelo;
    private String marca;
    private double capacidadprocesador;
    private boolean portatil;

    // declaro metodos
    public void guardarInformacion(String[] args) {
        System.out.println("Hola soy la computadora y guardo informacíon");
    }

    public void leerInformación() {
        System.out.println("Hola soy la computadora y leo informacíon");
    }
    public void imprimirInformacion(String info){
        System.out.println(info);
    }

    public static void main(String[] args) {
        Computadora primerobjeto=new Computadora();//he creado mi primer objeto.
        primerobjeto.leerInformación();//llama a un método
        primerobjeto.imprimirInformacion("HOLA");
        primerobjeto.imprimirInformacion("CHAO");
     
    }

}
