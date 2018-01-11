/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lisa.latihanmvcjdbc.service;

import edu.lisa.latihanmvcjdbc.entity.Pelanggan;
import edu.lisa.latihanmvcjdbc.error.PelangganException;

/**
 *
 * @author Lisa Setia Lestari_10116533_PBO12
 */
public interface PelanngganDao {
    
    pulic void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    
    pulic void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    
    pulic void deletePelanggan(Integer id) throws PelangganException;
    
    pubic pelanggan getp
    
    pulic Pelanggan getPelanggan(String email) throws PelangganException;
    
    pulic List<Pelanggan> selectAllPelangga() throws PelangganException;
    
    
}
