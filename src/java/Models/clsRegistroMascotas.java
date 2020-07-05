/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author MIGUEL
 */
public class clsRegistroMascotas {
    
    
    public String getStFecha() {
        return stFecha;
    }

    public void setStFecha(String stFecha) {
        this.stFecha = stFecha;
    }

    public int getInIdMascota() {
        return inIdMascota;
    }

    public void setInIdMascota(int inIdMascota) {
        this.inIdMascota = inIdMascota;
    }

    public String getStNombreMascota() {
        return stNombreMascota;
    }

    public void setStNombreMascota(String stNombreMascota) {
        this.stNombreMascota = stNombreMascota;
    }

    public String getStRaza() {
        return stRaza;
    }

    public void setStRaza(String stRaza) {
        this.stRaza = stRaza;
    }

    public int getInEdad() {
        return inEdad;
    }

    public void setInEdad(int inEdad) {
        this.inEdad = inEdad;
    }

    public int getInPeso() {
        return inPeso;
    }

    public void setInPeso(int inPeso) {
        this.inPeso = inPeso;
    }

    public clsEspecie getObclsEspecie() {
        return obclsEspecie;
    }

    public void setObclsEspecie(clsEspecie obclsEspecie) {
        this.obclsEspecie = obclsEspecie;
    }

    public clsSexo getObclsSexo() {
        return obclsSexo;
    }

    public void setObclsSexo(clsSexo obclsSexo) {
        this.obclsSexo = obclsSexo;
    }

    public clsTamaño getObclsTamaño() {
        return obclsTamaño;
    }

    public void setObclsTamaño(clsTamaño obclsTamaño) {
        this.obclsTamaño = obclsTamaño;
    }
    public String stFecha;
    public int inIdMascota;
    public String stNombreMascota;
    public String stRaza;
    public int inEdad;
    public int inPeso;
    public clsEspecie obclsEspecie;
    public clsSexo obclsSexo;
    public clsTamaño obclsTamaño;

    
}
