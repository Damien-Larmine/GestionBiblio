/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entite.Utilisateur;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Damien
 */
public class UtilisateurDAO extends HibernateDaoSupport implements IUtilisateurDAO{

    public void save(Utilisateur u) {
        getHibernateTemplate().save(u);
    }

    public void update(Utilisateur u) {
        getHibernateTemplate().update(u);
    }
    
    public void delete(Utilisateur u) {
        getHibernateTemplate().save(u);
    }

    public Utilisateur findByUtilisateurId(String utilId) {
        List list = getHibernateTemplate().find(
                      "from Utilisateur u where u.idUtilisateur=?",utilId
                );
		return (Utilisateur)list.get(0);
    }
    
}
