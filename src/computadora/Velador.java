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
public class Velador {

    private String color;
    private double tamaño;
    private String diseño;
    private String peso;

    //métodos
    public void Guardar() {
        System.out.println("soy el velador y soy muy útil");
    }

    public void Asentar() {
        System.out.println("Guardo y asiento cosas");

    }

    public void imprimir(String info) {
        System.out.println(info);
    }

    public static void main(String[] args) {
        Velador objeto = new Velador();
        objeto.Guardar();
        objeto.Asentar();
    }
}
