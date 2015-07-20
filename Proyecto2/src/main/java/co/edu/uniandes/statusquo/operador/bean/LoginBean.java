/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.statusquo.operador.bean;

import co.edu.uniandes.statusquo.utils.HelperMethods;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Alvaro
 */
@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean {

    private String usuario;
    private String password;
    private String seleccion;
    private String theme="start";
    private String template="master-page";
    private List<String> usuarios=new ArrayList<String>();
    private Date logonDate;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password; 
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void loginAction() {
        if (usuario != null && getUsuarios().contains(usuario.toLowerCase())) {
            //setTheme();
            //setTemplate();
            UtilBean.redirect("portal.jsf?faces-redirect=true");
        } else {
            HelperMethods.showMessageGrowl("Alerta","Error de usuario y Contraseña"); 
        }

    }

    public String getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }

    public Date getLogonDate() {
        return logonDate;
    }

    public void setLogonDate(Date logonDate) {
        this.logonDate = new Date();
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public List<String> getUsuarios() {
        this.usuarios.add("usuario");
        this.usuarios.add("centralizador");
        this.usuarios.add("entidad");
        return usuarios;
    }

    public void setUsuarios(List<String> usuarios) {
        this.usuarios = usuarios;
    }

}