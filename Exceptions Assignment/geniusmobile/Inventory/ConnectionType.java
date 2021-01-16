/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geniusmobile.Inventory;

import geniusmobile.exceptions.OutOfQuantityException;

/**
 *
 * @author sahen
 */
public class ConnectionType {
    
    public void getConnection(int i) throws Exception{
    
        try{
            throw new OutOfQuantityException("Out of stocks");
        
        }catch(OutOfQuantityException e){
        
            throw new Exception("Exception caused by - ", e);
        }
    }
    
}
