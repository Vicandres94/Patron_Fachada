
import Fachada.Facade;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Equipo
 */
public class Main {
    public static void main(String[] args) {
        Facade fachada = new Facade();
        fachada.arrancarCoche();
        System.out.println("Proceso finalizado.");
    }
}
