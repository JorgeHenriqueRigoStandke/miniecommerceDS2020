package controller.managebeans;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.ServletContext;
import model.dao.ProdutoDAO;
import model.entity.Produto;
import org.primefaces.model.file.UploadedFile;

/**@author João Vitor Schmidt*/

@Named(value = "produtoB")
@RequestScoped
public class ProdutoB {
    
    private List<Produto> carrinho;
    
    @Inject
    private ProdutoDAO ProdutoDAO;
    
    private Integer id;
    private String nome;
    private Double preco;
    private String foto;
    private UploadedFile imagemProduto;
    private String descricao;
    private String quant;
    
    public List<Produto> getTodosDados()
    {
        return ProdutoDAO.getAllResults("produto.findAll");
    }
    
    public ProdutoB()
    {
        carrinho = new ArrayList<>();
        
        if(utils.Utilidades.verificaExisteRegistroSessao("carrinho"))
        {
            carrinho = (List<Produto>) utils.Utilidades.recuperaRegistroSessao("carrinho");
        }
    }
    
    public void adiocionarCarrinho(Produto p)
    {
        getCarrinho().add(p);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage (FacesMessage.SEVERITY_INFO, "Sucesso", "O produto foi adicionado ao carrinho."));
        context.getExternalContext().getFlash().setKeepMessages(true);
         
        
        
        utils.Utilidades.salvaRegistroSessao("carrinho", getCarrinho());
    }
    
    public void concluirCompra()
    {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage (FacesMessage.SEVERITY_INFO, "Compra concluída com sucesso!", "Obrigado por comprar conosco!"));
        context.getExternalContext().getFlash().setKeepMessages(true);
    }
    
    public String comprarAgora(Produto p)
    {
        getCarrinho().add(p);
        
        utils.Utilidades.salvaRegistroSessao("carrinho", getCarrinho());
        
        return "carrinho?faces-redirect=true";
    }
    
    public void subtotal(){
        
    }
    
    public String salvarProduto()
    {
        try 
        {
            String caminho = ((ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext()).getRealPath("/");
            
            File file = new File(caminho + "/resources/imgProdutos/" + imagemProduto.getFileName());
                    
            OutputStream out = new FileOutputStream(file);
            out.write(imagemProduto.getContent());
            out.close();
            
            foto = imagemProduto.getFileName();
            
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage (FacesMessage.SEVERITY_FATAL, "Erro ao salvar a Imagem", "Erro: " + e.getLocalizedMessage()));
        }
        
        Produto p = new Produto();
        
        p.setNome(nome);
        p.setPreco(preco);
        p.setDescricao(descricao);
        p.setFoto(foto);
        p.setQuant(quant);
        
        p = ProdutoDAO.save(p);
        
        if (p == null)
        {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage (FacesMessage.SEVERITY_INFO, "Erro ao Cadastrar", "O cadastro não foi realizado, favor olhar o output!"));
            context.getExternalContext().getFlash().setKeepMessages(true);
        }
        else
        {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage (FacesMessage.SEVERITY_INFO, "Sucesso!", "O Produto " + nome + " foi cadastrado com sucesso!"));
            context.getExternalContext().getFlash().setKeepMessages(true);
        }
        
        return "adminCadastroProdutos?faces-redirect=true";
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

    public UploadedFile getImagemProduto() {
        return imagemProduto;
    }

    public void setImagemProduto(UploadedFile imagemProduto) {
        this.imagemProduto = imagemProduto;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public List<Produto> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(List<Produto> carrinho) {
        this.carrinho = carrinho;
    }
    
    public String getQuant() {
        return quant;
    }

    public void setQuant(String quant) {
        this.quant = quant;
    }
}
