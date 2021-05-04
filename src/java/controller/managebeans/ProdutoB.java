package controller.managebeans;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import model.dao.ProdutoDAO;
import model.entity.Produto;

/**@author João Vitor Schmidt*/

@Named(value = "produtoB")
@RequestScoped
public class ProdutoB {
    
    @Inject
    private ProdutoDAO ProdutoDAO;
    
    private Integer id;
    private String nome;
    private String foto;
    private Double preco;
    private String descricao;
    
    public List<Produto> getTodosDados()
    {
        return ProdutoDAO.getAllResults("produto.findAll");
    }
    
    public void salvarProduto()
    {
        Produto p = new Produto();
        
        p.setNome(nome);
        p.setPreco(preco);
        p.setDescricao(descricao);
        p.setFoto(foto);
        
        p = ProdutoDAO.save(p);
        
        if (p == null)
        {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage (FacesMessage.SEVERITY_INFO, "O cadastro não foi realizado, favor olhar o output!", ""));
        }
        else
        {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage (FacesMessage.SEVERITY_INFO, "O Produto " + nome + " foi cadastrado com sucesso!", ""));
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
