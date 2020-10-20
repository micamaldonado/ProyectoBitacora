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
public class Tema {

    static Scanner entrada = new Scanner(System.in);
    Conocimiento unConocimiento = new Conocimiento ();

    String codigoTema;
    String nombreTema;
    String fechaTema;
    public ArrayList<Investigacion> investigaciones;
    public ArrayList<Conocimiento> conocimientos;
    public ArrayList<Ejercicio> ejercicios;

    //Constructor vacio
    public Tema() {

    }

    //Constructor con parametros
    public Tema(String fechaTema, String codigoTema, String nombreTema) {
        this.fechaTema = fechaTema;
        this.codigoTema = codigoTema;
        this.nombreTema = nombreTema;
        investigaciones = new ArrayList();
        conocimientos = new ArrayList();
        ejercicios = new ArrayList();
    }

    //Imprimir datos básicos del tema
    public void imprimirDatoTema() {
        System.out.print("Código: " + codigoTema + '\n');
        System.out.print("Nombre: " + nombreTema + '\n');
        System.out.print("Fecha: " + fechaTema + '\n');
        //VER SI HACE FALTA IMPRIMIR SUS ARRAYS?
    }

    //Imprimir los temas pendientes
    public void imprimirTemasPendientes() {
        if (conocimientos.size() > 0) {
            System.out.println("Los temas pendientes son: ");
            for (int i = 0; i < conocimientos.size(); i++) {
                Conocimiento unConocimiento = conocimientos.get(i);
                if (unConocimiento.isAprendido() == false) {
                    System.out.println("Concepto: " + unConocimiento.getConceptoConocimiento()); //CREO QUE ACA SOLO ESTO
                }
            }
        } else {
            System.out.println("No hay temas pendientes");
        }
    }

    //Imprimir temas NO pendientes
    public void imprimirTemasNOPendientes() {
        if (conocimientos.size() > 0) {
            System.out.println("Los temas aprendidos son: ");
            for (int i = 0; i < conocimientos.size(); i++) {
                Conocimiento unConocimiento = conocimientos.get(i);
                if (unConocimiento.isAprendido() == true) {
                    System.out.println("Concepto: " + unConocimiento.getConceptoConocimiento()); //CREO QUE ACA SOLO ESTO
                }
            }
        } else {
            System.out.println("No hay temas aprendidos");
        }

    }

    //Registrar Ejercicio
    public void registrarEjercicio() {

        System.out.println("Ingrese el código: ");
        String codigoEj = entrada.nextLine();
        System.out.println("Ingrese el tiempo dedicado al ejercicio: ");
        String tiempoDedicadoEj = entrada.nextLine();
        System.out.println("Ingrese su experiencia: ");
        String experiencia = entrada.nextLine();
        System.out.println("Ingrese sus dudas acerca del ejercicio: ");
        String dudasEj = entrada.nextLine();
        System.out.println("Ingrese aquí el porcentaje logrado: ");
        double porcLogrado = entrada.nextDouble();
        System.out.println("");

        Ejercicio unEjercicio = new Ejercicio(codigoEj, tiempoDedicadoEj, experiencia, dudasEj, porcLogrado);
        this.ejercicios.add(unEjercicio);

        System.out.println("¡LOS DATOS DE EJERCICIOS HAN SIDO CARGADOS SATISFACTORIAMENTE!");
        System.out.println();
    }

    //Registrar Investigacion
    public void registrarInvestigacion() {

        System.out.println("Ingrese el código: ");
        String codigoInvestigacion = entrada.nextLine();
        System.out.println("Ingrese el tema investigado: ");
        String temaInvestigado = entrada.nextLine();
        System.out.println("Ingrese el tiempo dedicado a la investigación: ");
        String tiempoDedicadoInv = entrada.nextLine();
        System.out.println("Ingrese sus comentarios: ");
        String comentarios = entrada.nextLine();
        System.out.println("Ingrese sus dudas: ");
        String dudasInvestigacion = entrada.nextLine();
        System.out.println("Ingrese su nivel de comprensión: ");
        double nivelComprension = entrada.nextDouble();
        System.out.println("");

        Investigacion unaInvestigacion = new Investigacion(codigoInvestigacion, temaInvestigado, tiempoDedicadoInv, comentarios, dudasInvestigacion, nivelComprension);
        this.investigaciones.add(unaInvestigacion);

        System.out.println("¡LOS DATOS DE INVESTIGACIÓN HAN SIDO CARGADOS SATISFACTORIAMENTE!");
        System.out.println();
    }

    //Registrar Conocimiento
    public void registrarConocimiento() {
        System.out.println();
        System.out.println("Ingrese el código del conocimiento: ");
        String codigoConocimiento = entrada.nextLine();
        System.out.println("Ingrese el concepto desarrollado: ");
        String conceptoConocimiento = entrada.nextLine();
        System.out.println("Ingrese la descripcion del mismo: ");
        String descripcionConocimiento = entrada.nextLine();
        System.out.println("Ingrese sus dudas: ");
        String dudasConocimiento = entrada.nextLine();
        System.out.println("Introduzca si ha aprendido o no el concepto: ");
        String stringBoolean = entrada.nextLine();
        boolean aprendido = false;
        if ("Si".equals(stringBoolean)) {
            aprendido = true;
        }
//        } else if ("No".equals(stringBoolean)) {
//            aprendido = false;
//        }        
        //boolean aprendido = entrada.nextBoolean(); //COMO FORZAR CON PALABRAS.........
        Conocimiento unConocimiento = new Conocimiento(codigoConocimiento, conceptoConocimiento, descripcionConocimiento, dudasConocimiento, aprendido);
        this.conocimientos.add(unConocimiento);

        System.out.println("¡LOS DATOS HAN SIDO CARGADOS SATISFACTORIAMENTE!");
        System.out.println();
    }

    //Asignar investigacion a tema
    public void registrarInvestigacionxTema() {
        System.out.println("Ingrese el código de la investigacion: ");
        String codigoInvestigacion = entrada.nextLine();
        Investigacion unaInvestigacion = buscarInvestigacion(codigoInvestigacion);
        if (unaInvestigacion != null) {
            unaInvestigacion.imprimirDatoInvestigacion();
            unaInvestigacion = new Investigacion();
            this.investigaciones.add(unaInvestigacion);
            System.out.println("Se ha registrado una investigacion para el tema");
        } else {
            System.out.println("El código no existe. Verifique e intente nuevamente");
        }
    }

    //Buscar investigacion
    public Investigacion buscarInvestigacion(String codigoInvestigacion) {
        Investigacion unaInvestigacion;
        for (int i = 0; i < investigaciones.size(); i++) {
            unaInvestigacion = investigaciones.get(i);
            if (codigoInvestigacion.equals(unaInvestigacion.getCodigoInvestigacion())) {
                return unaInvestigacion;
            }
        }
        return null;
    }

    //Asignar conocimiento a tema
    public void registrarConcimientoxTema() {
        System.out.println("Ingrese el código del conocimiento: ");
        String codigoConocimiento = entrada.nextLine();
        Conocimiento unConocimiento = buscarConocimiento(codigoConocimiento);
        if (unConocimiento != null) {
            unConocimiento.imprimirDatoConocimiento();
            unConocimiento = new Conocimiento();
            this.conocimientos.add(unConocimiento);
            System.out.println("Se ha registrado un conocimiento.");
        } else {
            System.out.println("El código no existe. Verifique e intente nuevamente");
        }
    }

    //Buscar conocimiento
    public Conocimiento buscarConocimiento(String codigoConocimiento) {
        Conocimiento unConocimiento;
        for (int i = 0; i < conocimientos.size(); i++) {
            unConocimiento = conocimientos.get(i);
            if (codigoConocimiento.equals(unConocimiento.getCodigoConocimiento())) {
                return unConocimiento;
            }
        }
        return null;
    }

    //Asignar ejercicio a tema
    public void registrarEjercicioxTema() {
        System.out.println("Ingrese el código del ejercicio: ");
        String codigoEjercicio = entrada.nextLine();
        Ejercicio unEjercicio = buscarEjercicio(codigoEjercicio);
        if (unEjercicio != null) {
            unEjercicio.ImprimirDatoEjercicio();
            unEjercicio = new Ejercicio();
            this.ejercicios.add(unEjercicio);
            System.out.println("Se ha registrado un ejercicio nuevo.");
        } else {
            System.out.println("El código no existe. Verifique e intente nuevamente");
        }
    }

    //Buscar ejercicio 
    public Ejercicio buscarEjercicio(String codigoEjercicio) {
        Ejercicio unEjercicio;
        for (int i = 0; i < ejercicios.size(); i++) {
            unEjercicio = ejercicios.get(i);
            if (codigoEjercicio.equals(unEjercicio.getCodigoEj())) {
                return unEjercicio;
            }
        }
        return null;
    }

    public void submenuTema() {
        System.out.println();
        System.out.println("\"**************TEMA**************\"");
        System.out.println("Para ver el contenido del tema:  ");
        int opcion;
        do {
            System.out.println("");
            System.out.println("1. Conocimiento");
            System.out.println("2. Ejercicio");
            System.out.println("3. Investigación");
            System.out.println("Ingrese el número de la opción elegida: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println();
                    System.out.println("Conocimiento");
                    System.out.println("");
                    System.out.println("1. Listar conocimientos");
                    System.out.println("2. Cargar conocimiento ");
                    System.out.println("3. Cambiar estado de aprendido");
                    System.out.println();
                    System.out.print("Ingrese el número de la opción elegida: ");
                    opcion = entrada.nextInt();
                    entrada.nextLine();

                    if (opcion == 1) {
                        //Lista de conocimiento
                        //Tema unTema.();//?
                    } else if (opcion == 2) {
                        registrarConocimiento();
//                        Tema unTema = new Tema();
//                        unTema.registrarConocimiento();
                    } else if (opcion == 3) {
                        System.out.println("Ingrese el código del tema del cual desea cambiar el estado: ");
                        String codigoTema = entrada.nextLine();
                        //Materia unaMateria = unaMateria.buscarTema(codigoTema);
                        unConocimiento.cambiarEstadoAprendido(codigoTema);
//                        Conocimiento unConocimiento = new Conocimiento();
//                        unConocimiento.cambiarEstadoAprendido(codigoTema);//VER
                    } else {
                        System.out.println("Número ingresado no exite. Intente nuevamente");
                    }
                    break;
                case 2:
                    System.out.println("Ejercicio");
                    System.out.println("");
                    System.out.println("1. Listar ejercicios");
                    System.out.println("2.Cargar ejercicio ");
                    System.out.print("Ingrese el número de la opción elegida: ");
                    opcion = entrada.nextInt();

                    if (opcion == 1) {
                        //Listar de ejercicio
                        //Tema unTema.();//?
                    } else if (opcion == 2) {
                        Tema unTema = new Tema();
                        unTema.registrarEjercicio();
                    } else {
                        System.out.println("Número ingresado no exite. Intente nuevamente");
                    }

                    break;
                case 3:
                    System.out.println("Investigación");
                    System.out.println("");
                    System.out.println("1. Listar investigaciones");
                    System.out.println("2.Cargar investigación ");
                    System.out.print("Ingrese el número de la opción elegida: ");
                    opcion = entrada.nextInt();

                    if (opcion == 1) {
                        //Lista de conocimiento
                        //Tema unTema.();//?
                    } else if (opcion == 2) {
                        Tema unTema = new Tema();
                        unTema.registrarInvestigacion();
                    } else {
                        System.out.println("Número ingresado no exite. Intente nuevamente");
                    }
                    break;

                case 4:
                    System.out.println("Usted ha decidido salir del sistema");
                    break;
                default:
                    System.out.println("Opción incorrecta. Inténtelo de nuevo");
            }

        } while (opcion != 4);
    }

    //Getters y setters
    public String getCodigoTema() {
        return codigoTema;
    }

    public void setCodigoTema(String codigoTema) {
        this.codigoTema = codigoTema;
    }

    public String getNombreTema() {
        return nombreTema;
    }

    public void setNombreTema(String nombreTema) {
        this.nombreTema = nombreTema;
    }

    public String getFechaTema() {
        return fechaTema;
    }

    public void setFechaTema(String fechaTema) {
        this.fechaTema = fechaTema;
    }

    public ArrayList<Investigacion> getInvestigaciones() {
        return investigaciones;
    }

    public void setInvestigaciones(ArrayList<Investigacion> investigaciones) {
        this.investigaciones = investigaciones;
    }

    public ArrayList<Conocimiento> getConocimientos() {
        return conocimientos;
    }

    public void setConocimientos(ArrayList<Conocimiento> conocimientos) {
        this.conocimientos = conocimientos;
    }

    public ArrayList<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(ArrayList<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }

}
