package utils;

import javax.faces.context.FacesContext;

/** @author João Vitor Schmidt **/
public class Utilidades {
    
    public static Object recuperarSessao(String Chave){
        return FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(Chave);
    }
    public static boolean verificarExisteSessao(String Chave){
        return FacesContext.getCurrentInstance().getExternalContext().getSessionMap().containsKey(Chave);
    }
}
