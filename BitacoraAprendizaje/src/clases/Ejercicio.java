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
public class Ejercicio {
//codigo
    //quitar los privates
    //asignar hacer

    String codigoEj;
    String tiempoDedicadoEj;
    String experiencia;
    String dudasEj;
    double porcLogrado;

    public Ejercicio() {
    }
//Constructor

    public Ejercicio(String codigoEj, String tiempoDedicadoEj, String experiencia, String dudasEj, double porcLogrado) {
        this.codigoEj = codigoEj;
        this.tiempoDedicadoEj = tiempoDedicadoEj;
        this.experiencia = experiencia;
        this.dudasEj = dudasEj;
        this.porcLogrado = porcLogrado;
    }

    //Imprimir datos de ejercicios
    public void ImprimirDatoEjercicio() {
        System.out.print("Tiempo dedicado: " + tiempoDedicadoEj);
        System.out.print("Experiencia: " + experiencia);
        System.out.print("Dudas: " + dudasEj);
        System.out.print("Porcentaje logrado: " + porcLogrado);

    }

//Getters y Setters
    public String getCodigoEj() {
        return codigoEj;
    }

    public void setCodigoEj(String codigoEj) {
        this.codigoEj = codigoEj;
    }

    public String getTiempoDedicadoEj() {
        return tiempoDedicadoEj;
    }

    public void setTiempoDedicadoEj(String tiempoDedicadoEj) {
        this.tiempoDedicadoEj = tiempoDedicadoEj;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getDudasEj() {
        return dudasEj;
    }

    public void setDudasEj(String dudasEj) {
        this.dudasEj = dudasEj;
    }

    public double getPorcLogrado() {
        return porcLogrado;
    }

    public void setPorcLogrado(double porcLogrado) {
        this.porcLogrado = porcLogrado;
    }

}
