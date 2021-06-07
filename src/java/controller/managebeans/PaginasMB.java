package controller.managebeans;

/*@author João Vitor Schmidt*/
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "paginasMB")
@RequestScoped
public class PaginasMB {

    public PaginasMB() {
    }
    private static Double precototal = 0.0;
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
        return "adminCadastroProdutos?faces-redirect-true";
    }

    public String getPaginaVisaoGeral() {
        return "adminVisaoGeral?faces-redirect-true";
    }

    public String getPaginaCadastroClientes() {
        return "cadastroCliente";
    }

    public String getPaginaDetalhesProduto() {
        return "detalhesProduto";
    }

    public String getPaginaFuncoesAdmin() {
        return "funcoesAdmin?faces-redirect-true";
    }

    public static Double getPrecototal() {
        return precototal;
    }

    public static void setPrecototal(Double aPrecototal) {
        precototal = aPrecototal;
    }
    public static void somarPrecos(Double valor){
        Double valor1;       
        valor1 = getPrecototal();
        System.out.println("RTESTEWAJDAJSH"+valor1+" - "+ valor);
        valor1 = valor1 + valor;
        System.out.println("valor 1: "+valor1+" - "+ valor);
        setPrecototal(valor1);
        System.out.println(valor1);
    }
}
