/*
 * Classe sem estado extendendo a interface Abstract com métodos padrões
 * Com contexto de persistencia e Gerenciamento de entidades e o nome da unidade do banco.
 */
package bean;

import entidade.Medicos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author claudio
 */
 
@Stateless
public class MedicosFacade extends AbstractFacade<Medicos> {
    @PersistenceContext(unitName = "atendimentoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MedicosFacade() {
        super(Medicos.class);
    }
    
}
