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
public class StandardCustomer extends Customer {
    
    public StandardCustomer(String first, String last, int age){
        super(first, last);
        setAge(age);
    }
    
    public void setAge(int a){
        if ((a >= 18) && (a <= 64)){
            age = a;
        } 
        else{
            age = 0;
            System.out.println("Invalid age entered. Enter age between 18 and 63");
            System.exit(0);
        }
    }
}
