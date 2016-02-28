/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import data.IUtilisateurDAO;
import entite.Utilisateur;

/**
 *
 * @author Damien
 */
public class UtilisateurMetier implements IUtilisateurMetier{

    IUtilisateurDAO utilisateurDAO;
    
    public void setUtilisateurDAO(IUtilisateurDAO utilisateurDAO) {
		this.utilisateurDAO = utilisateurDAO;
	}
    public void save(Utilisateur u) {
        utilisateurDAO.save(u);
    }

    public void update(Utilisateur u) {
        utilisateurDAO.update(u);
    }

    public void delete(Utilisateur u) {
        utilisateurDAO.delete(u);
    }

    public Utilisateur findByUtilisateurId(String utilId) {
        return utilisateurDAO.findByUtilisateurId(utilId);
    }
    
}
