import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
       // runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller empleadoContoller= new EmpleadoContoller();
        empleadoContoller.addEmpleado(new Empleado(1, "Vivi", "Develope"));
        empleadoContoller.addEmpleado(new Empleado(5, "Maria", "Analyst"));
        empleadoContoller.addEmpleado(new Empleado(3, "Esteban", "Develope"));
        empleadoContoller.addEmpleado(new Empleado(400, "Angel", "Tester"));

        empleadoContoller.imprimirEmpledos();
       // throw new UnsupportedOperationException("Not implemented yet");
    }

    private static void runMapExamlpe() {
        new Mapa();

        //throw new UnsupportedOperationException("Not implemented yet");
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
