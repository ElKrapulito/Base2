/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import tablas.Productos;

/**
 *
 * @author eduardobaldivieso
 */
public abstract class ProductosDao {
    
    public abstract Productos get(String id);

    public abstract List<Productos> get();

    public abstract void save(Productos p);

    public abstract void delete(String id);
}
