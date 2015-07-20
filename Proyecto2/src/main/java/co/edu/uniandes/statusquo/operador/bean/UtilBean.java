/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.statusquo.operador.bean;

import java.io.IOException;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author Alvaro
 */
@ManagedBean(name = "utilBean")
@RequestScoped
public class UtilBean {

    public Date getCurrentTime() {
        return new Date();
    }

    public static void redirect(final String url) {
        final ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        try {
            context.redirect(url);
        } catch (final IOException ex) {
        }
    }

    public static void printException(final Exception ex) {
        ex.printStackTrace(System.out);
        final FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error Grave", "Ocurrió un error en el sistema");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public static void printMensaje(final String msj) {
        final FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Mensaje", msj);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
