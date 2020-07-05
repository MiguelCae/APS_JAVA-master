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

    public String getStEdad() {
        return stEdad;
    }

    public void setStEdad(String stEdad) {
        this.stEdad = stEdad;
    }

    public String getStPeso() {
        return stPeso;
    }

    public void setStPeso(String stPeso) {
        this.stPeso = stPeso;
    }
    

    public int getInCodigo() {
        return inCodigo;
    }

    public void setInCodigo(int inCodigo) {
        this.inCodigo = inCodigo;
    }
    public int inCodigo;
    public String stFecha;
    public int inIdMascota;
    public String stNombreMascota;
    public String stRaza;
    public String stEdad;
    public String stPeso;
    public clsEspecie obclsEspecie;
    public clsSexo obclsSexo;
    public clsTamaño obclsTamaño;

    //Estar pendiente de estos dos metodo que se generaron automaticamente squiza  puen generar error con sultar https://www.youtube.com/watch?v=_y8TpZyY2IE
    public void setInIdMascota(String txtIdMascota) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setStDescripcion(String stDescripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
