package lab1dui.gestor;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import lab1d.cl.*;

public class Gestor {

    CL logic = new CL();

    public Gestor() {
    }

    public void registrarEmpleado(String puestoEmpleado, String cedulaEmpleado, String nombreEmpleado, String apellidoEmpleado, String direccionEmpleado, String telefonoEmpleado) {
        Empleado miEmpleado = new Empleado(puestoEmpleado, cedulaEmpleado, nombreEmpleado, apellidoEmpleado, direccionEmpleado, telefonoEmpleado);
        logic.registrarEmpleado(miEmpleado);
    }

    public void registrarProfesor(String lugarTrabajoProfesor, int annosExperienciaProfesor, String cedulaProfesor, String nombreProfesor, String apellidoProfesor, String direccionProfesor, String telefonoProfesor) {
        Profesor miProfesor = new Profesor(lugarTrabajoProfesor, annosExperienciaProfesor, cedulaProfesor, nombreProfesor, apellidoProfesor, direccionProfesor, telefonoProfesor);
        logic.registrarProfesor(miProfesor);
    }

    public void registrarLaboratorio(int codigoLaboratorio, String nombreLaboratorio, int capacidadLaboratorio) {
        Laboratorio miLaboratorio = new Laboratorio(codigoLaboratorio, nombreLaboratorio, capacidadLaboratorio);
        logic.registrarLaboratorio(miLaboratorio);
    }

    public void registrarCurso(String codigoCurso, String nombreCurso, int creditosCurso) {
        Curso miCurso = new Curso(codigoCurso, nombreCurso, creditosCurso);
        logic.registrarCurso(miCurso);
    }

    public void registrarCarrera(String codigoCarrera, String nombreCarrera, String gradoCarrera, Boolean acreditadaCarrera) {
        Carrera miCarrera = new Carrera(codigoCarrera, nombreCarrera, gradoCarrera, acreditadaCarrera);
        logic.registrarCarrera(miCarrera);
    }

    public void registrarReservaLaboratorio(int codigoUniqLaboratorioReserva, int codigoLaboratorioReserva, String codigoCursoReserva, String cedulaProfesorReserva, int cantEstudiantesReserva, LocalDate fechaReserva) throws IOException {
        Curso miCurso = logic.buscarCurso(codigoCursoReserva);
        Laboratorio miLaboratorio = logic.buscarLaboratorio(codigoLaboratorioReserva);
        Profesor miProfesor = logic.buscarProfesor(cedulaProfesorReserva);

        ReservaLaboratorio miReservaLaboratorio = new ReservaLaboratorio(codigoUniqLaboratorioReserva, miLaboratorio, miCurso, miProfesor, cantEstudiantesReserva, fechaReserva);
        logic.registrarReservaLaboratorio(miReservaLaboratorio);
    }

    public ArrayList<String> listarLaboratorios() {
        ArrayList<String> laboratoriosString = new ArrayList<>();
        logic.listarLaboratorios().forEach((miLaboratorio) -> {
            laboratoriosString.add(miLaboratorio.toStringUI());
        });
        return laboratoriosString;
    }

    public ArrayList<String> listarCursos() {
        ArrayList<String> cursosString = new ArrayList<>();
        logic.listarCursos().forEach((miCurso) -> {
            cursosString.add(miCurso.toStringUI());
        });
        return cursosString;
    }

    public ArrayList<String> listarCarreras() throws IOException {
        ArrayList<String> carrerasString = new ArrayList<>();
        logic.listarCarreras().forEach((miCarrera) -> {
            carrerasString.add(miCarrera.toStringUI());
        });
        return carrerasString;
    }

    public ArrayList<String> listarEmpleados() throws IOException {
        ArrayList<String> empleadosString = new ArrayList<>();
        logic.listarEmpleados().forEach((miEmpleado) -> {
            empleadosString.add(miEmpleado.toStringUI());
        });
        return empleadosString;
    }

    public ArrayList<String> listarProfesores() throws IOException {
        ArrayList<String> profesoresString = new ArrayList<>();
        logic.listarProfesores().forEach((miProfesor) -> {
            profesoresString.add(miProfesor.toStringUI());
        });
        return profesoresString;
    }

    public ArrayList<String> listarReservasLaboratorio() throws IOException {
        ArrayList<String> reservasLaboratorioString = new ArrayList<>();
        logic.listarReservasLaboratorio().forEach((miReservaLaboratorio) -> {
            reservasLaboratorioString.add(miReservaLaboratorio.toStringUI());
        });
        return reservasLaboratorioString;
    }
}
