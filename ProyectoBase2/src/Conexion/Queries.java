/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author eduardobaldivieso
 */
public class Queries {
    public String getPersonas() throws SQLException{
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from personas");
        String rest = "";
        while(rs.next()){
            rest += rs.getString("nombre") + " "; 
        }
        return rest;
    }
}
