/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author Sergio
 */
public class Tiempo {

    private static int horas;
    private static int minutos;
    private static int segundos;

    public Tiempo() {
    }

    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public static void suma() {
        
        if (segundos > 60) {
            segundos = segundos % 60;
            minutos = minutos + ((int) segundos / 60);
            if (minutos > 60) {
                minutos = minutos % 60;
                horas = horas + ((int) minutos / 60);
            }
        }

    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

}
