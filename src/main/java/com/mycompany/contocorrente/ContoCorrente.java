/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contocorrente;

/**
 *
 * @author lanari.matteo
 */
public class ContoCorrente {
    private String iban;
    private float canone;
    public float saldo = 0;
    private float[] movimenti = new float[100];
    private int i = 0;
    private int nV = 0;
    private int nP = 0;
    private float versamentoM = 0;
    private float prelievoM = 0;
    public float nvMax = 0;
    public float npMax = 0;
    
    public ContoCorrente(String iban, float canone)
    {
        this.iban = iban;
        this.canone = canone;
        this.saldo = saldo;
    }
    
    public float versamenti(float soldi)
    {       
        saldo += soldi;        
        movimenti[i] = soldi;
        i++;
        nV++;
        versamentoM = soldi/nV;
        if(soldi > nvMax)
        {
            nvMax = soldi;
        }
        return saldo;
        
    }
    
    public boolean prelievo(float soldi)
    {
        if(soldi > saldo)
        {
            return false;
        }
        else
        {
            saldo -= soldi;
            movimenti[i] = - soldi;
            nP++;
            i++;
            prelievoM = soldi/nP;
            if(soldi > npMax)
            {
                npMax = soldi;
            }
        }
        return true; 
    }
    public float getSaldo()
    {
        return saldo;
    }
    public float[] getMovimenti()
    {
        return movimenti;
    }
    public String movimentiToString()
    {
        String s = "";
        for(int y = 0; y <= i; y++)
        {
            if(movimenti[y] > 0)
            {
                s+="versamento: " + movimenti[y]+ "\n";
            }
            else
            {
                s+="prelievo: " + movimenti[y]+ "\n";

            }
        }
        s += "----------------------\n";
        s += i;
        
        return s;
    }
    public int GetnV()
    {
        return nV;
    }
    public int GetnP()
    {
        return nP;
    }
    public float GetVM()
    {
        return versamentoM;
    }
    public float GetPM()
    {
        return prelievoM;
    }
    public float GetnvMax()
    {
        return nvMax;
    }
    public float GetnpMax()
    {
        return npMax;
    }
    
    

}
