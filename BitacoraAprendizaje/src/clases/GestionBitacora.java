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
        this.materias = new ArrayList();
        this.alumnos = new ArrayList();
//        materiasPorDefecto();
        alumnosPorDefecto();
    }

//    //Datos de materias
//    public void materiasPorDefecto() {
//        Materia materia1 = new Materia("1", "Proyecto TIC");
//        Materia materia2 = new Materia("2", "Gestión Software");
//        Materia materia3 = new Materia("3", "Alemán");
//        Materia materia4 = new Materia("4", "Informática II");
//        this.materias.add(materia1);
//        this.materias.add(materia2);
//        this.materias.add(materia3);
//        this.materias.add(materia4);
//    }

    //Datos de Alumnos
    public void alumnosPorDefecto() {
        Materia materia1 = new Materia("1", "Proyecto TIC");
        Materia materia2 = new Materia("2", "Gestión Software");
        Materia materia3 = new Materia("3", "Alemán");
        Materia materia4 = new Materia("4", "Informática II");
        this.materias.add(materia1);
        this.materias.add(materia2);
        this.materias.add(materia3);
        this.materias.add(materia4);

        Alumno alumno1 = new Alumno("111", "Milagros", "López", "milagros@gmail.com", "111", materia1);
        Alumno alumno2 = new Alumno("222", "Zileidy", "Argüello", "zileidy@gmail.com", "222", materia2);
        Alumno alumno3 = new Alumno("333", "Micaela", "Maldonado", "micaela@gmail.com", "333", materia3);
        Alumno alumno4 = new Alumno("444", "Diego", "Giménez", "diego@gmail.com", "444", materia4);
        Alumno alumno5 = new Alumno("444", "Diego", "Giménez", "diego@gmail.com", "444", materia1);
        this.alumnos.add(alumno1);
        this.alumnos.add(alumno2);
        this.alumnos.add(alumno3);
        this.alumnos.add(alumno4);
        this.alumnos.add(alumno5);
    }

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

    //Ingresar la materia del alumno
    public void RegistrarMateriaAlumno() {
        System.out.println("CI del alumno/a");
        String CI = entrada.nextLine();
        Alumno unAlumno = buscarAlumno(CI);
        if (unAlumno != null) {
            System.out.println("Ingrese el código de la materia: ");
            String codigoMateria = entrada.nextLine();
            Materia unaMateria = buscarMateria(codigoMateria);
            unaMateria.imprimirDatoMateria();
            unaMateria = new Materia(CI, codigoMateria);
            this.materias.add(unaMateria);
            System.out.println("Se ha registrado la materia");
        } else {
            System.out.println("El número de CI ingresado no existe. Verifique e intente nuevamente");
        }
    }

    //ASIGNAR TEMA A MATERIA
    public void RegistrarTemaMateria() {
        System.out.println("Código de la materia");
        String codigoMateria = entrada.nextLine();
        Materia unaMateria = buscarMateria(codigoMateria);
        if (unaMateria != null) {
            unaMateria.RegistrarTemaporMateria();
        } else {
            System.out.println("El código ingresado no existe");
        }
    }

    //Imprimir las materias del alumno
    public void ImprimirMateriaAlumno() {
        //Materia unaMateria = new Materia();
        System.out.println("CI del alumno: ");
        String CI = entrada.nextLine();
        Alumno unAlumno = buscarAlumno(CI);
        if (unAlumno != null) {
            unAlumno.imprimirDatoAlumno();
            System.out.println();
            System.out.println("Materias de: " + unAlumno.getNombreAlumno());
            recorrerArrayMaterias();
            System.out.println();
            System.out.println("¿Desea agregar una nueva materia? S: Sí, N: NO");
            String opcion = entrada.nextLine();
            if ("S".equals(opcion)) {
                registrarMateria();
                System.out.println();
                System.out.println("Materias de: " + unAlumno.getNombreAlumno());
                recorrerArrayMaterias();
            }
            //this.materias.add(unaMateria); CREO QUE ESTE NO HACE FALTA ACÁ
        } else {
            System.out.println("El número de CI ingresado no existe. Verifique e intente nuevamente");
        }

    }

    public void recorrerArrayMaterias() {
        if (materias.size() > 0) {
            for (int i = 0; i < materias.size(); i++) {
                Materia unaMateria = materias.get(i);
                System.out.println((i + 1) + ". " + "Código: " + unaMateria.getCodigoMateria() + "  Nombre: " + unaMateria.getNombreMateria());
            }
            System.out.println();
            System.out.println("Elija el código de la materia para listar los temas: ");
            imprimirListaTemaMateria();
        } else {
            System.out.println("No posee ninguna materia.");
        }
    }

    //Imprimir datos de Temas por Materias
    public void imprimirListaTemaMateria() {
        System.out.print("Código de la materia: ");
        String codigoMateria = entrada.nextLine();
        Materia unaMateria = buscarMateria(codigoMateria);
        if (unaMateria != null) {
            unaMateria.imprimirTemaMateria();

            System.out.println();
            System.out.println("¿Desea agregar un nuevo tema? S: Sí, N: NO");
            String opcion = entrada.nextLine();
            if ("S".equals(opcion)) {
                unaMateria.registrarTema();
                System.out.println();
                System.out.println("TEMAS DE: " + unaMateria.getNombreMateria());
                unaMateria.imprimirTemaMateria();
            }
//            System.out.println("Ingrese el código del tema que desea ver: ");
//            String codigoTema = entrada.nextLine();
//            Tema unTema = unaMateria.buscarTema(codigoTema);
            //METODO SUBMENUS                    
//            if (unTema != null) {
//                unTema.submenuTema();
//            }
        } else {
            System.out.println("El código ingresado no existe");
        }
    }

    //metodos submenus
}
