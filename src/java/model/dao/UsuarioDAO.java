package model.dao;

import javax.enterprise.context.Dependent;
import model.entity.Usuario;

/** @author João Vitor Schmidt*/

@Dependent
public class UsuarioDAO extends BaseDao<Usuario>{
    
    public Usuario loginCliente(String email, String senha){
        try {
            return (Usuario) getEntityManager().createNamedQuery("usuario.loginCliente")
                    .setParameter("email", email)
                    .setParameter("senha", senha)
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println("Erro :" + e.getLocalizedMessage());
            return null;
        }
    }
    
}
