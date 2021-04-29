package controller.managebeans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author jorge
 */
@Named(value = "paginasMB")
@RequestScoped
public class PaginasMB {

    public PaginasMB() {
    }
    
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
}
