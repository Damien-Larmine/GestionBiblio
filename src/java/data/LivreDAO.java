/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entite.Livre;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Damien
 */
public class LivreDAO extends HibernateDaoSupport implements ILivreDAO{

    public void save(Livre l) {
        getHibernateTemplate().save(l);
    }

    public void update(Livre l) {
        getHibernateTemplate().update(l);
    }

    public void delete(Livre l) {
        getHibernateTemplate().delete(l);
    }

    public Livre findByLivreId(String livreId) {
        List list = getHibernateTemplate().find(
                      "from Livre where idLivre=?",livreId
                );
		return (Livre)list.get(0);
    }
    
    public List findAll(){
        List livList = getHibernateTemplate().find("from Livre");
        return livList;
    }
}
