/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_angelrisso;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP_AMD_64
 */
public class Universo {

    private String nombre;
    public ArrayList<Ser_vivo> habitantes = new ArrayList();

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

    public void escribir() {
        File f = null;
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                bw.flush();
                Thread.sleep(500);
                bw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Multiverso.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(Multiverso.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
    }
    public void abrir() {
        
    }
}
