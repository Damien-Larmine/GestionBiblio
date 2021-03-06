/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import data.IEmpruntDAO;
import entite.Emprunt;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
/**
 *
 * @author Damien
 */
public class EmpruntMetier implements IEmpruntMetier{

	
	IEmpruntDAO empruntDao;
	
	public void setEmpruntDAO(IEmpruntDAO empruntDAO) {
		this.empruntDao = empruntDAO;
	}

	public void save(Emprunt emp){
		empruntDao.save(emp);
	}
	
	public void update(Emprunt emp){
		empruntDao.update(emp);
	}
	
	public void delete(Emprunt emp){
		empruntDao.delete(emp);
	}
	
	public Emprunt findByEmpruntId(String empruntId){
		return empruntDao.findByEmpruntId(empruntId);
	}
        
        public DataModel getAllEmprunt(){
            return new ListDataModel(empruntDao.findAll());
        }
}
