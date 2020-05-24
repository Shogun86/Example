/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.model;

/**
 *
 * @author dziubasy
 */
public class AccountBusiness {
    
    String nazwaFirmy;
    String nip;
    int stanKonta;

    public AccountBusiness(String nazwaFirmy, String nip, int stanKonta) {
        this.nazwaFirmy = nazwaFirmy;
        this.nip = nip;
        this.stanKonta = stanKonta;
    }

    
    public String getNazwaFirmy() {
        return nazwaFirmy;
    }

    public void setNazwaFirmy(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public int getStanKonta() {
        return stanKonta;
    }

    public void setStanKonta(int stanKonta) {
        this.stanKonta = stanKonta;
    }
    
    
    
    
    
}
