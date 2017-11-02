/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author vrivas
 */
public class operaciones {
    private int num1;
    private int num2;
    private int num3;

    public operaciones(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    
    public  int sumar (int num1, int num2){
        return num1 + num2;
      
    }
    
    public int restar(int num1, int num2){
        return num1 - num2;
    }
            
    public int multi(int num1, int num2){
        return num1 * num2;
    }
}
