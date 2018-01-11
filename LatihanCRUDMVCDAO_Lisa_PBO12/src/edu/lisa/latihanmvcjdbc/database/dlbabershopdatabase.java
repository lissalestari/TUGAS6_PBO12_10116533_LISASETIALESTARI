/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lisa.latihanmvcjdbc.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.lisa.latihanmvcjdbc.entity.Pelanggan;
import edu.lisa.latihanmvcjdbc.implement.PelangganDaoImplement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Lisa Setia Lestari_10116533_PBO12
 */
public class dlbabershopdatabase {
    
    private static Connection connection;
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws SQLException {
        if (connection==null){
        
            MysqlDataSource datasource = new MysqlDataSource();
            datasource.setURL("jdbc:mysql://localhost:3306/dlbabershop");
            datasource.setUser("root");
            datasource.setPassword("");
            connection = datasource.getConnection();
                    
        }
        return connection;
     
    }
    
    public static PelangganDao getpelangganDao () throws SQLException{
        if (pelangganDao==null);
            pelangganDao = new PelangganDaoImplement(getConnection());
       
        return pelangganDao
                
    }
    
}

