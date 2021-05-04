package controller.managebeans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;

/**
 *
 * @author João Vitor Schmidt
 */
@Named(value = "uploadImagem")
@RequestScoped
public class uploadImagem {

    private UploadedFile file;
    
    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }
    
    public void upload() {
        if (file != null) {
            FacesMessage message = new FacesMessage("Sucesso", file.getFileName() + " foi carregada.");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }
    
    public void handleFileUpload(FileUploadEvent event) {
        FacesMessage message = new FacesMessage("Sucesso", event.getFile().getFileName() + " foi carregada.");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
