/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import tablas.Cliente;

/**
 *
 * @author Cordova
 */
public abstract class ClientesDao {
    public abstract Cliente get(String id);

    public abstract List<Cliente> get();

    public abstract void save(Cliente c);

    public abstract void delete(String id);
}
