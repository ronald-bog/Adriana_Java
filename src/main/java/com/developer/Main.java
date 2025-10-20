package com.developer;

// anovoa-eng
// Documentacion oficial

public class Main {
    public static void main(String[] args) {

        int fecha = 523;
        String planeta = "saturno es el quinto planeta";

        // METODOS DE LOS STRINGS (CLASE STRING)

        // length()
        //System.out.println(planeta.length());

        // charAt()
        //System.out.println(planeta.charAt(14));

        // subString()
        System.out.println(planeta.substring(1, 3));
        System.out.println(planeta.substring(8, 10));
        System.out.println(planeta.substring(14, 20));
        System.out.println(planeta.substring(14));

        // indexOf()
        System.out.println(planeta.indexOf("p"));

        // toUpperCase() toLowerCase()

        System.out.println(planeta.toUpperCase());
        System.out.println(planeta.toLowerCase());

        String student = "ADRIANA";
        System.out.println(student.toLowerCase());
    }
}