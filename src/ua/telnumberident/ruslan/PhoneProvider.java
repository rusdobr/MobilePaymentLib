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
public final class PhoneProvider {
    
    public static final String VODAFONE = "Vodafone";
    public static final String KIEVSTAR = "Kievstar";
    public static final String LIFE = "Life";
    public static final String UTEL = "Utel";
    public static final String PEOPLENET = "PeopleNet";
    public static final String INTERTELEKOM = "InterTelekom";
    
    private final String value;
    
    PhoneProvider(String value) {
        this.value = value;
    }
    
    String value() {
        return this.value;
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
        return object2 instanceof PhoneProvider && this.value.equals(((PhoneProvider)object2).value());
    }
}
