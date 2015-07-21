package co.edu.uniandes.statusquo.operador.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import org.primefaces.event.NodeSelectEvent;
import org.primefaces.model.TreeNode;

import co.edu.uniandes.statusquo.operador.business.Document;
import co.edu.uniandes.statusquo.operador.services.DocumentService;
 
@ManagedBean(name="documentView")
public class DocumentView {
     
    private TreeNode root;
    
    private List<Document> currentDocuments;
     
    @ManagedProperty("#{documentService}")
    private DocumentService service;
     
    @PostConstruct
    public void init() {
        root = service.createDocuments();
    }
 
    public void setService(DocumentService service) {
        this.service = service;
    }
 
    public TreeNode getRoot() {
        return root;
    }
    
	public List<Document> getCurrentDocuments() {
		return currentDocuments;
	}

	public void setCurrentDocuments(List<Document> currentDocuments) {
		this.currentDocuments = currentDocuments;
	}

	public void onNodeSelect(NodeSelectEvent event) {
		currentDocuments = ((Document) event.getTreeNode().getData()).getListDocuments();
    }

}