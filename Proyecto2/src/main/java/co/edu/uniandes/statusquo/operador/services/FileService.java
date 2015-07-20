package co.edu.uniandes.statusquo.operador.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import co.edu.uniandes.statusquo.operador.business.StatusQuoFile;
 
@ManagedBean(name = "fileService")
@ApplicationScoped
public class FileService {
     
    private final static String[] paths;
     
    private final static String[] names;
    
    static {
    	paths = new String[10];
    	paths[0] = "/documents/user";
    	paths[1] = "/documents/user/folder";
    	paths[2] = "/documents/user/docs";
         
        names = new String[10];
        names[0] = "archivo1.txt";
        names[1] = "archivo2.txt";
        names[2] = "archivo3.txt";
        names[3] = "archivo4.doc";
        names[4] = "archivo5.xls";
        names[5] = "archivo6.jpg";
        names[6] = "archivo7.doc";
        names[7] = "archivo8.doc";
        names[8] = "archivo9.doc";
        names[9] = "archivo10.txt";
    }
     
    public List<StatusQuoFile> createFiles(int size) {
        List<StatusQuoFile> list = new ArrayList<>();
        for(int i = 0 ; i < size ; i++) {
        	String simpleName = getRandomName();
        	String path = getRandomPath();
            list.add(new StatusQuoFile(
            			getRandomId(), 
            			simpleName,
            			path + "/" + simpleName,
            			path,
            			getRandomSize(),
            			simpleName.substring(simpleName.length() - 3),
            			getRandomVersion()));
        }
         
        return list;
    }
     
    private int getRandomVersion() {
    	return (int) (Math.random() * 50 + 1024);
	}

	private String getRandomId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }
     
    private int getRandomSize() {
        return (int) (Math.random() * 50 + 1960);
    }
     
    private String getRandomName() {
        return names[(int) (Math.random() * 10)];
    }
     
    private String getRandomPath() {
        return paths[(int) (Math.random() * 3)];
    }
     
    public int getRandomPrice() {
        return (int) (Math.random() * 100000);
    }
     
    public boolean getRandomSoldState() {
        return (Math.random() > 0.5) ? true: false;
    }
 
}