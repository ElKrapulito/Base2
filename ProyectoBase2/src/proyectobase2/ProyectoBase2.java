/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobase2;

import Conexion.Queries;
import java.sql.SQLException;

/**
 *
 * @author eduardobaldivieso
 */
public class ProyectoBase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Queries qs = new Queries();
        System.out.println(qs.getPersonas());
    }
    
}
