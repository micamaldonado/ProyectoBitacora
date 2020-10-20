/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Investigacion {

    static Scanner entrada = new Scanner(System.in);

    String codigoInvestigacion;
    String tiempoDedicadoInv;
    String temaInvestigado;
    String comentarios;
    double nivelComprension;
    String dudasInvestigacion;

    //Constructor vacío
    public Investigacion() {
    }

    //Constructor con parametros
    public Investigacion(String codigoInvestigacion, String temaInvestigado, String tiempoDedicadoInv, String comentarios, String dudasInvestigacion, double nivelComprension) {
        this.codigoInvestigacion = codigoInvestigacion;
        this.temaInvestigado = temaInvestigado;
        this.tiempoDedicadoInv = tiempoDedicadoInv;
        this.comentarios = comentarios;
        this.dudasInvestigacion = dudasInvestigacion;
        this.nivelComprension = nivelComprension;
    }

    //Imprimir datos de cada investigacion
    public void imprimirDatoInvestigacion() {
        System.out.println("Codigo: " + codigoInvestigacion + '\n');
        System.out.print("Tema: " + temaInvestigado + '\n');
        System.out.print("Tiempo: " + tiempoDedicadoInv + '\n');
        System.out.print("Dudas: " + dudasInvestigacion + '\n');
        System.out.print("Comentarios: " + comentarios + '\n');
        System.out.print("Comprension: " + nivelComprension + '\n');
    }

    //Cambiar estado de aprendido
    public void cambiarNivelInvestigacion() {
        System.out.println("Ingrese el nuevo nivel de comprensión: ");
        String nuevoNivelComprension = entrada.nextLine();
        //COMO CAMBIAR ALGO YA EXISTENTE?
    }

    //Getters y setters
    public String getCodigoInvestigacion() {
        return codigoInvestigacion;
    }

    public void setCodigoInvestigacion(String codigoInvestigacion) {
        this.codigoInvestigacion = codigoInvestigacion;
    }

    public String getTiempoDedicadoInv() {
        return tiempoDedicadoInv;
    }

    public void setTiempoDedicadoInv(String tiempoDedicadoInv) {
        this.tiempoDedicadoInv = tiempoDedicadoInv;
    }

    public String getTemaInvestigado() {
        return temaInvestigado;
    }

    public void setTemaInvestigado(String temaInvestigado) {
        this.temaInvestigado = temaInvestigado;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public double getNivelComprension() {
        return nivelComprension;
    }

    public void setNivelComprension(double nivelComprension) {
        this.nivelComprension = nivelComprension;
    }

    public String getDudasInvestigacion() {
        return dudasInvestigacion;
    }

    public void setDudasInvestigacion(String dudasInvestigacion) {
        this.dudasInvestigacion = dudasInvestigacion;
    }

}
