/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entidade.ItensFicha;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author claudio
 */
@Stateless
public class ItensFichaFacade extends AbstractFacade<ItensFicha> {
    @PersistenceContext(unitName = "atendimentoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ItensFichaFacade() {
        super(ItensFicha.class);
    }
    
}
