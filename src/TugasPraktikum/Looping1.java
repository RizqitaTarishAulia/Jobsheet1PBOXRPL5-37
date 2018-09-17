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
public class Looping1 {
    public static void main(String[] args){
        int x,y;
        
        for(y=1;y<=4;y++){
            for(x=1;x<=4;x++){
                if(y==4||x==1||x==4||y==1){
                    System.out.print("@");
                }
                else
                    System.out.print(" ");
                }
            System.out.println();
            }  
    }
}
