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
public class Copiadora {

    //declaro atributos
    private String marca;
    private Double tamaño;
    private Double precio;
    private Double peso;

    //declaro métodos
    public void imprimirDocumentos(String[] args) {
        System.out.println("Hola soy una copiadora imprimo documentos y me usan :C");
    }

    public void escanearDocumentos() {
        System.out.println("También escaneo documentos");
    }

    public void CopiarDocumentos() {
        System.out.println("Y copio documentos");
    }

    public static void main(String[] args) {
        Copiadora objeto = new Copiadora();
        objeto.imprimirDocumentos(args);
        objeto.escanearDocumentos();
        objeto.CopiarDocumentos();
    }
}
