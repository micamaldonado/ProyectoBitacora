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
public class Tema {

    static Scanner entrada = new Scanner(System.in);

    String codigoTema;
    String nombreTema;
    String fechaTema;
    public ArrayList<Investigacion> investigaciones;
    public ArrayList<Conocimiento> conocimientos;
    public ArrayList<Ejercicio> ejercicios;

    //Constructor vacio
    public Tema() {

    }

    //Constructor con parametros
    public Tema(String codigoTema, String nombreTema, String fechaTema) {
        this.codigoTema = codigoTema;
        this.nombreTema = nombreTema;
        this.fechaTema = fechaTema;
        investigaciones = new ArrayList();
        conocimientos = new ArrayList();
        ejercicios = new ArrayList();
    }

    //Imprimir datos básicos del tema
    public void imprimirDatoTema() {
        System.out.print("Código: " + codigoTema); //SALTO
        System.out.print("Nombre: " + nombreTema); //SALTO
        System.out.print("Fecha: " + fechaTema); //SALTO
        //VER SI HACE FALTA IMPRIMIR SUS ARRAYS?
    }

    //Imprimir los temas pendientes
    public void imprimirTemasPendientes() {
        if (conocimientos.size() > 0) {
            System.out.println("Los temas pendientes son: ");
            for (int i = 0; i < conocimientos.size(); i++) {
                Conocimiento unConocimiento = conocimientos.get(i);
                if (unConocimiento.isAprendido() == false) {
                    System.out.println("Concepto: " + unConocimiento.getConceptoConocimiento()); //CREO QUE ACA SOLO ESTO
                }
            }
        } else {
            System.out.println("No hay temas pendientes");
        }
    }

    //Imprimir temas NO pendientes
    public void imprimirTemasNOPendientes() {
        if (conocimientos.size() > 0) {
            System.out.println("Los temas aprendidos son: ");
            for (int i = 0; i < conocimientos.size(); i++) {
                Conocimiento unConocimiento = conocimientos.get(i);
                if (unConocimiento.isAprendido() == true) {
                    System.out.println("Concepto: " + unConocimiento.getConceptoConocimiento()); //CREO QUE ACA SOLO ESTO
                }
            }
        } else {
            System.out.println("No hay temas aprendidos");
        }

    }

    //Registrar Ejercicio
    public void registrarEjercicio() {
        //VER DE MICA
    }

    //Registrar Investigacion
    public void registrarInvestigacion() {

        System.out.println("Ingrese el tema investigado: ");
        String temaInvestigado = entrada.nextLine();
        System.out.println("Ingrese el tiempo dedicado a la investigación: ");
        String tiempoDedicadoInv = entrada.nextLine();
        System.out.println("Ingrese sus comentarios: ");
        String comentarios = entrada.nextLine();
        System.out.println("Ingrese sus dudas: ");
        String dudasInvestigacion = entrada.nextLine();
        System.out.println("Ingrese su nivel de comprensión: ");
        double nivelComprension = entrada.nextDouble();
        System.out.println("");

        Investigacion unaInvestigacion = new Investigacion(temaInvestigado, tiempoDedicadoInv, comentarios, dudasInvestigacion, nivelComprension);
        this.investigaciones.add(unaInvestigacion);

        System.out.println("¡LOS DATOS DE INVESTIGACIÓN HAN SIDO CARGADOS SATISFACTORIAMENTE!");
        System.out.println();
    }

    //Registrar Conocimiento
    public void registrarConocimiento() {
        System.out.println("Ingrese el concepto desarrollado: ");
        String conceptoConocimiento = entrada.nextLine();
        System.out.println("Ingrese la descripcion del mismo: ");
        String descripcionConocimiento = entrada.nextLine();
        System.out.println("Ingrese sus dudas: ");
        String dudasConocimiento = entrada.nextLine();
        System.out.println("Introduzca si ha aprendido o no el concepto: ");
        boolean aprendido = entrada.nextBoolean(); //COMO FORZAR CON PALABRAS.........

        Conocimiento unConocimiento = new Conocimiento(conceptoConocimiento, descripcionConocimiento, dudasConocimiento, aprendido);
        this.conocimientos.add(unConocimiento);

        System.out.println("¡LOS DATOS HAN SIDO CARGADOS SATISFACTORIAMENTE!");
        System.out.println();
    }

    //Getters y setters
    public String getCodigoTema() {
        return codigoTema;
    }

    public void setCodigoTema(String codigoTema) {
        this.codigoTema = codigoTema;
    }

    public String getNombreTema() {
        return nombreTema;
    }

    public void setNombreTema(String nombreTema) {
        this.nombreTema = nombreTema;
    }

    public String getFechaTema() {
        return fechaTema;
    }

    public void setFechaTema(String fechaTema) {
        this.fechaTema = fechaTema;
    }

    public ArrayList<Investigacion> getInvestigaciones() {
        return investigaciones;
    }

    public void setInvestigaciones(ArrayList<Investigacion> investigaciones) {
        this.investigaciones = investigaciones;
    }

    public ArrayList<Conocimiento> getConocimientos() {
        return conocimientos;
    }

    public void setConocimientos(ArrayList<Conocimiento> conocimientos) {
        this.conocimientos = conocimientos;
    }

    public ArrayList<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(ArrayList<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }

}
