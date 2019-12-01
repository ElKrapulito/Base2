/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import queriesDao.PaquetesPsDao;
import queriesDao.PersonaPsDao;
import queriesDao.ProductosPsDao;

/**
 *
 * @author eduardobaldivieso
 */
public class FactoryPsDao extends FactoryDao{

    @Override
    public PersonaDao getPersonaDao() {
        return new PersonaPsDao();
    }

    @Override
    public PaquetesDao getPaquetesDao() {
        return new PaquetesPsDao();
    }
    
    public ProductosDao getProductosDao(){
        return new ProductosPsDao();
    }
    
}
