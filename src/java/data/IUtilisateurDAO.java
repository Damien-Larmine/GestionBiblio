/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entite.Utilisateur;
/**
 *
 * @author Damien
 */
public interface IUtilisateurDAO {
    void save(Utilisateur u);
    void update(Utilisateur u);
    void delete(Utilisateur u);
    Utilisateur findByUtilisateurId(String utilId);
}
