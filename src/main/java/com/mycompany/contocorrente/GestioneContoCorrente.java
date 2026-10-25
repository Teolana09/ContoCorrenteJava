/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contocorrente;

/**
 *
 * @author lanari.matteo
 */
public class GestioneContoCorrente {

    public static void main(String[] args) {
        ContoCorrente c1 = new ContoCorrente("IT60 X054 2811 1010 0000 0123 456", 10);
        c1.versamenti(67);
        c1.prelievo(55);
        System.out.println("Il tuo saldo è di :" + c1.getSaldo());
        c1.getMovimenti();
        c1.movimentiToString();
        System.out.println("il numero totale dei prelievi è: " + c1.GetnP());        
        System.out.println("il numero totale dei versamenti è: " + c1.GetnV()); 
        System.out.println("la media dei suoi versamenti è: " + c1.GetVM());
        System.out.println("la media dei suoi prelievi è: " + c1.GetPM());  
        System.out.println("il suo versamento più alto è:" + c1.GetnvMax());
        System.out.println("il suo prelievo più alto è:" + c1.GetnpMax());
        
    }
}
