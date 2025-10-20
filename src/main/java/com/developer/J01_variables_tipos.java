package com.developer;

public class J01_variables_tipos {
    // Variables:
    // - no pueden tener espacios
    // - no deben comenzar con numero
    // - deben ir en minusculas

    // nomenclatura o notacion para nombrar una variable
    // camelCase
        /* ejemplos:
        estudiante
        carreraDelEstudiante
        temperaturaDia
        */
    // snake_case
        /* ejemplos
        carrera_del_estudiante
        temperatura_dia
        * */

    // comentario en linea

        /* comentario en bloque
        hjkdsfhkdsjk
                kl;jashdfjksdhnf
                safasdfsd
        */

    // Declarar una variable
    int cantidad;

    // Inicializar una variable
    int progreso = 90;
/*

    // Asignar una variable
    cantidad = 1002;

    // Reasignacion
    cantidad = 6896;
*/

    // CONSTANTES

    final int poblacion = 2500000;
    // poblacion = 52; esto genera error

    // Tipos de Datos Primitivos

    int numero = 2147483647; // -2,147,483,648 hasta 2,147,483,647
    float grados = 20.5f; // aprox a 7 decimales
    double temperatura = 25.8; // 15 a 16 decimales
    byte num1 = 120; // -128 al 127
    short numberSh = 20000; // -32768 a 32767
    long numeroLargo = 9992147483647L; // -9,223,372,036,854,775,808 hasta 9,223,372,036,854,775,807.
    char letra = 'a';
    boolean verificado = false; // true o false
/*
        System.out.println("James Gosling");
        System.out.println(65465464);
        System.out.println(cantidad);
        System.out.println(poblacion);
        System.out.println(numeroLargo);

*/


}
