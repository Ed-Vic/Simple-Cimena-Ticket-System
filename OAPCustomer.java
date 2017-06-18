/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemaprototype;

/**
 *
 * @author Edidiong
 */
public class OAPCustomer extends Customer {
    
    public OAPCustomer(String first, String last, int age){
        super(first, last);
        setAge(age);
    }
    
    @Override
    public void setAge(int a){
        if (a < 64){
            System.out.println("Invalid age entered. Enter age above 63.");
            age = 0;
            System.exit(0);
            
        }
        else{
            age = a;
            
        }
    }
    
}
