/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana2;

import java.util.Scanner;

/**
 *
 * @author PC-12
 */
public class Principal2 {
    public static void main(String[] args) {
        var a=0;
         while(a<10){
             
             System.out.println("a "+a);
             a+=1;
             
         }
     System.out.println(" Ingrese numeros");
     
       var lectura=new Scanner(System.in);
       var numero=lectura.nextInt();
       while (numero>10){
       System.out.println(" Ingrese numeor valido");
       lectura=new Scanner(System.in);
       numero=lectura.nextInt();
       }
       
    }
    
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
        
    }
    
    
    

