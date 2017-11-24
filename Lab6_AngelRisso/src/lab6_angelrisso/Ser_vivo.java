/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_angelrisso;

/**
 *
 * @author HP_AMD_64
 */
public class Ser_vivo {
    public String raza;
    public int ki;
    public int años;
    public String planeta;

    public Ser_vivo() {
    }

    public Ser_vivo(String raza, int ki, int años, String planeta) {
        this.raza = raza;
        this.ki = ki;
        this.años = años;
        this.planeta = planeta;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getKi() {
        return ki;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    @Override
    public String toString() {
        return  raza +" "+ planeta ;
    }
    
}
