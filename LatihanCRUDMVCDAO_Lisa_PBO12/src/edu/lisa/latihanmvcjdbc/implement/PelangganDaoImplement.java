/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lisa.latihanmvcjdbc.implement;

import edu.lisa.latihanmvcjdbc.entity.Pelanggan;
import edu.lisa.latihanmvcjdbc.error.PelangganException;
import edu.lisa.latihanmvcjdbc.service.PelanngganDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Lisa Setia Lestari_10116533_PBO12
 */
public class PelangganDaoImplement implements PelanngganDao{
    
    
    private Connection connection;
    
    private final String isertPelaggan = "INSERT INTO PELANGGAN (NAMA,ALAMAT,TELEPON,EMAIL) VALUES (?,?,?,?) ";
    public PelangganDaoImplement(Connection connection) {
        this.connection = connection;
    }
            

    @Override
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException {
        PreparedStatement statement = null;
        try{
           statement = connection.prepareStatement(isertPelaggan);
           statement.setString(1,pelaggan.getnama());
           statement.setString(2,pelaggan.getalamat());
           statement.setString(3,pelaggan.getteleppn());
           statement.setString(4,pelaggan.getemail());
           statement.executeUpdate();
      
        } catch (SQLException e){    
        
            throw new PelangganException(e.getMessage());
            
                    
        } finally {
                
                }
        
    }

    @Override
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePelanggan(Integer id) throws PelangganException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pelanggan getPelanggan(String email) throws PelangganException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void selectAllPelangga() throws PelangganException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
