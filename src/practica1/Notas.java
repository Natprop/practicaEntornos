package practica1;

import java.util.Scanner;

/**
 * Clase encargada de gestionar la introducción, validación, cálculo y visualización de notas.
 * 
 * @author Luis Hernandez
 * @version 1.0
 * @since 2025
 */
public class Notas {
    /**
     * Calificación de la primera unidad formativa.
     */
    private double uf1;
    
    /**
     * Calificación de la segunda unidad formativa.
     */
    private double uf2;
    
    /**
     * Calificación de la tercera unidad formativa.
     */
    private double unidad3;
    
    /**
     * Cálculo ponderado de la primera nota.
     */
    private double acu1;
    
    /**
     * Cálculo ponderado de la segunda nota.
     */
    private double acu2;
    
    /**
     * Cálculo ponderado de la tercera nota.
     */
    private double acu3;
    
    /**
     * Nota final calculada a partir de las ponderaciones.
     */
    private double definitiva;
    
    /**
     * Scanner para la entrada de datos del usuario.
     */
    private Scanner entrada = new Scanner(System.in);

    /**
     * Constructor predeterminado de la clase Notas.
     * Este constructor es proporcionado automáticamente por Java.
     * No requiere inicialización adicional.
     */
    public Notas() {
        // Constructor vacío, no se requiere ninguna inicialización adicional
    }

    /**
     * Solicita al usuario que introduzca las calificaciones.
     */
    public void pedirNotas() {
        System.out.println("Introduzca las calificaciones del estudiante");
        System.out.print("Ingrese la primera nota: ");
        uf1 = entrada.nextDouble();
        System.out.print("Ingrese la segunda nota: ");
        uf2 = entrada.nextDouble();
        System.out.print("Ingrese la tercera nota: ");
        unidad3 = entrada.nextDouble();
    }

    /**
     * Verifica si las calificaciones ingresadas están dentro del rango válido (0-10).
     */
    public void validarNotas() {
        if (uf1 > 10 || uf1 < 0) {
            System.out.println("La primera nota es incorrecta");
        } else {
            System.out.println("La primera nota es válida");
        }
        if (uf2 > 10 || uf2 < 0) {
            System.out.println("La segunda nota es incorrecta");
        } else {
            System.out.println("La segunda nota es válida");
        }
        if (unidad3 > 10 || unidad3 < 0) {
            System.out.println("La tercera nota es incorrecta");
        } else {
            System.out.println("La tercera nota es válida");
        }
    }

    /**
     * Calcula la nota definitiva basada en las ponderaciones de cada unidad formativa.
     */
    public void calcularDefinitiva() {
        acu1 = uf1 * 0.35;
        acu2 = uf2 * 0.35;
        acu3 = unidad3 * 0.30;
        definitiva = acu1 + acu2 + acu3;
    }

    /**
     * Muestra las calificaciones ingresadas junto con los cálculos realizados.
     */
    public void mostrarResultados() {
        System.out.println("Notas registradas:");
        System.out.println("Nota 1 = " + uf1);
        System.out.println("Nota 2 = " + uf2);
        System.out.println("Nota 3 = " + unidad3);
        System.out.println("Ponderación 1 = " + acu1);
        System.out.println("Ponderación 2 = " + acu2);
        System.out.println("Ponderación 3 = " + acu3);
        System.out.println("Calificación final = " + definitiva);
    }

    /**
     * Determina si el estudiante ha aprobado o suspendido en función de la nota final.
     */
    public void determinarAprobacion() {
        if (definitiva < 5 && definitiva >= 0) {
            System.out.println("El estudiante ha suspendido");
        } else if (definitiva >= 5 && definitiva <= 10) {
            System.out.println("El estudiante ha aprobado");
        } else {
            System.out.println("Error en las calificaciones");
        }
    }

    /**
     * Método principal que ejecuta el programa.
     * 
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        Notas gestionNotas = new Notas();
        gestionNotas.pedirNotas();
        gestionNotas.validarNotas();
        gestionNotas.calcularDefinitiva();
        gestionNotas.mostrarResultados();
        gestionNotas.determinarAprobacion();
    }
}
