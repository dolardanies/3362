/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

import static java.lang.Runtime.getRuntime;
import java.util.List;

/**
 *
 * @author hcadavid
 */
public class Main {
    
    public static void main(String a[]){
        HostBlackListsValidator hblv=new HostBlackListsValidator();
        getRuntime();
        List<Integer> blackListOcurrences=hblv.checkHost("202.24.34.55",100);
        System.out.println("The host was found in the following blacklists:"+blackListOcurrences);
    }
    
}
