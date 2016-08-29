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
public final class PhoneNumber {

    private final String number;
    
    public PhoneNumber(String number) {
        this.number = number;        
    }
    
    String value() {
        return this.number;
    }
    
    //@Override
    public String toString() {
        return this.value();
    }
    /**
     *
     * @param object2
     * @return
     */
    public boolean equals(Object object2) {
        return object2 instanceof PhoneNumber && this.number.equals(((PhoneNumber)object2).value());
    }
}
