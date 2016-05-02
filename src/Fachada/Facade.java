/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachada;

import SubSistemas.Arrancar;
import SubSistemas.ComprobarAsiento;
import SubSistemas.ComprobarEspejos;
import SubSistemas.ComprobarLiquidos;

/**
 *
 * @author Equipo
 */
public class Facade {
    private final ComprobarLiquidos liquidos;
    private final ComprobarAsiento asiento;
    private final ComprobarEspejos espejos;
    private final Arrancar arrancar;
    // --------------------------------
    public Facade()
    {
        this.liquidos = new ComprobarLiquidos();
        this.asiento  = new ComprobarAsiento();
        this.espejos  = new ComprobarEspejos();
        this.arrancar = new Arrancar();
    }
    
        // --------------------------------
     public void arrancarCoche()
    {
        liquidos.comprobar();
        asiento.comprobar();
        espejos.comprobar();
        arrancar.encender();
    }
}
