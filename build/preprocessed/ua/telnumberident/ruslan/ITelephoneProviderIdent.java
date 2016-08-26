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
public interface ITelephoneProviderIdent {
    /**
     * 
     * @param number
     * @return 
     */
    public PhoneProvider[] ident(PhoneNumber number); 
    /**
     * 
     * @param number
     * @return 
     */
    public PhoneMaskItem[] search (PhoneNumber number);
    
    /**
     * @return PhoneProvider[]
     */
    public PhoneProvider[] getProviders();
}
