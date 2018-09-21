/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entidade.UnidadeSaude;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author claudio
 */
@Stateless
public class UnidadeSaudeFacade extends AbstractFacade<UnidadeSaude> {
    @PersistenceContext(unitName = "atendimentoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UnidadeSaudeFacade() {
        super(UnidadeSaude.class);
    }
    
}
