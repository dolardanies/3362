/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

import java.util.LinkedList;

/**
 *
 * @author 2104481
 */
public class BusquedaThread extends Thread{
    
    private static final int BLACK_LIST_ALARM_COUNT=5;
    int num_ini;
    int num_fin;
    LinkedList<Integer> OcurrenciasListaNegra=new LinkedList<>();
    int num_ocurrencias;
    
    @Override
    public void run(){
        for (int i=num_ini; i<=num_fin && num_ocurrencias<BLACK_LIST_ALARM_COUNT;i++){
            System.out.println("Busqueda de un segmento del conjunto de servidores");
            if (skds.isInBlackListServer(i, ipaddress)){
                
                OcurrenciasListaNegra.add(i);
                num_ocurrencias++;
            }
            
        }
    }
    
    public void rangos(int ini, int fin){
        this.num_ini=ini;
        this.num_fin=fin;
        System.out.println("Rango de inicio a fin de la lista total");
    }
       
    
}
