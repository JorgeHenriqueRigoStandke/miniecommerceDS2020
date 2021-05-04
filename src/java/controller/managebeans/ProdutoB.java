package controller.managebeans;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import model.dao.ProdutoDAO;
import model.entity.ProdutoEntity;

/**@author João Vitor Schmidt*/

@Named(value = "produtoB")
@RequestScoped
public class ProdutoB {
    
    @Inject
    private ProdutoDAO ProdutoDAO;
    
    private Integer id;
    private String identificacao;
    private Integer preco;
    private String descricao;
    
    public List<ProdutoEntity> getTodosDados()
    {
        return ProdutoDAO.getMostrarTodosDados("produtoB.findAll");
    }
    
    public void salvarProduto()
    {
        ProdutoEntity p = new ProdutoEntity();
        
        p.setIdentificacao(identificacao);
        p.setPreco(preco);
        p.setDescricao(descricao);
        
        p = ProdutoDAO.salvar(p);
        
        if (p == null)
        {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage (FacesMessage.SEVERITY_INFO, "O cadastro não foi realizado, favor olhar o output!", ""));
        }
        else
        {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage (FacesMessage.SEVERITY_INFO, "O Produto " + identificacao + " foi cadastrado com sucesso!", ""));
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
