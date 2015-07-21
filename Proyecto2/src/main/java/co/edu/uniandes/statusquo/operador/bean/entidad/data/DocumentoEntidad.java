/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.statusquo.operador.bean.entidad.data;

/**
 *
 * @author Alvaro
 */
public class DocumentoEntidad {

    private String nombre;
    private String tipo;
    private String size;
    private String formato;

    public DocumentoEntidad(String nombre, String tipo, String size, String formato) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.size = size;
        this.formato = formato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
