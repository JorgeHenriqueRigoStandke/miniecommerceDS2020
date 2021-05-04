package controller.managebeans;

/*@author Felipe Girardi Macedo*/

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "paginasMB")
@RequestScoped
public class PaginasMB {

    public PaginasMB() {
    }
    
<<<<<<< HEAD
    public String getPaginaCadastroCliente(){
        return "cadastroCliente";
    }
    
    public String getPaginaIndex(){
        return "index";
    }
    
    public String getPaginaCarrinho(){
        return "carrinho";
    }
    
    public String getPaginaListaProdutos(){
        return "listaProdutos";
    }
    
    public String getPaginaLoginCliente(){
        return "loginCliente";
    }
    
    public String getPaginaLoginAdmin(){
        return "loginAdmin";
    }
    
    public String getPaginaDetalhesProdutos(){
        return "detalhesProdutos";
    }
    
    
=======
    public String getPaginaInicio() {
        return "index";
    }
    
    public String getPaginaCadastroProdutos() {
        return "adminCadastroProdutos";
    }
    
    public String getPaginaVisaoGeral() {
        return "adminVisaoGeral";
    }
    
    public String getPaginaCadastroClientes() {
        return "cadastroCliente";
    }
    
    public String getPaginaCarrinho() {
        return "carrinho";
    }
    
    public String getPaginaDetalhesProdutos() {
        return "detalhesProdutos";
    }
    
    public String getPaginaFuncoesAdmin() {
        return "funcoesAdmin";
    }
    
    public String getPaginaListaProdutos() {
        return "listaProdutos";
    }
    
    public String getPaginaLoginAdmin() {
        return "loginAdmin";
    }
    
    public String getPaginaLoginCliente() {
        return "loginCliente";
    }
>>>>>>> 2700f672845c253014f5407318580701171bfb7d
}
