/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exmnp_eva2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class ExmnP_Eva2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Piedra papel y tijera contra la computadora
        Scanner cap = new Scanner(System.in);

        int elec;
        int part;
        double comp;
        System.out.println("Numero de partidas:");
        part = cap.nextInt();
        cap.nextLine();
 
        int acum1 = 0;
        int acum2 = 0;
        int acum3 = 0;
        for(int i = 0; i <= part; i++){    
        System.out.println("==================================");
        System.out.println("Piedra = 1,  papel = 2, tijera = 3");
        System.out.println("==================================");
        System.out.println("Introdusca su eleccion: ");
        elec = cap.nextInt();
        cap.nextLine(); 
        
        comp = Math.random();
        System.out.println("La computadora eligio: " + comp);
        
        if(elec == Math.random()){
            System.out.println("Empate");
            acum1= acum1 + 1;
        }else if((elec(1) && comp(2))||(elec(2) && comp(3))||(elec(3) && comp(1))){
            System.out.println("La computadora Gano");
            acum2= acum2 + 1;
        }else if((elec"2" && comp(1))||(elec"3" && comp(2))||(elec"1" && comp(3))){
            System.out.println("Ganaste:");
            acum3= acum3 + 1;
        }
            System.out.println("Marcadorempate: " + acum1 );
            System.out.println("Marcadorcomputadora: " + acum2 );
            System.out.println("Marcadortuyo: " + acum3 );
        }
            
    }
    
}
