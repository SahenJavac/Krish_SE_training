/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geniusmobile.exceptions;

/**
 *
 * @author sahen
 */
public class ColorOutOfStockException extends Exception{
    public ColorOutOfStockException(String message,Exception e){
        super(message,e);
    }
    
}
