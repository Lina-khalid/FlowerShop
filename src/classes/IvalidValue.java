/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author st
 */
public class IvalidValue extends Exception {

    
    public IvalidValue(){
        super();
    }
    public IvalidValue(String msg) {
        super(msg);
    }
    
}
