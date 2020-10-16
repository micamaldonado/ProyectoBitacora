/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Alumno {

    private String CI;
    private String nombreAlumno;
    private String apellidoAlumno;
    private String emailAlumno;
    private String contrasenhaAlumno;
    public ArrayList<Materia> materias;

    public Alumno() {
    }
//Constructor

    public Alumno(String CI, String nombreAlumno, String apellidoAlumno, String emailAlumno, String contrasenhaAlumno) {
        this.CI = CI;
        this.nombreAlumno = nombreAlumno;
        this.apellidoAlumno = apellidoAlumno;
        this.emailAlumno = emailAlumno;
        this.contrasenhaAlumno = contrasenhaAlumno;
        materias = new ArrayList();
    }
// Imprimir datos del alumno

    public void imprimirDatoAlumno() {
        System.out.print("Nombre: " + nombreAlumno);
        System.out.print("Apellido: " + apellidoAlumno);
        System.out.print("E-mail: " + emailAlumno);
        System.out.print("E-mail: " + contrasenhaAlumno);
    }
//Getters y Setters

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidoAlumno() {
        return apellidoAlumno;
    }

    public void setApellidoAlumno(String apellidoAlumno) {
        this.apellidoAlumno = apellidoAlumno;
    }

    public String getEmailAlumno() {
        return emailAlumno;
    }

    public void setEmailAlumno(String emailAlumno) {
        this.emailAlumno = emailAlumno;
    }

    public String getContrasenhaAlumno() {
        return contrasenhaAlumno;
    }

    public void setContrasenhaAlumno(String contrasenhaAlumno) {
        this.contrasenhaAlumno = contrasenhaAlumno;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

}
