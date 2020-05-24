/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.service;

import bank.model.AccountBusiness;
import bank.model.AccountPerson;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dziubasy
 */
public class BankService {
    
    List<Object> listAccount = new ArrayList<>();;
    List<AccountBusiness> listBussiness;

  
    public void addPerson (String accountPerson){
      
      listAccount.add(accountPerson);
    
    }
    
    public String returnList(int i){
        
       return listAccount.get(i).toString();
    }
    
      public AccountPerson removeObjectFromList(int i){
        
       return listAccount.remove(i);
    }

    
}
