/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author user
 */
public class Investigacion {

    String tiempoDedicadoInv;
    String temaInvestigado;
    String comentarios;
    double nivelComprension;
    String dudasInvestigacion;

    //Constructor vacío
    public Investigacion() {
    }

    //Constructor con parametros
    public Investigacion(String temaInvestigado, String tiempoDedicadoInv, String comentarios, String dudasInvestigacion, double nivelComprension) {
        this.temaInvestigado = temaInvestigado;
        this.tiempoDedicadoInv = tiempoDedicadoInv;
        this.comentarios = comentarios;
        this.dudasInvestigacion = dudasInvestigacion;
        this.nivelComprension = nivelComprension;

    }

    //Imprimir datos de cada investigacion
    public void imprimirDatoInvestigacion() {
        System.out.print("Tema: " + temaInvestigado); //SALTO
        System.out.print("Tiempo: " + tiempoDedicadoInv); //SALTO
        System.out.print("Dudas: " + dudasInvestigacion); //SALTO
        System.out.print("Comentarios: " + comentarios); //SALTO
        System.out.print("Comprension: " + nivelComprension); //SALTO
    }

    //Getters y setters
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
