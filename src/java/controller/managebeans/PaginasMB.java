package controller.managebeans;

/*@author João Vitor Schmidt*/
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "paginasMB")
@RequestScoped
public class PaginasMB {

    public PaginasMB() {
    }
    
    private int produto;

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    public String getPaginaCadastroCliente() {
        return "cadastroCliente";
    }

    public String getPaginaIndex() {
        return "index";
    }

    public String getPaginaCarrinho() {
        return "carrinho";
    }

    public String getPaginaListaProdutos() {
        return "listaProdutos";
    }

    public String getPaginaLoginCliente() {
        return "loginCliente";
    }

    public String getPaginaLoginAdmin() {
        return "loginAdmin";
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

    public String getPaginaDetalhesProduto(int a) {
        setProduto(a);
        return "detalhesProduto";
    }

    public String getPaginaFuncoesAdmin() {
        return "funcoesAdmin";
    }

}
