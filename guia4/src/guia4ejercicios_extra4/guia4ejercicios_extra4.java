/*
4. Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.





 */
package guia4ejercicios_extra4;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia4ejercicios_extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[][] alumno = new String[10][6];
        int aprobado = 0, reprobado = 0;
        for (int i = 0; i < 10; i++) {
            Scanner leer = new Scanner(System.in);
            System.out.print(" Ingresar Nombre del Alumno: ");
            alumno[i][0] = leer.next();
            System.out.println("");

            cargarNota(alumno, i);
           
        }
          imprimir(alumno);
        
        for (int j = 0; j < 10; j++) {
            if (Double.parseDouble(alumno[j][5]) >= 7) {
                aprobado = aprobado + 1;
            } else {
                reprobado = reprobado + 1;
            }
        }
        System.out.println("");
        System.out.println("Alumnos aprobados = " + aprobado);
        System.out.println("Alumnos aprobados = " + reprobado);

    }

    static public String[][] cargarNota(String[][] alumno, int i) {

        Scanner leer = new Scanner(System.in);
        double nota = 0, notaPromedio = 0;

        System.out.println("Ingresar Nota Primer trabajo práctico evaluativo (10%)");
        nota = leer.nextDouble();
        nota = validar(nota);
        nota = nota * 0.10;
        notaPromedio = notaPromedio + nota;

        alumno[i][1] = String.valueOf(nota);

        System.out.println("Ingresar Nota Segundo trabajo práctico evaluativo (15%)");
        nota = leer.nextDouble();
        nota = validar(nota);
        nota = nota * 0.15;
        notaPromedio = notaPromedio + nota;

        alumno[i][2] = String.valueOf(nota);

        System.out.println("Ingresar Nota Primer Integrador (25%)");
        nota = leer.nextDouble();
        nota = validar(nota);
        nota = nota * 0.25;
        notaPromedio = notaPromedio + nota;

        alumno[i][3] = String.valueOf(nota);

        System.out.println("Ingresar Nota Segundo integrador (50%)");
        nota = leer.nextDouble();
        nota = validar(nota);
        nota = nota * 0.50;
        notaPromedio = notaPromedio + nota;

        alumno[i][4] = String.valueOf(nota);

        alumno[i][5] = String.valueOf(notaPromedio);

        return alumno;

    }

    static public double validar(double nota) {
        Scanner leer = new Scanner(System.in);

        do {
            if (nota < 0 || nota >= 10) {

                System.out.println("Nota no valida , ingresar nuevamente");
                nota = leer.nextDouble();
                System.out.println("");
            }

        } while (nota < 0 || nota >= 10);

        return nota;

    }
static public void imprimir(String[][]alumno){
    
    for (int i = 0; i < 10; i++) {
        System.out.print("Alumno " + alumno [i][0] + " N1 "+alumno [i][1]+" N2 "+ alumno [i][2]+" N3 " + alumno [i][3] + " N4 " + alumno [i][4] + " Promedio " + alumno [i][5]);
        System.out.println("");
        
    }
    
}
    
    
    
    
    
}
