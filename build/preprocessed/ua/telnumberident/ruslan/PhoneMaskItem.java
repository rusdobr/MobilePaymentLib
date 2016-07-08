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
final public class PhoneMaskItem {

    private final PhoneMask mask;

    private final PhoneProvider provider;

    /**
     *
     * @param mask
     * @param provider
     */
    public PhoneMaskItem(PhoneMask mask, PhoneProvider provider) {
        this.mask = mask;
        this.provider = provider;
    }
    
    PhoneProvider provider() {
        return this.provider;
    }
    
    PhoneMask mask() {
        return this.mask;
    }
    
    //@Override
    public String toString() {
        return this.mask.toString() + ":" + this.provider.toString();
    }
}
