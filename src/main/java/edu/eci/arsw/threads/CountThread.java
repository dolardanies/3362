/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author 2104481
 */
public class CountThread extends Thread{
    int A;
    int B;
    CountThread(int a, int b){
        this.A=a;
        this.B=b;              
    }
    public void run(){
       while (A<=B){
           System.out.println(A);
           A+=1;
       }
    }
}
    

