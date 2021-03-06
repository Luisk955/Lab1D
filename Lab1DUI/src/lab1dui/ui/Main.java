package lab1dui.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.time.LocalDate;
import lab1dui.gestor.Gestor;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static Gestor ctrl = new Gestor();

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        int opcion = 0;
        boolean salir = true;

        do {
            mostrarMenu();
            opcion = leerOpcionDelMenu();
            salir = ejecutarAccionDelMenu(opcion);
        } while (salir == false);
    }

    static void mostrarMenu() {
        System.out.println("");
        System.out.println("1.Registrar empleado");
        System.out.println("2.Registrar profesor");
        System.out.println("3.Registrar carrera");
        System.out.println("4.Listar carreras");
        System.out.println("5.Registrar curso");
        System.out.println("6.Listar cursos");
        System.out.println("7.Registrar laboratorio");
        System.out.println("8.Listar laboratorios");
        System.out.println("9.Eliminar laboratorio");
        System.out.println("10.Registrar reserva de laboratorio");
        System.out.println("11.Listar reserva de laboratorio");
        System.out.println("12.Listar empleados");
        System.out.println("13.Listar profesores");
    }

    static int leerOpcionDelMenu() throws IOException {
        int opcion = 0;
        System.out.println("Ingrese una opcion");
        opcion = Integer.parseInt(in.readLine());
        return opcion;
    }

    private static boolean ejecutarAccionDelMenu(int opcion) throws IOException {
        boolean salir = false;
        switch (opcion) {
            case 1:
                registrarEmpleado();
                break;
            case 2:
                registrarProfesor();
                break;
            case 3:
                registrarCarrera();

                break;
            case 4:
                listarCarreras();

                break;
            case 5:
                registrarCurso();

                break;
            case 6:
                listarCursos();

                break;
            case 7:
                registrarLaboratorio();

                break;
            case 8:
                listarLaboratorios();

                break;

            case 9:
//                eliminarLaboratorio();
                break;

            case 10:
                registrarReservaLaboratorio();
                break;

            case 11:
                listarReservasLaboratorio();

                break;
            case 12:
                listarEmpleados();

                break;
            case 13:
                listarProfesores();

                break;

        }

        return salir;
    }

    public static void registrarEmpleado() throws IOException {

        System.out.println("Registro de empleado");
        System.out.println("------------------------");

        String puestoEmpleado;
        String cedulaEmpleado;
        String nombreEmpleado;
        String apellidoEmpleado;
        String direccionEmpleado;
        String telefonoEmpleado;

        System.out.println("Ingrese el puesto del empleado");
        puestoEmpleado = in.readLine();

        System.out.println("Ingrese la cédula del empleado");
        cedulaEmpleado = in.readLine();

        System.out.println("Ingrese el nombre del empleado");
        nombreEmpleado = in.readLine();

        System.out.println("Ingrese el primer apellido del empleado");
        apellidoEmpleado = in.readLine();

        System.out.println("Ingrese la dirección el empleado");
        direccionEmpleado = in.readLine();

        System.out.println("Ingrese el número telefónico del empleado");
        telefonoEmpleado = in.readLine();

        ctrl.registrarEmpleado(puestoEmpleado, cedulaEmpleado, nombreEmpleado, apellidoEmpleado, direccionEmpleado, telefonoEmpleado);

    }

    public static void registrarProfesor() throws IOException {

        System.out.println("Registro de profesor");
        System.out.println("------------------------");

        String lugarTrabajoProfesor;
        int annosExpProfesor;
        String cedulaProfesor;
        String nombreProfesor;
        String apellidoProfesor;
        String direccionProfesor;
        String telefonoProfesor;

        System.out.println("Ingrese el lugar de trabajo del profesor");
        lugarTrabajoProfesor = in.readLine();

        System.out.println("Ingrese los años de experiencia del profesor");
        annosExpProfesor = Integer.parseInt(in.readLine());

        System.out.println("Ingrese la cédula del profesor");
        cedulaProfesor = in.readLine();

        System.out.println("Ingrese el nombre del profesor");
        nombreProfesor = in.readLine();

        System.out.println("Ingrese el primer apellido del profesor");
        apellidoProfesor = in.readLine();

        System.out.println("Ingrese la dirección del profesor");
        direccionProfesor = in.readLine();

        System.out.println("Ingrese el número telefónico del profesor");
        telefonoProfesor = in.readLine();

        ctrl.registrarProfesor(lugarTrabajoProfesor, annosExpProfesor, cedulaProfesor, nombreProfesor, apellidoProfesor, direccionProfesor, telefonoProfesor);

    }

    public static void registrarCarrera() throws IOException {

        System.out.println("Registro de carrera");
        System.out.println("------------------------");

        String codigoCarrera;
        String nombreCarrera;
        String gradoCarrera;
        Boolean acreditadaCarrera;

        System.out.println("Ingrese el código de la carrera");
        codigoCarrera = in.readLine();

        System.out.println("Ingrese el nombre de la carrera");
        nombreCarrera = in.readLine();

        System.out.println("Ingrese el grado de la carrera: Técnico, Diplomado, Bachillerato, Licenciatura y Maestría");
        gradoCarrera = in.readLine();

        System.out.println("Ingrese 'y' si carrera está acreditada o 'n' si no lo está.");
        if ("y" == in.readLine()) {
            acreditadaCarrera = true;
        } else {
            acreditadaCarrera = false;
        }

        ctrl.registrarCarrera(codigoCarrera, nombreCarrera, gradoCarrera, acreditadaCarrera);
    }

    public static void registrarCurso() throws IOException {

        System.out.println("Registro de curso");
        System.out.println("------------------------");

        String codigoCurso;
        String nombreCurso;
        int creditosCurso;

        System.out.println("Ingrese el código del curso");
        codigoCurso = in.readLine();

        System.out.println("Ingrese el nombre del curso");
        nombreCurso = in.readLine();

        System.out.println("Ingrese la cantidad de créditos del curso");
        creditosCurso = Integer.parseInt(in.readLine());

        ctrl.registrarCurso(codigoCurso, nombreCurso, creditosCurso);
    }

    public static void registrarLaboratorio() throws IOException {

        System.out.println("Registro de laboratorio");
        System.out.println("------------------------");

        int codigoLaboratorio;
        String nombreLaboratorio;
        int capacidadLaboratorio;

        System.out.println("Ingrese el código del laboratorio");
        codigoLaboratorio = Integer.parseInt(in.readLine());

        System.out.println("Ingrese el nombre del laboratorio");
        nombreLaboratorio = in.readLine();

        System.out.println("Ingrese la capacidad del laboratorio");
        capacidadLaboratorio = Integer.parseInt(in.readLine());

        ctrl.registrarLaboratorio(codigoLaboratorio, nombreLaboratorio, capacidadLaboratorio);
    }

    public static void registrarReservaLaboratorio() throws IOException {

        int codigoUniqLaboratorioReserva;
        int codigoLaboratorioReserva;
        String codigoCursoReserva;
        String cedulaProfesorReserva;
        int cantEstudiantesReserva;
        LocalDate fechaReserva;

        System.out.println("Ingrese el código de la reserva");
        codigoUniqLaboratorioReserva = Integer.parseInt(in.readLine());

        listarLaboratorios();
        System.out.println("Ingrese el código del laboratorio que desea reservar");
        codigoLaboratorioReserva = Integer.parseInt(in.readLine());

        listarCursos();
        System.out.println("Ingrese el código del curso para la reserva");
        codigoCursoReserva = in.readLine();

        listarProfesores();
        System.out.println("Ingrese la cédula del profesor responsable de la reserva");
        cedulaProfesorReserva = in.readLine();

        System.out.println("Ingrese la cantidad de estudiantes");
        cantEstudiantesReserva = Integer.parseInt(in.readLine());

        System.out.println("Ingrese la fecha de la reserva");
        fechaReserva = crearFecha();

        ctrl.registrarReservaLaboratorio(codigoUniqLaboratorioReserva, codigoLaboratorioReserva, codigoCursoReserva, cedulaProfesorReserva, cantEstudiantesReserva, fechaReserva);
    }

    public static void listarCursos() {
        System.out.println("Lista de Cursos");
        for (String data : ctrl.listarCursos()) {
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(data);
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    public static void listarCarreras() throws IOException {
        System.out.println("Lista de Carreras");
        for (String data : ctrl.listarCarreras()) {
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(data);
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    public static void listarLaboratorios() {
        System.out.println("Lista de Laboratorios");
        for (String data : ctrl.listarLaboratorios()) {
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(data);
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    public static void listarEmpleados() throws IOException {
        System.out.println("Lista de Empleados");
        for (String data : ctrl.listarEmpleados()) {
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(data);
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    public static void listarProfesores() throws IOException {
        System.out.println("Lista de Profesores");
        for (String data : ctrl.listarProfesores()) {
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(data);
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    public static LocalDate crearFecha() throws IOException {
        LocalDate fecha;
        int mes;
        int year;
        int dia;
        out.println("Digite el dia");
        dia = Integer.parseInt(in.readLine());

        out.println("Digite el mes");
        mes = Integer.parseInt(in.readLine());

        out.println("Digite el año");
        year = Integer.parseInt(in.readLine());

        fecha = LocalDate.of(year, mes, dia);

        return fecha;
    }

    public static void listarReservasLaboratorio() throws IOException {
        System.out.println("Lista de Reservas de laboratorio");
        for (String data : ctrl.listarReservasLaboratorio()) {
            System.out.println("---------------------------------------------------");
            System.out.println(data);
        }
    }
}
