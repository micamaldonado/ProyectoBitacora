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
public class Conocimiento {

    String conceptoConocimiento;
    String descripcionConocimiento;
    String dudasConocimiento;
    boolean aprendido;

    //Constructor vacío
    public Conocimiento() {
    }

    //Constructor con parametros
    public Conocimiento(String conceptoConocimiento, String descripcionConocimiento, String dudasConocimiento, boolean aprendido) {
        this.conceptoConocimiento = conceptoConocimiento;
        this.descripcionConocimiento = descripcionConocimiento;
        this.dudasConocimiento = dudasConocimiento;
        this.aprendido = aprendido;
    }

    //Imprimir datos de cada conocimiento
    public void imprimirDatoConocimiento() {
        System.out.print("Concepto: " + conceptoConocimiento); //SALTO
        System.out.print("Descripcion: " + descripcionConocimiento); //SALTO
        System.out.print("Dudas: " + dudasConocimiento); //SALTO
        System.out.print("¿Aprendido?: " + aprendido); //SALTO
    }

    //Getters y setters
    public String getConceptoConocimiento() {
        return conceptoConocimiento;
    }

    public void setConceptoConocimiento(String conceptoConocimiento) {
        this.conceptoConocimiento = conceptoConocimiento;
    }

    public String getDescripcionConocimiento() {
        return descripcionConocimiento;
    }

    public void setDescripcionConocimiento(String descripcionConocimiento) {
        this.descripcionConocimiento = descripcionConocimiento;
    }

    public String getDudasConocimiento() {
        return dudasConocimiento;
    }

    public void setDudasConocimiento(String dudasConocimiento) {
        this.dudasConocimiento = dudasConocimiento;
    }

    public boolean isAprendido() {
        return aprendido;
    }

    public void setAprendido(boolean aprendido) {
        this.aprendido = aprendido;
    }    
}
