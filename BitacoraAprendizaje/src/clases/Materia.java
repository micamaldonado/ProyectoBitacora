/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static clases.Tema.entrada;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Materia {

    private String codigoMateria;
    private String nombreMateria;
    public ArrayList<Tema> temas;

    public Materia() {
    }
//Constructor

    public Materia(String codigoMateria, String nombreMateria) {
        this.codigoMateria = codigoMateria;
        this.nombreMateria = nombreMateria;
        temas = new ArrayList();
    }
//Ver imprimirTemaMateria

    // Imprimir datos de las materias
    public void imprimirDatoMateria() {
        System.out.print("Código: " + codigoMateria);
        System.out.print("Nombre: " + nombreMateria);
    }
//Imprimir Temas de Materias ??
//      public void imprimirTemaMateria() {
//           System.out.print("Nombre de la materia: ");
//        String nombreMateria = entrada.nextLine();
//        Materia unaMateria = buscarTemaMateria(nombreMateria);
//    if (unaMateria != null) {
//            unaMateria.imprimirTemaMateria();
//        } else {
//            System.out.println("El nombre ingresado no existe");
//        }
//    }

    //Registrar temas
    public void registrarTema() {
        System.out.println("Ingrese el código del tema: ");
        String codigoTema = entrada.nextLine();
        System.out.println("Ingrese el nombre del tema: ");
        String nombreTema = entrada.nextLine();
        System.out.println("Ingrese la fecha: ");
        String fechaTema = entrada.nextLine();
        System.out.println("");

        Tema unTema = new Tema(codigoTema, nombreTema, fechaTema);
        this.temas.add(unTema);

        System.out.println("¡LOS DATOS DEL TEMA HAN SIDO CARGADOS SATISFACTORIAMENTE!");
        System.out.println();
    }

    //Getters y Setters
    public String getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public ArrayList<Tema> getTemas() {
        return temas;
    }

    public void setTemas(ArrayList<Tema> temas) {
        this.temas = temas;
    }

}
