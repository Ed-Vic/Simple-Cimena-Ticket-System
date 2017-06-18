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
public class ChildCustomer extends Customer {
    
    public ChildCustomer(String first, String last, int age){
        super(first, last);
        setAge(age);
    }
    
    @Override
    public void setAge(int a){
        if((a >= 3) && (a <= 16)){
            age = a;
        }
        else{
            age = 0;
            System.out.println("Invalid age entered. Enter age between 3 and 16");
            System.exit(0);
        }
    }
    
}
