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

    //Constructor
    public Materia() {
        temasPorDefecto();
    }

    public Materia(String codigoMateria, String nombreMateria) {
        this.codigoMateria = codigoMateria;
        this.nombreMateria = nombreMateria;
        this.temas = new ArrayList();
    }

    public Materia(String codigoMateria, String nombreMateria, Tema unTema) {
        this.codigoMateria = codigoMateria;
        this.nombreMateria = nombreMateria;
        this.temas = new ArrayList();
    }

    //Datos en tema
    public void temasPorDefecto() {

        Tema unTema1 = new Tema("poo", "Programacion Orientada a Objetos - POO", "15/08/20");
        Tema unTema2 = new Tema("mates", "Matematicas", "09/07/2018");
        Tema unTema3 = new Tema("comun", "Comunicacion", "11/06/2019");

        this.temas.add(unTema1);
        this.temas.add(unTema2);
        this.temas.add(unTema3);

        //Tema tema1 = new Tema("1", "la fecha", "POO",conocimientos[], ejercicios[],investigaciones[]);
        //temas.add(tema1);
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

    //Imprimir datos de las materias
    public void imprimirDatoMateria() {
        System.out.println("Código: " + codigoMateria);
        System.out.println("Nombre: " + nombreMateria);
    }

    //Buscar tema
    public Tema buscarTema(String codigoTema) {
        Tema unTema;
        for (int i = 0; i < temas.size(); i++) {
            unTema = temas.get(i);
            if (codigoTema.equals(unTema.getCodigoTema())) {
                return unTema;
            }
        }
        return null;
    }

    //REGISTRAR TEMA A MATERIA
    public void RegistrarTemaporMateria() {
        System.out.println("Ingrese el código del tema: ");
        String codigoTema = entrada.nextLine();
        Tema unTema = buscarTema(codigoTema);
        if (unTema != null) {
            unTema.imprimirDatoTema();
            unTema = new Tema();
            this.temas.add(unTema);
            System.out.println("Se ha registrado un nuevo tema en la materia");
        } else {
            System.out.println("El código no existe. Verifique he intente nuevamente");
        }
    }

    //Buscar temas por materia
    public void imprimirTemaMateria() {
        //System.out.println();
        if (temas.size() > 0) {
            //System.out.println("Los temas de la materia son:");
            for (int cont = 0; cont < temas.size(); cont++) {
                Tema unTema = temas.get(cont);
                if (unTema != null) { //VER
                    System.out.println("Fecha: " + unTema.getFechaTema() + " Código del tema: " + unTema.getCodigoTema() + " Nombre del tema: " + unTema.getNombreTema());
                }
            }
            System.out.println();
            System.out.println("Ingrese el código del tema que desea ver: ");
            String codigoTema = entrada.nextLine();
            Tema unTema = buscarTema(codigoTema);
            if (unTema != null) {
                unTema.submenuTema();
            } else {
                System.out.println("El código no existe. Intentelo nuevamente");
            }
        } else {
            System.out.println("La materia no posee temas");
        }
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
