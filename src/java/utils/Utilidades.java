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
    
    public static Object salvaRegistroSessao(String registro, Object objeto)
    {
        return FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put(registro, objeto);
    }
    
    public static boolean verificaExisteRegistroSessao(String registro)
    {
        return FacesContext.getCurrentInstance().getExternalContext().getSessionMap().containsKey(registro);
    }
    
    public static Object recuperaRegistroSessao(String registro)
    {
        return FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(registro);
    }
}
