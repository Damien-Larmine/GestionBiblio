/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entite.Livre;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import business.ILivreMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Damien
 */
@ManagedBean
@SessionScoped
public class LivreBean implements java.io.Serializable{
    private String livreId;
    private List listeLivres = null;
    private Livre livre;
    private ILivreMetier livreMetier;

    public LivreBean() {
        super();
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        livreMetier = (ILivreMetier)appContext.getBean("livreMetier");
    }

    public String getLivreId() {
        return livreId;
    }

    public void setLivreId(String livreId) {
       this.livreId = livreId;
        if (livreId != null && !livreId.equals("")) {
            if (livreMetier != null) {
               livre = livreMetier.findByLivreId(livreId);
            }
        }
    }

    public List getListeLivres() {
        if (listeLivres == null) {
           listeLivres = livreMetier.findAll(); 
        }
        return listeLivres;
    }

    public void setListeLivres(List listeLivres) {
        this.listeLivres = listeLivres;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public ILivreMetier getLivreMetier() {
        return livreMetier;
    }

    public void setLivreMetier(ILivreMetier livreMetier) {
        this.livreMetier = livreMetier;
    }
    
    public Livre helloWorld(){
        return livreMetier.findByLivreId("1");
    }
}
