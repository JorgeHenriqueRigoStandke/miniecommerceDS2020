package controller.managebeans;

/*@author Felipe Girardi Macedo*/

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import model.dao.CadastroDAO;
import model.entity.CadastroEntity;


@Named(value = "cadastroMB")
@RequestScoped
public class CadastroMB {

    @Inject
    private CadastroDAO CadastroDAO;
    
    private Integer id;
    private String nome;
    private String email;
    private String senha;
    private String confirmarSenha;
    private String cpf;
    private String telefone;
    private String logradouro;
    private String complemento;
    private String cidade;
    
    public void salvarCadastro()
    {
        
        CadastroEntity c = new CadastroEntity();
        
        c.setNome(getNome());
        c.setEmail(email);
        c.setSenha(senha);
        c.setTelefone(telefone);
        
        c = CadastroDAO.salvar(c);
        
        if (c == null)
        {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage (FacesMessage.SEVERITY_INFO, "O cadastro não foi realizado, favor olhar o output!", ""));
        }
        else
        {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage (FacesMessage.SEVERITY_INFO, "O Cliente " + getNome() + " cadastrado com sucesso!", ""));
        }
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
   
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    } 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
