package controller.managebeans;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import model.dao.UsuarioDAO;
import model.entity.UsuarioEntity;

/**
 *
 * @author João Vitor Schmidt
 */
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
    private String telefone;
    private String logradouro;
    private String complemento;
    private String cidade;
    private String numeroCasa;
    
    public List<UsuarioEntity> getTodosDados()
    {
        return UsuarioDAO.getMostrarTodosDados("usuarioB.findAll");
    }
    
    public void salvarCadastro()
    {
        
        UsuarioEntity u = new UsuarioEntity();
        
        u.setNome(nome);
        u.setEmail(email);
        u.setSenha(senha);
        u.setCpf(cpf);
        u.setTelefone(telefone);
        u.setLogradouro(logradouro);
        u.setComplemento(complemento);
        u.setCidade(cidade);
        u.setNumeroCasa(numeroCasa);
        
        u = UsuarioDAO.salvar(u);
        
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
    
    public void loginCliente(){    
        
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

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }
    
}
