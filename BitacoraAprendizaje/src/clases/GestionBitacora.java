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
public class GestionBitacora {

    static Scanner entrada = new Scanner(System.in);
    public ArrayList<Materia> materias;
    public ArrayList<Alumno> alumnos;

    //Constructor vacío
    public GestionBitacora() {
        //VER DATOS POR DEFECTO
    }

    //Metodos void para datos por defecto en caso de ser necesarios
    //------------
    
    //Registrar Alumno
    public void registrarAlumno() {
        System.out.println("Ingrese el CI del alumno: ");
        String CI = entrada.nextLine();
        System.out.println("Ingrese el nombre del alumno: ");
        String nombreAlumno = entrada.nextLine();
        System.out.println("Ingrese el apellido del alumno: ");
        String apellidoAlumno = entrada.nextLine();
        System.out.println("Ingrese el e-mail del alumno: ");
        String emailAlumno = entrada.nextLine();
        System.out.println("Ingrese la contraseña del alumno: ");
        String contrasenhaAlumno = entrada.nextLine();

        Alumno unAlumno = new Alumno(CI, nombreAlumno, apellidoAlumno, emailAlumno, contrasenhaAlumno);
        this.alumnos.add(unAlumno);

        System.out.println("¡LOS DATOS DEL ALUMNO HAN SIDO CARGADOS SATISFACTORIAMENTE!");
        System.out.println();
    }

    //Registrar Materia
    public void registrarMateria() {
        System.out.println("Ingrese el código de la materia :");
        String codigoMateria = entrada.nextLine();
        System.out.println("Ingrese el nombre de la materia: ");
        String nombreMateria = entrada.nextLine();

        Materia unaMateria = new Materia(codigoMateria, nombreMateria);
        this.materias.add(unaMateria);

        System.out.println("¡LOS DATOS DE MATERIA HAN SIDO CARGADOS SATISFACTORIAMENTE!");
        System.out.println();

    }

    //Buscar alumno por CI
    public Alumno buscarAlumno(String CI) {
        Alumno unAlumno;
        for (int i = 0; i < alumnos.size(); i++) {
            unAlumno = alumnos.get(i);
            if (CI.equals(unAlumno.getCI())) {
                return unAlumno;
            }
        }
        return null;
    }

    //Buscar materia por codigo
    public Materia buscarMateria(String codigoMateria) {
        Materia unaMateria;
        for (int i = 0; i < materias.size(); i++) {
            unaMateria = materias.get(i);
            if (codigoMateria.equals(unaMateria.getCodigoMateria())) {
                return unaMateria;
            }
        }
        return null;
    }

    //Asignar materia a }
    //aSIGNAR TEMAS  MATERIAS    
}
