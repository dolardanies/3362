/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

import java.util.List;

/**
 *
 * @author hcadavid
 */
public class Main {
    
    public static void main(String a[]){
        HostBlackListsValidator hblv=new HostBlackListsValidator();
        List<Integer> blackListOcurrences=hblv.checkHost("200.24.34.55", 40);
        System.out.println("The host was found in the following blacklists:"+blackListOcurrences);
        //Begin
        //BusquedaThread uno= new BusquedaThread();
        //BusquedaThread dos= new BusquedaThread();
        
        //uno.rangos(0, 40000);
        //dos.rangos(40000, 80000);
        
        //uno.start();
        //dos.start();
    }
    
}
