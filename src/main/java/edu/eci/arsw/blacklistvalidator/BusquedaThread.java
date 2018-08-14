/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

/**
 *
 * @author 2104481
 */
public class BusquedaThread extends Thread{
    
    int num_ini;
    int num_fin;
    
    @Override
    public void run(){
        for (int i=num_ini; i<=num_fin;i++){
            System.out.println("Busqueda de un segmento del conjunto de servidores");
            
        }
        
    }
    
       
    
}
