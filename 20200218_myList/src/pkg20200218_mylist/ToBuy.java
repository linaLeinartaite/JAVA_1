/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20200218_mylist;

/**
 *
 * @author Lina
 */
public class ToBuy {
    protected String product;

    public ToBuy(String product) {
        this.product=product;        
    }

    @Override
    public String toString() {
        return "" + product + ' ';
    }
    
}
