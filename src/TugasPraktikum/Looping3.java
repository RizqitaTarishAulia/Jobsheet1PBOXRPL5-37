/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Tarishaulia
 */
public class Looping3 {
    public static void main(String[]args){
       int s=4;
       for(int a=1; a<=5; a++){
           if(a ==1||a ==5){
           for (int b=1;b<=5;b++){
               System.out.print("@");
           }
       }
           else{
               for(int b=1;b<=5;b++){
                   if(b==s){
                       System.out.print("@");
                   }
                   else{System.out.print(" ");
                   }
               }
               s--;
           }
           System.out.println(" ");
       }
   } 
}
