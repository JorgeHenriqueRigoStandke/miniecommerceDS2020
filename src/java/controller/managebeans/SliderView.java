package controller.managebeans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

@Named(value = "sliderView")
@RequestScoped


public class SliderView {

    private int numero1;
    
    public int getNumero1() {
        return numero1;
    }
    
     public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

     
    public void onInputChanged(ValueChangeEvent event) {
        FacesMessage message = new FacesMessage("Input Changed", "Value: " + event.getNewValue());
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
