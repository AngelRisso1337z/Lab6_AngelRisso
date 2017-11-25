/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_angelrisso;

import java.io.*;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import java.util.Scanner;

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

    public void escribir(ArrayList univ, File f) {

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            for (Object o : univ) {
                String t = (String) o;
                bw.write(t);
                bw.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

                bw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Multiverso.class.getName()).log(Level.SEVERE, null, ex);

            }

        }

    }

    public void abrir(File f) {
        if (f.exists()) {
            Scanner sc;
            Scanner scl;
            habitantes = new ArrayList();
            try {
                sc = new Scanner(f);
                sc.useDelimiter("\n");
                while (sc.hasNext()) {
                    scl = new Scanner(sc.next());
                    scl.useDelimiter("\\|");
                    habitantes.add(new Ser_vivo(scl.next(), scl.nextInt(), scl.nextInt(), scl.next()));
                    scl.close();
                }
                sc.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
