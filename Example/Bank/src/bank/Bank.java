/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import bank.model.AccountPerson;
import bank.service.BankService;
import java.util.List;

/**
 *
 * @author dziubasy
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BankService b = new BankService();
        
        b.addPerson(new AccountPerson("Arek", "str", "dwa pl", 123456, 123.45));
        
       // b.removeObject(0);
        
        System.out.println(b.returnList(0));


    }
    
}
