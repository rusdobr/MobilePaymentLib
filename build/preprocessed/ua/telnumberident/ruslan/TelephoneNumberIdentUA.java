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
public class TelephoneNumberIdentUA implements ITelephoneProviderIdent {
            
    static private PhoneProvider providersList[] = null;
    
    static private PhoneMaskItem masksList[] = null;
    
    static private void initProvidersList(){
        if (providersList == null) {
            PhoneProvider mts = new PhoneProvider(PhoneProvider.VODAFONE);
            PhoneProvider kievstar = new PhoneProvider(PhoneProvider.KIEVSTAR);
            PhoneProvider life = new PhoneProvider(PhoneProvider.LIFE);
            PhoneProvider utel = new PhoneProvider(PhoneProvider.UTEL);
            PhoneProvider peopleNet = new PhoneProvider(PhoneProvider.PEOPLENET);
            PhoneProvider intertelekom = new PhoneProvider(PhoneProvider.INTERTELEKOM);

            PhoneProvider tmp[] = { mts, kievstar, life, utel, peopleNet, intertelekom};
            providersList = tmp;                        
            PhoneMaskItem tmp2[] = {
                new PhoneMaskItem (new PhoneMask("039 xxx xx xx"), kievstar),
                new PhoneMaskItem (new PhoneMask("050 xxx xx xx"), mts),
                new PhoneMaskItem (new PhoneMask("063 xxx xx xx"), life),
                new PhoneMaskItem (new PhoneMask("066 xxx xx xx"), mts),
                new PhoneMaskItem (new PhoneMask("067 xxx xx xx"), kievstar),
                new PhoneMaskItem (new PhoneMask("068 xxx xx xx"), kievstar),
                new PhoneMaskItem (new PhoneMask("091 xxx xx xx"), utel),
                new PhoneMaskItem (new PhoneMask("092 xxx xx xx"), peopleNet),
                new PhoneMaskItem (new PhoneMask("093 xxx xx xx"), life),
                new PhoneMaskItem (new PhoneMask("094 xxx xx xx"), intertelekom),
                new PhoneMaskItem (new PhoneMask("095 xxx xx xx"), mts),
                new PhoneMaskItem (new PhoneMask("096 xxx xx xx"), kievstar),
                new PhoneMaskItem (new PhoneMask("097 xxx xx xx"), kievstar),
                new PhoneMaskItem (new PhoneMask("098 xxx xx xx"), kievstar),
                new PhoneMaskItem (new PhoneMask("099 xxx xx xx"), mts)
            };            
            masksList = tmp2;
        }
    }
    
   
    protected Object readResolve() {
        return createInstance();
    }
    
    private TelephoneNumberIdentUA(){
        initProvidersList();
    }
    
    private static class LazyInit {
        private static final TelephoneNumberIdentUA instance = new TelephoneNumberIdentUA();
    }

    static public TelephoneNumberIdentUA createInstance() {
        return LazyInit.instance;
    }
    
    /**
     *
     * @param number PhoneNumber
     * @return PhoneProvider[]
     */
    public PhoneProvider[] ident(PhoneNumber number) {
        int amountFound = providersList.length;
        PhoneProvider result[] = new PhoneProvider[amountFound];
        System.arraycopy(providersList, 0, result, 0, amountFound);
        return result;
    }
    
    /**
     * 
     * @param number PhoneNumber
     * @return PhoneMaskItem []
     */
    public PhoneMaskItem[] search(PhoneNumber number) {
        int amountFound = masksList.length;
        PhoneMaskItem result[] = new PhoneMaskItem[amountFound];
        System.arraycopy(masksList, 0, result, 0, amountFound);
        return result;
    }
    /**
     * @return PhoneProvider[]
     */
    public PhoneProvider[] getProviders() {
        int amount = providersList.length;
        PhoneProvider result[] = new PhoneProvider[amount];
        System.arraycopy(providersList, 0, result, 0, amount);
        return result;
    }
}
