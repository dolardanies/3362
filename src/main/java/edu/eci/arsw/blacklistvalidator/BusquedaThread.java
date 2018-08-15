/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;
import java.util.LinkedList;

/**
 *
 * @author 2104481
 */
public class BusquedaThread extends Thread{
    
    int num_ini;
    int num_fin;
    int ipaddress;
    LinkedList<Integer> OcurrenciasListaNegra=new LinkedList<>();
    int num_ocurrencias;
    HostBlacklistsDataSourceFacade skds=HostBlacklistsDataSourceFacade.getInstance();
    
    @Override
    public void run(){
        for (int i=num_ini; i<=num_fin;i++){
            System.out.println("Busqueda de un segmento del conjunto de servidores");
            if (skds.isInBlackListServer(i, ipaddress)){
                OcurrenciasListaNegra.add(i);
                num_ocurrencias++;
            }
            
        }
    }
    
    public void busqueda(int ini, int fin, int ip){
        this.num_ini=ini;
        this.num_fin=fin;
        this.ipaddress= ip;
        System.out.println("Rango de inicio a fin de la lista total");
    }
       
    
}
