package controller.managebeans;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import model.dao.UsuarioDAO;
import model.entity.Usuario;

/** @author João Vitor Schmidt**/
@Named(value = "usuarioB")
@RequestScoped
public class UsuarioB {

    @Inject
    private UsuarioDAO UsuarioDAO;
    
    private Integer id;
    private String nome;
    private String email;
    private String senha;
    private String confirmarSenha;
    private String cpf;
    private String cep;
    
    public List<Usuario> getTodosDados()
    {
        return UsuarioDAO.getAllResults("usuario.findAll");
    }
    
    public void salvarCadastro()
    {
        if(senha.equals(confirmarSenha)){
        Usuario u = new Usuario();
        
        u.setNome(nome);
        u.setEmail(email);
        u.setSenha(senha);
        u.setCpf(cpf);
        u.setCep(cep);
        u.setAdministrador(Boolean.FALSE);
        
        u = UsuarioDAO.save(u);
        
        if (u == null)
        {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage (FacesMessage.SEVERITY_INFO, "O cadastro nÃ£o foi realizado, favor olhar o output!", ""));
        }
        else
        {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage (FacesMessage.SEVERITY_INFO, "O Cliente " + nome + " foi cadastrado com sucesso!", ""));
        }
        }
        else{
           FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage (FacesMessage.SEVERITY_INFO, "As senhas não são iguais!", "")); 
        }
    }
    
    public void loginCliente(){    
        
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
}
