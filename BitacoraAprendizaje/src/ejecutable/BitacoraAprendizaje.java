/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutable;

import clases.GestionBitacora;
import clases.Tema;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class BitacoraAprendizaje {

    static Scanner entrada = new Scanner(System.in);
    private static GestionBitacora unaGestionBitacora = new GestionBitacora();
    private static Tema unTema = new Tema();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println();
            System.out.println("BIENVENIDO A LA GESTION DE BITACORA DE APRENDIZAJE");
            System.out.println("1. Registrar nuevo alumno");
            System.out.println("2. Registrar nueva materia");
            System.out.println("3. Registrar nueva investigación");
            System.out.println("4. Registrar nuevo conocimiento");
            System.out.println("5. Registrar nuevo ejercicio");
            System.out.println("6. Imprimir lista de temas pendientes por alumno");
            //Asignaciones?
            System.out.println("7. Salir");
            System.out.println();
            System.out.print("Ingrese el número de la opción elegida: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("**************REGISTRAR NUEVO ALUMNO**************");
                    unaGestionBitacora.registrarAlumno();
                    break;
                case 2:
                    System.out.println("**************REGISTRAR NUEVA MATERIA**************");
                    unaGestionBitacora.registrarMateria();
                    break;
                case 3:
                    System.out.println("**************REGISTRAR NUEVA INVESTIGACION**************");
                    unTema.registrarInvestigacion();
                    break;
                case 4:
                    System.out.println("**************REGISTRAR NUEVO CONOCIMIENTO**************");
                    unTema.registrarConocimiento();
                    break;
                case 5:
                    System.out.println("**************REGISTRAR NUEVO EJERCICIO**************");
                    unTema.registrarEjercicio();
                    break;
                case 6:
                    System.out.println("**************LISTA DE TEMAS PENDIENTE POR ALUMNO**************");
                    //metodo
                    break;
                case 7:
                    System.out.println("Usted ha decidido salir del sistema");
                    break;
                default:
                    System.out.println("Opción incorrecta. Inténtelo de nuevo");
            }
        } while (opcion != 7);
    }

}
