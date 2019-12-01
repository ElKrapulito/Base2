/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import tablas.Paquetes;

/**
 *
 * @author eduardobaldivieso
 */
public abstract class PaquetesDao {

    public abstract Paquetes get(String id);

    public abstract List<Paquetes> get();

    public abstract void save(Paquetes p);

    public abstract void delete(String id);
}
