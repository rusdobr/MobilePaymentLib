/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.telnumberident.ruslan;

/**
 *
 * @author ruslan
 */
public final class PhoneMask {

    private final String mask;
    
    public PhoneMask(String mask) {
        this.mask = mask;        
    }
    
    String value() {
        return this.mask;
    }
    
    //@Override
    public String toString() {
        return this.value();
    }    
}
