/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutable;

import clases.Alumno;
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
            System.out.println("**********************INICIO**********************");
            System.out.println("1. Registrar nuevo alumno");
            System.out.println("2. Ingresar por CI");
            System.out.println("3. Salir del sistema");
            System.out.println();
            System.out.print("Ingrese el número de la opción elegida: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("**************REGISTRAR NUEVO ALUMNO**************");
                    registrarNuevoAlumno();
                    break;
                case 2:
                    System.out.println("**************INGRESAR POR NÚMERO DE CI**************");
                    ingresarAlumno();
                    break;
                case 3:
                    System.out.println("Usted ha decidido salir del sistema");
                    break;
                default:
                    System.out.println("Opción incorrecta. Inténtelo de nuevo");
            }
        } while (opcion != 3);
    }

    public static void registrarNuevoAlumno() {
        unaGestionBitacora.registrarAlumno();
        System.out.println();
        System.out.println("Presione cualquier tecla para continuar: ");
        entrada.nextLine();
    }

    public static void ingresarAlumno() {
        unaGestionBitacora.ImprimirMateriaAlumno();
        System.out.println();
        System.out.println("¿Desea agregar una nueva materia? S: Sí, N: NO");
        String opcion = entrada.nextLine();
        if ("S".equals(opcion)) {
            unaGestionBitacora.registrarMateria();
        }
        System.out.println("Presione cualquier tecla para continuar: ");
        entrada.nextLine();
    }

}
