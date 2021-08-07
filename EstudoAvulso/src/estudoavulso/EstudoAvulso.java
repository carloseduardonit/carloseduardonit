/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudoavulso;

import java.util.Scanner;

/**
 *
 * @author casa
 */
public class EstudoAvulso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        int n=1;
        double soma =1;
        while (n >= 1) {
            n = leitor.nextInt();
            
            if (n >= 0) { 
              
              soma+=n;
              
              cont++;
            }
        }
        double media = soma / cont;
        System.out.println(String.format("%.2f",media));
    }
    
}
