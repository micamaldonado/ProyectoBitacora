/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Materia {

    static Scanner entrada = new Scanner(System.in);
    String codigoMateria;
    String nombreMateria;
    public ArrayList<Tema> temas;

    public Materia() {
    }
    //Constructor

    public Materia(String codigoMateria, String nombreMateria) {
        this.codigoMateria = codigoMateria;
        this.nombreMateria = nombreMateria;
        temas = new ArrayList();
    }

    //Imprimir datos de las materias
    public void imprimirDatoMateria() {
        System.out.print("Código: " + codigoMateria);
        System.out.print("Nombre: " + nombreMateria);
    }

    //Buscar temas por materia
    public void imprimirTemaMateria() {
        System.out.println();
        if (temas.size() > 0) {
            System.out.println("Los temas de la materia son:");
            for (int cont = 0; cont < temas.size(); cont++) {
                Tema unTema = temas.get(cont);
                if (unTema != null) { //VER
                    System.out.println("En fecha: " + unTema.getFechaTema() + "Código del tema: " + unTema.getCodigoTema() + "Nombre del tema: " + unTema.getNombreTema());
                } else {
                    System.out.println("La materia todavía no tiene ningún tema");
                }
            }
        }
    }

    //Registrar temas
    public void registrarTema() {
        System.out.println("Ingrese la fecha: ");
        String fechaTema = entrada.nextLine();
        System.out.println("Ingrese el código del tema: ");
        String codigoTema = entrada.nextLine();
        System.out.println("Ingrese el nombre del tema: ");
        String nombreTema = entrada.nextLine();
        System.out.println("");

        Tema unTema = new Tema(fechaTema, codigoTema, nombreTema);
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
