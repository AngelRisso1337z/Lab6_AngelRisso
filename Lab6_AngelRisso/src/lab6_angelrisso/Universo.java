/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_angelrisso;

import java.util.ArrayList;

/**
 *
 * @author HP_AMD_64
 */
public class Universo {
    private String nombre;
    private ArrayList<Ser_vivo>habitantes=new ArrayList();

    public Universo() {
    }

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ser_vivo> getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(ArrayList<Ser_vivo> habitantes) {
        this.habitantes = habitantes;
    }

    public void setHabitantes(Ser_vivo v) {
        this.habitantes.add(v);
    }

    @Override
    public String toString() {
        return "Universo " + nombre;
    }
    
    
    
}
