/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.statusquo.operador.bean.entidad;

import co.edu.uniandes.statusquo.operador.bean.entidad.data.DocumentoEntidad;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Alvaro
 */
@ManagedBean(name = "entidadDocumentosBean")
@SessionScoped
public class EntidadDocumentosBean {

    private String busqueda;
    private List<DocumentoEntidad> documentos;

    @PostConstruct
    public void init() {
        busqueda = "123456";
        documentos = new ArrayList<>();
        documentos.add(new DocumentoEntidad("Cedula", "Cedula de Ciudadania", "436 KB", "PDF"));
        documentos.add(new DocumentoEntidad("RUT", "RUT", "125 KB", "PDF"));
        documentos.add(new DocumentoEntidad("RIT", "RIT", "235 KB", "PDF"));
        documentos.add(new DocumentoEntidad("Hoja de Vida 2015", "Otro", "125 KB", "PDF"));
    }

    public String getBusqueda() {
        return busqueda;
    }

    public void setBusqueda(String busqueda) {
        this.busqueda = busqueda;
    }

    public List<DocumentoEntidad> getDocumentos() {
        return documentos;
    }
}
