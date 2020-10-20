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

    String codigoConocimiento;
    String conceptoConocimiento;
    String descripcionConocimiento;
    String dudasConocimiento;
    boolean aprendido;

    //Constructor vacío
    public Conocimiento() {
    }

    //Constructor con parametros
    public Conocimiento(String codigoConocimiento, String conceptoConocimiento, String descripcionConocimiento, String dudasConocimiento, boolean aprendido) {
        this.codigoConocimiento = codigoConocimiento;
        this.conceptoConocimiento = conceptoConocimiento;
        this.descripcionConocimiento = descripcionConocimiento;
        this.dudasConocimiento = dudasConocimiento;
        this.aprendido = aprendido;
    }

    //Imprimir datos de cada conocimiento
    public void imprimirDatoConocimiento() {
        System.out.print("Codigo: " + codigoConocimiento + '\n');
        System.out.print("Concepto: " + conceptoConocimiento + '\n');
        System.out.print("Descripcion: " + descripcionConocimiento + '\n');
        System.out.print("Dudas: " + dudasConocimiento + '\n');
        System.out.print("¿Aprendido?: " + aprendido + '\n');
    }

    //Cambiar estado de aprendido
    public void cambiarEstadoAprendido(String codigoConocimiento) {
        imprimirDatoConocimiento();
        if (aprendido == false) {
            aprendido = true;
            System.out.println();
            System.out.println("El estado Aprendido ha cambiado \"Sí\"");
        } else {
            aprendido = false;
            System.out.println("El estado Aprendido ha cambiado \"No\"");
        }
    }

    //Getters y setters
    public String getCodigoConocimiento() {
        return codigoConocimiento;
    }

    public void setCodigoConocimiento(String codigoConocimiento) {
        this.codigoConocimiento = codigoConocimiento;
    }

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
