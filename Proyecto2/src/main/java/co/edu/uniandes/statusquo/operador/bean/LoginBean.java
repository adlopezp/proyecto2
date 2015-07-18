/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.statusquo.operador.bean;

import java.util.Date;
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
    private Date logonDate;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
    }

    public void loginAction() {

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
    
}
