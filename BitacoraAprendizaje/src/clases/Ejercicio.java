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

    private String tiempoDedicadoEj;
    private String experiencia;
    private String dudasEj;
    private String porcLogrado;

    public Ejercicio() {
    }
//Constructor

    public Ejercicio(String tiempoDedicadoEj, String experiencia, String dudasEj, String porcLogrado) {
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

    public String getPorcLogrado() {
        return porcLogrado;
    }

    public void setPorcLogrado(String porcLogrado) {
        this.porcLogrado = porcLogrado;
    }

}
