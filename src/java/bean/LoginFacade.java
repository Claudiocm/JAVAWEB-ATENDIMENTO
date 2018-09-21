package bean;

import entidade.Login;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class LoginFacade extends AbstractFacade<Login> {
    @PersistenceContext(unitName = "atendimentoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LoginFacade() {
        super(Login.class);
    }
    
    public Login encontrarLogin(String nome){
        Query query = em.createNamedQuery("Login.findAll",Login.class).setParameter("login", nome);
        List<Login> logins = query.getResultList();
        
        if(!logins.isEmpty()){
            return logins.get(0);
        }
        
        return null;
    }
}
