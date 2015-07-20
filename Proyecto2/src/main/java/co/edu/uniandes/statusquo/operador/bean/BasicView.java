package co.edu.uniandes.statusquo.operador.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import co.edu.uniandes.statusquo.operador.business.StatusQuoFile;
import co.edu.uniandes.statusquo.operador.services.FileService;
 
@ManagedBean(name="dtBasicView")
@ViewScoped
public class BasicView implements Serializable {
     
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<StatusQuoFile> files;
     
    @ManagedProperty("#{fileService}")
    private FileService service;
 
    @PostConstruct
    public void init() {
        files = service.createFiles(200);
    }
     
    public List<StatusQuoFile> getFiles() {
        return files;
    }
 
    public void setService(FileService service) {
        this.service = service;
    }
}