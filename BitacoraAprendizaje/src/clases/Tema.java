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
    Conocimiento unConocimiento = new Conocimiento();

    String codigoTema;
    String nombreTema;
    String fechaTema;
    public ArrayList<Investigacion> investigaciones;
    public ArrayList<Conocimiento> conocimientos;
    public ArrayList<Ejercicio> ejercicios;

    //Constructor vacio
    public Tema() {

    }

    public void investigacionesPorDefecto() {
        Investigacion unaInvestigacion1 = new Investigacion("inv1", "Investigación I", "01:50", "Ninguna", "Ninguna Duda", 60);
        Investigacion unaInvestigacion2 = new Investigacion("inv2", "Investigación II", "02:30", "Especificar nombre", "Concepto", 40);
        Investigacion unaInvestigacion3 = new Investigacion("inv3", "Investigación III", "04:00", "Faltan indicadores", "Muchas dudas", 70);

        this.investigaciones.add(unaInvestigacion1);
        this.investigaciones.add(unaInvestigacion2);
        this.investigaciones.add(unaInvestigacion3);

    }

    public void conocimientosPorDefecto() {
        Conocimiento unConocimiento1 = new Conocimiento("num1", "POO", "Significa Programacion Orientada a Objetos", "Ninguna", true);
        Conocimiento unConocimiento2 = new Conocimiento("num2", "Lenguas", "Son un sistema de signos lingüísticos", "Ninguna", false);
        Conocimiento unConocimiento3 = new Conocimiento("num3", "Radicales", "Es el proceso de hallar raíces de orden n de un número a", "Ninguna", false);

        this.conocimientos.add(unConocimiento1);
        this.conocimientos.add(unConocimiento2);
        this.conocimientos.add(unConocimiento3);
    }

    public void ejerciciosPorDefecto() {
        //Ejercicio(String codigoEj, String tiempoDedicadoEj, String experiencia, String dudasEj, double porcLogrado) {
        Ejercicio unEjercicio1 = new Ejercicio("ej1", "02:00", "Muchos ejercicios para una tarde", "¿Cómo sumar?", 65);
        Ejercicio unEjercicio2 = new Ejercicio("ej2", "01:40", "Pocos ejercicios para fijar conocimientos", "Ninguna", 50);
        Ejercicio unEjercicio3 = new Ejercicio("ej3", "00:30", "Excelentes ejercicios", "Ninguna", 100);

        this.ejercicios.add(unEjercicio1);
        this.ejercicios.add(unEjercicio2);
        this.ejercicios.add(unEjercicio3);
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
//Datos en conocimiento

    public void ConocimientoPorDefecto() {
        Conocimiento conocimiento1 = new Conocimiento("1", "Objeto", "Un ente que consta de estado y comportamiento", "-", true);
        Conocimiento conocimiento2 = new Conocimiento("2", "Constructor", "Es un método, su función es inicializar un objeto, para que estos puedan contener valores", "-", true);
        Conocimiento conocimiento3 = new Conocimiento("3", "Instanciar", "", "-", true);
        this.conocimientos.add(conocimiento1);
        this.conocimientos.add(conocimiento2);
        this.conocimientos.add(conocimiento3);
    }
    //Datos en ejercicio

    public void EjercicioPorDefecto() {
        Ejercicio ejercicio1 = new Ejercicio("1", "1:30:00", "Aprendí sobre el funcionamiento de las clases, constructores, etc.", "No me quedó tan claro lo de instanciar", 75);
        this.ejercicios.add(ejercicio1);
    }
//Datos en Investigacion

    public void InvestigacionPorDefecto() {
        Investigacion investigacion1 = new Investigacion("1", "Instancias en POO", "40:00", "Sin comentarios", "Sin dudas", 90);
        this.investigaciones.add(investigacion1);
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
                        imprimirConocimientos();
                        //Lista de conocimiento
                        //Tema unTema.();//?
                    } else if (opcion == 2) {
                        registrarConocimiento();
//                        Tema unTema = new Tema();
//                        unTema.registrarConocimiento();
                    } else if (opcion == 3) {
                        System.out.println("Ingrese el código del tema del cual desea cambiar el estado: ");
                        String codigoTema = entrada.nextLine();
                        Conocimiento unConocimiento = buscarConocimiento(codigoTema);
                        if (unConocimiento != null) {
                            unConocimiento.cambiarEstadoAprendido(codigoTema);
                        }else{
                            System.out.println("El conocimiento no existe");
                        }
                        //Materia unaMateria = unaMateria.buscarTema(codigoTema);
//                        Conocimiento unConocimiento = new Conocimiento();
//                        unConocimiento.cambiarEstadoAprendido(codigoTema);//VER
                    } else {
                        System.out.println("Número ingresado no exite. Intente nuevamente");
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Ejercicio");
                    System.out.println("");
                    System.out.println("1. Listar ejercicios");
                    System.out.println("2. Cargar ejercicio ");
                    System.out.println();
                    System.out.print("Ingrese el número de la opción elegida: ");
                    opcion = entrada.nextInt();
                    entrada.nextLine();

                    if (opcion == 1) {
                        imprimirEjercicios();
                        //Listar de ejercicio
                        //Tema unTema.();//?
                    } else if (opcion == 2) {
                        registrarEjercicio();
//                        Tema unTema = new Tema();
//                        unTema.registrarEjercicio();
                    } else {
                        System.out.println("Número ingresado no exite. Intente nuevamente");
                    }

                    break;
                case 3:
                    System.out.println();
                    System.out.println("Investigación");
                    System.out.println("");
                    System.out.println("1. Listar investigaciones");
                    System.out.println("2. Cargar investigación");
                    System.out.println("3. Cambiar nivel de comprensión");
                    System.out.println();
                    System.out.print("Ingrese el número de la opción elegida: ");
                    opcion = entrada.nextInt();
                    entrada.nextLine();

                    if (opcion == 1) {
                        imprimirInvestigacion();
                        //Lista de conocimiento
                        //Tema unTema.();//?
                    } else if (opcion == 2) {
                        registrarInvestigacion();
//                        Tema unTema = new Tema();
//                        unTema.registrarInvestigacion();
                    } else if (opcion == 3) {
                        System.out.println("Ingrese el código de la investigación que desea cambiar: ");
                        String codigoInvestigacion = entrada.nextLine();
                        Investigacion unaInvestigacion = buscarInvestigacion(codigoInvestigacion);
                        if (unaInvestigacion != null) {
                            unaInvestigacion.imprimirDatoInvestigacion();
                            unaInvestigacion.cambiarNivelInvestigacion();
                        }else{
                            System.out.println("La investigacion no existe.");
                        }
                        //CAMBIAR                        
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

    public void imprimirConocimientos() {
        System.out.println();
        if (conocimientos.size() > 0) {
            //System.out.println("Los libros prestados por este lector son: ");
            for (int i = 0; i < conocimientos.size(); i++) {
                Conocimiento unConocimiento = conocimientos.get(i);
                System.out.println("Codigo: " + unConocimiento.getCodigoConocimiento() + " Conceptos: " + unConocimiento.getConceptoConocimiento() + "  Descripcion: " + unConocimiento.getDescripcionConocimiento() + " Dudas: " + unConocimiento.getDudasConocimiento());
            }
        } else {
            System.out.println("No existe registro de conocimientos");
        }
    }

    public void imprimirEjercicios() {
        System.out.println();
        if (ejercicios.size() > 0) {
            //System.out.println("Los libros prestados por este lector son: ");
            for (int i = 0; i < ejercicios.size(); i++) {
                Ejercicio unEjercicio = ejercicios.get(i);
                System.out.println("Codigo: " + unEjercicio.getCodigoEj() + "  Experiencia: " + unEjercicio.getExperiencia() + " Dudas: " + unEjercicio.getDudasEj() + " Tiempo dedicado: " + unEjercicio.getTiempoDedicadoEj() + " Porcentaje logrado: " + unEjercicio.getPorcLogrado());
            }
        } else {
            System.out.println("No existe registro de ejercicios");
        }
    }

    public void imprimirInvestigacion() {
        System.out.println();
        if (investigaciones.size() > 0) {
            //System.out.println("Los libros prestados por este lector son: ");
            for (int i = 0; i < investigaciones.size(); i++) {
                Investigacion unaInvestigacion = investigaciones.get(i);
                System.out.println("Codigo: " + unaInvestigacion.getCodigoInvestigacion() + "  Tema: " + unaInvestigacion.getTemaInvestigado() + " Comentarios: " + unaInvestigacion.getComentarios() + " Dudas: " + unaInvestigacion.getDudasInvestigacion() + " Tiempo Dedicado: " + unaInvestigacion.getTiempoDedicadoInv() + " Nivel de comprensión: " + unaInvestigacion.getNivelComprension());
            }
        } else {
            System.out.println("No existe registro de investigaciones.");
        }
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
